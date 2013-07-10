package com.compomics.spectrawl.repository.impl;

import com.compomics.mslims.db.accessors.Spectrum_file;
import com.compomics.mslims.util.fileio.MascotGenericFile;
import com.compomics.spectrawl.config.PropertiesConfigurationHolder;
import com.compomics.spectrawl.repository.MsLimsExperimentRepository;
import com.compomics.spectrawl.logic.filter.noise.NoiseFilter;
import com.compomics.spectrawl.logic.filter.noise.NoiseThresholdFinder;
import com.compomics.spectrawl.model.SpectrumImpl;
import com.compomics.spectrawl.model.mapper.SpectrumFileExctractor;
import com.compomics.spectrawl.util.PeakUtils;
import com.compomics.util.experiment.massspectrometry.Charge;
import com.compomics.util.experiment.massspectrometry.Peak;
import com.compomics.util.experiment.massspectrometry.Precursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA. User: niels Date: 3/02/12 Time: 10:53 To change
 * this template use File | Settings | File Templates.
 */
@Repository("msLimsExperimentRepository")
public class JdbcMsLimsExperimentRepository extends JdbcDaoSupport implements MsLimsExperimentRepository {

    private static final Logger LOGGER = Logger.getLogger(JdbcMsLimsExperimentRepository.class);
    private static final String SELECT_EXPERIMENT_SPECTRUM_FILES = new StringBuilder()
            .append("select sf.l_spectrumid as l_spectrumid, sf.file as file from spectrum s, spectrum_file sf ")
            .append("where s.spectrumid = sf.l_spectrumid ")
            .append("and s.l_projectid = ?").toString();
    private ConcurrentLinkedQueue<Spectrum_file> spectrumFileQueue;
    private boolean doNoiseFiltering;
    @Autowired
    private NoiseThresholdFinder noiseThresholdFinder;
    @Autowired
    private NoiseFilter<HashMap<Double, Peak>> spectrumNoiseFilter;

    public JdbcMsLimsExperimentRepository() {
        doNoiseFiltering = PropertiesConfigurationHolder.getInstance().getBoolean("DO_PROCESS_FILTER");
    }

    @Autowired
    public void setDs(DataSource dataSource) {
        setDataSource(dataSource);
    }

    @Override
    public void setDoNoiseFiltering(boolean doNoiseFiltering) {
        this.doNoiseFiltering = doNoiseFiltering;
    }

    @Override
    public int loadSpectraByExperimentId(long experimentId) {
        LOGGER.debug("Start loading spectra for experiment " + experimentId);
        spectrumFileQueue = getJdbcTemplate().query(SELECT_EXPERIMENT_SPECTRUM_FILES, new SpectrumFileExctractor(), new Object[]{experimentId});
        LOGGER.debug("Finished loading spectra for experiment " + experimentId);
        return spectrumFileQueue.size();
    }

    @Override
    public SpectrumImpl getSpectrum() {
        SpectrumImpl spectrum = null;

        try {
            //poll spectrum_file from queue
            Spectrum_file spectrum_file = spectrumFileQueue.poll();
            String spectumIdString = Long.toString(spectrum_file.getL_spectrumid());

            //generate mascotgenericfile to retrieve peaks
            MascotGenericFile mascotGenericFile = new MascotGenericFile("", new String(spectrum_file.getUnzippedFile()));
            //retrieve peaks
            Map<Double, Double> mSLimsPeaks = mascotGenericFile.getPeaks();

            //create new spectrum
            ArrayList<Charge> possibleCharges = new ArrayList<Charge>();
            possibleCharges.add(new Charge(Charge.PLUS, mascotGenericFile.getCharge()));
            Precursor precursor = new Precursor(0.0, mascotGenericFile.getPrecursorMZ(), mascotGenericFile.getIntensity(), possibleCharges);            

            //convert Map<Double, Double> to HashMap<Double, Peak>
            HashMap<Double, Peak> peaks = new HashMap<Double, Peak>();
            Peak peak = null;
            for (Double mzRatio : mSLimsPeaks.keySet()) {
                peak = new Peak(mzRatio, mSLimsPeaks.get(mzRatio));
                peaks.put(mzRatio, peak);
            }
            
            double noiseThreshold = 0.0;            
            //filter the spectrum if necessary
            if (doNoiseFiltering) {
                //check if noise threshold finder and noise filter are set
                if (spectrumNoiseFilter != null && noiseThresholdFinder != null) {
                    noiseThreshold = noiseThresholdFinder.findNoiseThreshold(PeakUtils.getIntensitiesArray(mSLimsPeaks));
                    peaks = spectrumNoiseFilter.filter(peaks, noiseThreshold);
                } else {
                    throw new IllegalArgumentException("NoiseFilter and/or ThresholdFinder not set");
                }
            }            
            
            spectrum = new SpectrumImpl(spectumIdString, mascotGenericFile.getTitle(), mascotGenericFile.getFilename(), precursor, peaks, noiseThreshold);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }

        return spectrum;
    }
}
