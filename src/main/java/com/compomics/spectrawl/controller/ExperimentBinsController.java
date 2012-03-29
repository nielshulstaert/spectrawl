/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compomics.spectrawl.controller;

import com.compomics.spectrawl.model.Experiment;
import com.compomics.spectrawl.view.ExperimentBinsPanel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import org.apache.log4j.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author niels
 */
public class ExperimentBinsController {

    private static final Logger LOGGER = Logger.getLogger(ExperimentBinsController.class);
    //model
    DefaultCategoryDataset categoryDataset;
    //view
    private ChartPanel chartPanel;
    private ExperimentBinsPanel experimentBinsPanel;
    //parent controller
    private SpectrawlController spectrawlController;

    public ExperimentBinsController(SpectrawlController spectrawlController) {
        chartPanel = new ChartPanel(null);
        experimentBinsPanel = new ExperimentBinsPanel();

        this.spectrawlController = spectrawlController;

        initPanel();
    }

    public ExperimentBinsPanel getExperimentBinsPanel() {
        return experimentBinsPanel;
    }

    public void viewExperimentBins(Experiment experiment) {
        LOGGER.debug("initialize bins chart of experiment");

        //create new data set
        categoryDataset = new DefaultCategoryDataset();

        //add values
        for (Double floorBin : experiment.getBins().keySet()) {
            categoryDataset.addValue(experiment.getBins().get(floorBin).getHighestIntensityQuantiles().getPercentile_50(), "highestIntensity", floorBin.toString());
            categoryDataset.addValue(experiment.getBins().get(floorBin).getIntensitySumQuantiles().getPercentile_50(), "intensitySum", floorBin.toString());
            //categoryDataset.addValue(experiment.getBins().get(floorBin).getPeakCountQuantiles().getPercentile_50(), "peakCount", floorBin.toString());
        }
        
        //create chart
        JFreeChart chart = ChartFactory.createBarChart("title", "bin", "relative intensity", categoryDataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        CategoryAxis xAxis = (CategoryAxis) plot.getDomainAxis();
        xAxis.setCategoryLabelPositions(CategoryLabelPositions.DOWN_90);
        
        //add chart to chart panel
        chartPanel.setChart(chart);

        LOGGER.debug("finished initializing bins chart of experiment");
    }
    
    private void initPanel() {
        //add chartPanel                  
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        
        experimentBinsPanel.add(chartPanel, gridBagConstraints);
    }
}
