/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compomics.spectrawl.gui;

import java.awt.GridBagConstraints;

/**
 *
 * @author niels
 */
public class SpectrawlGui extends javax.swing.JFrame {

    private ExperimentLoaderPanel experimentLoaderPanel;
    private AnalyzeFilterPanel analyzeFilterPanel;
    private ProcessFilterPanel processFilterPanel;

    /**
     * Creates new form SpectrawlGui
     */
    public SpectrawlGui() {
        initComponents();

        //add custom components
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;

        experimentLoaderPanel = new ExperimentLoaderPanel(this);
        experimentLoaderParentPanel.add(experimentLoaderPanel, gridBagConstraints);

        analyzeFilterPanel = new AnalyzeFilterPanel(this);
        analyzeFilterParentPanel.add(analyzeFilterPanel, gridBagConstraints);

        processFilterPanel = new ProcessFilterPanel(this);
        processFilterParentPanel.add(processFilterPanel, gridBagConstraints);
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

        filtersTabbedPane = new javax.swing.JTabbedPane();
        processFilterParentPanel = new javax.swing.JPanel();
        analyzeFilterParentPanel = new javax.swing.JPanel();
        experimentLoaderParentPanel = new javax.swing.JPanel();
        experimentBinsParentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0};
        layout.rowHeights = new int[] {0, 10, 0};
        getContentPane().setLayout(layout);

        filtersTabbedPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        processFilterParentPanel.setLayout(new java.awt.GridBagLayout());
        filtersTabbedPane.addTab("process filter", processFilterParentPanel);

        analyzeFilterParentPanel.setLayout(new java.awt.GridBagLayout());
        filtersTabbedPane.addTab("analyze filter", analyzeFilterParentPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.15;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(filtersTabbedPane, gridBagConstraints);

        experimentLoaderParentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        experimentLoaderParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.85;
        gridBagConstraints.weighty = 0.15;
        getContentPane().add(experimentLoaderParentPanel, gridBagConstraints);

        experimentBinsParentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        experimentBinsParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.85;
        gridBagConstraints.weighty = 0.85;
        getContentPane().add(experimentBinsParentPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SpectrawlGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpectrawlGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpectrawlGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpectrawlGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SpectrawlGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel analyzeFilterParentPanel;
    private javax.swing.JPanel experimentBinsParentPanel;
    private javax.swing.JPanel experimentLoaderParentPanel;
    private javax.swing.JTabbedPane filtersTabbedPane;
    private javax.swing.JPanel processFilterParentPanel;
    // End of variables declaration//GEN-END:variables
}
