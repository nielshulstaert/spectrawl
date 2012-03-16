package com.compomics.spectrawl.bin.impl;

import com.compomics.spectrawl.bin.ExperimentBinner;
import com.compomics.spectrawl.model.*;
import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;

import java.util.Set;

/**
 * Created by IntelliJ IDEA. User: niels Date: 14/02/12 Time: 13:48 To change
 * this template use File | Settings | File Templates.
 */
public class ExperimentBinnerImpl implements ExperimentBinner {

    @Override
    public void binExperiment(Experiment experiment) {
        this.binExperiment(experiment, experiment.getExperimentBins().keySet());
    }

    @Override
    public void binExperiment(Experiment experiment, Set<Double> binFloors) {

        DescriptiveStatistics peakCountStatistics = new DescriptiveStatistics();
        DescriptiveStatistics intensitySumStatistics = new DescriptiveStatistics();
        DescriptiveStatistics highestIntensityStatistics = new DescriptiveStatistics();

        //iterate over bins
        for (Double binFloor : binFloors) {
            ExperimentBin experimentBin = experiment.getExperimentBins().get(binFloor);

            //iterate over spectra
            for (SpectrumImpl spectrum : experiment.getSpectra()) {
                SpectrumBin spectrumBin = spectrum.getBins().get(binFloor);
                peakCountStatistics.addValue(spectrumBin.getPeakCount());
                intensitySumStatistics.addValue(spectrumBin.getIntensitySum());
                highestIntensityStatistics.addValue(spectrumBin.getHighestIntensity());
            }

            //add quantiles to experiment bin
            Quantiles peakCountQuantiles = new Quantiles(peakCountStatistics.getMin(), peakCountStatistics.getPercentile(25),
                    peakCountStatistics.getPercentile(50), peakCountStatistics.getPercentile(75), peakCountStatistics.getMax());
            experimentBin.setPeakCountQuantiles(peakCountQuantiles);
            Quantiles intensitySumQuantiles = new Quantiles(intensitySumStatistics.getMin(), intensitySumStatistics.getPercentile(25),
                    intensitySumStatistics.getPercentile(50), intensitySumStatistics.getPercentile(75), intensitySumStatistics.getMax());
            experimentBin.setIntensitySumQuantiles(intensitySumQuantiles);
            Quantiles highestIntensityQuantiles = new Quantiles(highestIntensityStatistics.getMin(), highestIntensityStatistics.getPercentile(25),
                    highestIntensityStatistics.getPercentile(50), highestIntensityStatistics.getPercentile(75), highestIntensityStatistics.getMax());
            experimentBin.setHighestIntensityQuantiles(highestIntensityQuantiles);
            
            //clear DescriptiveStatistics
            peakCountStatistics.clear();
            intensitySumStatistics.clear();
            highestIntensityStatistics.clear();
        }
    }
}
