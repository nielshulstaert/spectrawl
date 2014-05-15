/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compomics.spectrawl.gui.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author Niels Hulstaert
 */
public class ResultPanel extends javax.swing.JPanel {

    /**
     * Creates new form ExperimentBinsPanel
     */
    public ResultPanel() {
        initComponents();
        jScrollPane2.getViewport().setOpaque(false);
        spectrumTable.getTableHeader().setReorderingAllowed(false);
        spectrumTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    }

    public JPanel getCountChartParentPanel() {
        return countChartParentPanel;
    }

    public JPanel getIntensityChartParentPanel() {
        return intensityChartParentPanel;
    }

    public JLabel getExperimentInfoLabel() {
        return experimentInfoLabel;
    }

    public JTable getSpectrumTable() {
        return spectrumTable;
    }

    public JPanel getSpectrumDetailPanel() {
        return spectrumDetailPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        experimentInfoLabelPanel = new javax.swing.JPanel();
        experimentInfoLabel = new javax.swing.JLabel();
        chartsTabbedPane = new javax.swing.JTabbedPane();
        intensityChartParentPanel = new javax.swing.JPanel();
        countChartParentPanel = new javax.swing.JPanel();
        spectraPanel = new javax.swing.JPanel();
        spectrumTablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        spectrumTable = new javax.swing.JTable();
        spectrumDetailPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(20, 20));
        setPreferredSize(new java.awt.Dimension(600, 600));

        experimentInfoLabelPanel.setOpaque(false);
        experimentInfoLabelPanel.setLayout(new java.awt.GridBagLayout());

        experimentInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        experimentInfoLabelPanel.add(experimentInfoLabel, gridBagConstraints);

        chartsTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        chartsTabbedPane.setFocusable(false);
        chartsTabbedPane.setMinimumSize(new java.awt.Dimension(20, 20));
        chartsTabbedPane.setOpaque(true);
        chartsTabbedPane.setPreferredSize(new java.awt.Dimension(20, 20));

        intensityChartParentPanel.setBackground(new java.awt.Color(255, 255, 255));
        intensityChartParentPanel.setLayout(new java.awt.GridBagLayout());
        chartsTabbedPane.addTab("Intensities chart", intensityChartParentPanel);

        countChartParentPanel.setBackground(new java.awt.Color(255, 255, 255));
        countChartParentPanel.setLayout(new java.awt.GridBagLayout());
        chartsTabbedPane.addTab("Count chart", countChartParentPanel);

        spectraPanel.setBackground(new java.awt.Color(255, 255, 255));

        spectrumTablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Spectra"));
        spectrumTablePanel.setOpaque(false);

        spectrumTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(spectrumTable);

        javax.swing.GroupLayout spectrumTablePanelLayout = new javax.swing.GroupLayout(spectrumTablePanel);
        spectrumTablePanel.setLayout(spectrumTablePanelLayout);
        spectrumTablePanelLayout.setHorizontalGroup(
            spectrumTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
            .addGroup(spectrumTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, spectrumTablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        spectrumTablePanelLayout.setVerticalGroup(
            spectrumTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
            .addGroup(spectrumTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(spectrumTablePanelLayout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        spectrumDetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Spectrum detail"));
        spectrumDetailPanel.setOpaque(false);
        spectrumDetailPanel.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout spectraPanelLayout = new javax.swing.GroupLayout(spectraPanel);
        spectraPanel.setLayout(spectraPanelLayout);
        spectraPanelLayout.setHorizontalGroup(
            spectraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spectraPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(spectraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spectrumTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spectrumDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        spectraPanelLayout.setVerticalGroup(
            spectraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spectraPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spectrumTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spectrumDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        chartsTabbedPane.addTab("Spectra", spectraPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(experimentInfoLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chartsTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(experimentInfoLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chartsTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane chartsTabbedPane;
    private javax.swing.JPanel countChartParentPanel;
    private javax.swing.JLabel experimentInfoLabel;
    private javax.swing.JPanel experimentInfoLabelPanel;
    private javax.swing.JPanel intensityChartParentPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel spectraPanel;
    private javax.swing.JPanel spectrumDetailPanel;
    private javax.swing.JTable spectrumTable;
    private javax.swing.JPanel spectrumTablePanel;
    // End of variables declaration//GEN-END:variables
}
