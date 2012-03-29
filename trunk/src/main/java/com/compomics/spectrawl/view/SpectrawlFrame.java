/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compomics.spectrawl.view;

import com.compomics.spectrawl.controller.SpectrawlController;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;

/**
 *
 * @author niels
 */
public class SpectrawlFrame extends javax.swing.JFrame {

    /**
     * Creates new form SpectrawlFrame
     */
    public SpectrawlFrame() {
        initComponents();

        SpectrawlController spectrawlController = new SpectrawlController(this);
    }

    public JPanel getAnalyzeFilterParentPanel() {
        return analyzeFilterParentPanel;
    }

    public JPanel getExperimentBinsParentPanel() {
        return experimentBinsParentPanel;
    }

    public JPanel getExperimentLoaderParentPanel() {
        return experimentLoaderParentPanel;
    }

    public JPanel getProcessFilterParentPanel() {
        return processFilterParentPanel;
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
        setTitle("Spectrawl");
        setMinimumSize(new java.awt.Dimension(1200, 1000));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0};
        getContentPane().setLayout(layout);

        filtersTabbedPane.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        filtersTabbedPane.setMinimumSize(new java.awt.Dimension(4, 4));
        filtersTabbedPane.setPreferredSize(new java.awt.Dimension(4, 4));

        processFilterParentPanel.setLayout(new java.awt.GridBagLayout());
        filtersTabbedPane.addTab("process filter", processFilterParentPanel);

        analyzeFilterParentPanel.setLayout(new java.awt.GridBagLayout());
        filtersTabbedPane.addTab("analyze filter", analyzeFilterParentPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        getContentPane().add(filtersTabbedPane, gridBagConstraints);

        experimentLoaderParentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        experimentLoaderParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 0.25;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(experimentLoaderParentPanel, gridBagConstraints);

        experimentBinsParentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        experimentBinsParentPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 0.75;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
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
            java.util.logging.Logger.getLogger(SpectrawlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpectrawlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpectrawlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpectrawlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SpectrawlFrame().setVisible(true);
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
