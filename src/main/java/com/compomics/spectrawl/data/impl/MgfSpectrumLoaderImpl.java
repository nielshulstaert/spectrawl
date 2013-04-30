/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compomics.spectrawl.data.impl;

import com.compomics.spectrawl.config.PropertiesConfigurationHolder;
import com.compomics.spectrawl.data.MgfSpectrumLoader;
import com.compomics.spectrawl.logic.filter.noise.NoiseFilter;
import com.compomics.spectrawl.logic.filter.noise.NoiseThresholdFinder;
import com.compomics.spectrawl.model.SpectrumImpl;
import com.compomics.util.experiment.massspectrometry.SpectrumFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import uk.ac.ebi.jmzml.xml.io.MzMLUnmarshallerException;

/**
 *
 * @author niels
 */
@Repository("mgfSpectrumLoader")
public class MgfSpectrumLoaderImpl implements MgfSpectrumLoader {

    private static final Logger LOGGER = Logger.getLogger(MgfSpectrumLoaderImpl.class);
    private boolean doNoiseFiltering;
    @Autowired
    private NoiseThresholdFinder noiseThresholdFinder;
    @Autowired
    private NoiseFilter noiseFilter;

    public MgfSpectrumLoaderImpl() {
        doNoiseFiltering = PropertiesConfigurationHolder.getInstance().getBoolean("DO_PROCESS_FILTER");
    }

    @Override
    public void setDoNoiseFiltering(boolean doNoiseFiltering) {
        this.doNoiseFiltering = doNoiseFiltering;
    }

    @Override
    public Map<String, List<String>> getSpectrumTitles(Map<String, File> mgfFiles) {
        Map<String, List<String>> spectrumTitles = new HashMap<String, List<String>>();

        for (String mgfFileName : mgfFiles.keySet()) {
            try {
                //add spectra of current mgf file to spectrum factory
                SpectrumFactory.getInstance().addSpectra(mgfFiles.get(mgfFileName));
                spectrumTitles.put(mgfFileName, SpectrumFactory.getInstance().getSpectrumTitles(mgfFileName));
            } catch (FileNotFoundException ex) {
                LOGGER.error(ex.getMessage(), ex);
            } catch (IOException ex) {
                LOGGER.error(ex.getMessage(), ex);
            } catch (ClassNotFoundException ex) {
                LOGGER.error(ex.getMessage(), ex);
            }
        }
        return spectrumTitles;
    }

    @Override
    public SpectrumImpl getSpectrumByKey(String spectrumKey) {
        SpectrumImpl spectrum = null;
        try {
            spectrum = new SpectrumImpl(SpectrumFactory.getInstance().getSpectrum(spectrumKey));
        } catch (IOException ex) {
            LOGGER.error(ex.getMessage(), ex);
        } catch (IllegalArgumentException ex) {
            LOGGER.error(ex.getMessage(), ex);
        } catch (MzMLUnmarshallerException ex) {
            LOGGER.error(ex.getMessage(), ex);
        }
        return spectrum;
    }
}
