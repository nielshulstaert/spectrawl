/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compomics.spectrawl.repository;

import com.compomics.spectrawl.model.SpectrumImpl;

/**
 *
 * @author niels
 */
public interface MsLimsExperimentRepository extends ExperimentRepository {

    /**
     * Load all spectra by experiment ID.
     *
     * @param experimentId the experiment ID
     * @return the number of spectra loaded
     */
    int loadSpectraByExperimentId(long experimentId);

    /**
     * Get the spectrum to process. This method is thread safe.
     *
     * @return the spectra
     */
    SpectrumImpl getSpectrum();
}