    package com.compomics.spectrawl.logic.bin.impl;

import com.compomics.spectrawl.logic.bin.SpectrumBinner;
import com.compomics.spectrawl.model.BinParams;
import com.compomics.spectrawl.model.PeakBin;
import com.compomics.spectrawl.model.SpectrumImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA. User: niels Date: 28/02/12 Time: 15:04 To change
 * this template use File | Settings | File Templates.
 */
@Component("spectrumBinner")
public class SpectrumBinnerImpl implements SpectrumBinner {

    @Override
    public void binSpectrum(SpectrumImpl spectrum, double floor, double ceiling, double binSize) {
        //init bins
        spectrum.initBins();
        
        Map<Double, TreeMap<Double, PeakBin>> peakBinsMap = getPeakBinsMap(spectrum, floor, ceiling, binSize);
        for(TreeMap<Double, PeakBin> peakBins : peakBinsMap.values()){
            spectrum.addToBins(peakBins);
        }
    }

    @Override
    public Map<Double, TreeMap<Double, PeakBin>> getPeakBinsMap(SpectrumImpl spectrum, double floor, double ceiling, double binSize) {
        Map<Double, TreeMap<Double, PeakBin>> peakBinsMap = new HashMap<Double, TreeMap<Double, PeakBin>>();

        TreeSet<Double> sortedKeys = new TreeSet<Double>(spectrum.getPeakMap().keySet());
        //outer loop
        for (Double outerMass : sortedKeys) {
            TreeMap<Double, PeakBin> peakBins = new TreeMap<Double, PeakBin>();
            initPeakBins(peakBins, floor, ceiling, binSize);
            //inner loop            
            for (Double innerMass : sortedKeys) {
                int charge = spectrum.getPrecursor().getPossibleCharges().get(0).value;
                double massDelta = (innerMass * charge) - (outerMass * charge);                
                //check if mass delta value lies within the bins floor and ceiling
                if ((floor <= massDelta) && (massDelta < ceiling)) {
                    //add to peak bins
                    //addToPeakBins(peakBins, massDelta, spectrum.getPeakMap().get(innerMass).intensity / spectrum.getTotalIntensity());
                    addToPeakBins(peakBins, massDelta, Math.sqrt(spectrum.getPeakMap().get(innerMass).intensity * spectrum.getPeakMap().get(outerMass).intensity) / spectrum.getTotalIntensity());
                } else if (massDelta >= ceiling) {
                    break;
                }
            }
            //add peak bins to map
            peakBinsMap.put(outerMass, peakBins);
        }

        return peakBinsMap;
    }

    /**
     * Add a mass delta to the peakBins in the correct bin
     *
     * @param peakBins the peak bins map
     * @param massDelta the mass delta
     * @param intensity the intensity
     */
    private void addToPeakBins(TreeMap<Double, PeakBin> peakBins, double massDelta, double intensity) {
        Double key = peakBins.floorKey(massDelta);
        PeakBin bin = peakBins.get(key);
        bin.addPeakCount();
        bin.addIntensity(intensity);
    }

    /**
     * Init the peak bins map
     *
     * @param peakBins the PeakBin map
     */
    private void initPeakBins(TreeMap<Double, PeakBin> peakBins, double floor, double ceiling, double binSize) {
        int numberOfBins = (int) ((ceiling - floor) / binSize);
        for (int i = 0; i < numberOfBins; i++) {
            peakBins.put(floor + (i * binSize), new PeakBin());
        }
    }
}
