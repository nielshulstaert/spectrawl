package com.compomics.spectrawl.gui.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author niels
 */
public class MzRatioFilterDialog extends javax.swing.JDialog {

    /**
     * Creates new form FilterConfigDialog
     */
    public MzRatioFilterDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);        
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(parent);
    }

    public JButton getAddMzRatioButton() {
        return addMzRatioButton;
    }

    public JTextField getAddMzRatioTextField() {
        return addMzRatioTextField;
    }

    public JList getMzRatioFilterList() {
        return mzRatioFilterList;
    }

    public JTextField getMzToleranceTextField() {
        return mzToleranceTextField;
    }

    public JButton getRemoveMzRatioButton() {
        return removeMzRatioButton;
    }

    public JTextField getWinsorConstantTextField() {
        return winsorConstantTextField;
    }

    public JTextField getWinsorConvergenceCriterionTextField() {
        return winsorConvergenceCriterionTextField;
    }

    public JCheckBox getWinsorFilterCheckBox() {
        return winsorFilterCheckBox;
    }

    public JTextField getWinsorOutlierLimitTextField() {
        return winsorOutlierLimitTextField;
    }        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FilteSettingsTabbedPane = new javax.swing.JTabbedPane();
        mzRatioFilterPanel = new javax.swing.JPanel();
        mzRatioFilterScrollPane = new javax.swing.JScrollPane();
        mzRatioFilterList = new javax.swing.JList();
        addMzRatioLabel = new javax.swing.JLabel();
        addMzRatioTextField = new javax.swing.JTextField();
        addMzRatioButton = new javax.swing.JButton();
        removeMzRatioButton = new javax.swing.JButton();
        mzToleranceLabel = new javax.swing.JLabel();
        mzToleranceTextField = new javax.swing.JTextField();
        noiseFilterPanel = new javax.swing.JPanel();
        winsorFilterCheckBox = new javax.swing.JCheckBox();
        winsorConstantLabel = new javax.swing.JLabel();
        winsorConstantTextField = new javax.swing.JTextField();
        winsorConvergenceCriterionLabel = new javax.swing.JLabel();
        winsorConvergenceCriterionTextField = new javax.swing.JTextField();
        winsorOutlierLimitLabel = new javax.swing.JLabel();
        winsorOutlierLimitTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mzRatioFilterPanel.setOpaque(false);

        mzRatioFilterScrollPane.setViewportView(mzRatioFilterList);

        addMzRatioLabel.setText("M/Z ratio");

        addMzRatioTextField.setPreferredSize(new java.awt.Dimension(6, 25));

        addMzRatioButton.setText("add");
        addMzRatioButton.setMaximumSize(new java.awt.Dimension(97, 23));
        addMzRatioButton.setMinimumSize(new java.awt.Dimension(97, 23));
        addMzRatioButton.setPreferredSize(new java.awt.Dimension(97, 23));

        removeMzRatioButton.setText("remove");
        removeMzRatioButton.setMaximumSize(new java.awt.Dimension(97, 23));
        removeMzRatioButton.setMinimumSize(new java.awt.Dimension(97, 23));
        removeMzRatioButton.setPreferredSize(new java.awt.Dimension(97, 23));

        mzToleranceLabel.setText("M/Z tolerance");

        mzToleranceTextField.setPreferredSize(new java.awt.Dimension(6, 25));

        javax.swing.GroupLayout mzRatioFilterPanelLayout = new javax.swing.GroupLayout(mzRatioFilterPanel);
        mzRatioFilterPanel.setLayout(mzRatioFilterPanelLayout);
        mzRatioFilterPanelLayout.setHorizontalGroup(
            mzRatioFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mzRatioFilterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mzRatioFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mzRatioFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(mzRatioFilterPanelLayout.createSequentialGroup()
                            .addComponent(mzToleranceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mzToleranceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(mzRatioFilterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mzRatioFilterPanelLayout.createSequentialGroup()
                            .addComponent(addMzRatioLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addMzRatioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mzRatioFilterPanelLayout.createSequentialGroup()
                        .addComponent(addMzRatioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeMzRatioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        mzRatioFilterPanelLayout.setVerticalGroup(
            mzRatioFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mzRatioFilterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mzRatioFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mzToleranceLabel)
                    .addComponent(mzToleranceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mzRatioFilterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mzRatioFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMzRatioLabel)
                    .addComponent(addMzRatioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mzRatioFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMzRatioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeMzRatioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        FilteSettingsTabbedPane.addTab("M/Z ratio filter settings", mzRatioFilterPanel);

        noiseFilterPanel.setOpaque(false);

        winsorFilterCheckBox.setText("do winsorisation filtering");

        winsorConstantLabel.setText("winsorisation constant");

        winsorConstantTextField.setEnabled(false);
        winsorConstantTextField.setPreferredSize(new java.awt.Dimension(60, 25));

        winsorConvergenceCriterionLabel.setText("winsorisation convergence criterion");

        winsorConvergenceCriterionTextField.setEnabled(false);
        winsorConvergenceCriterionTextField.setMinimumSize(new java.awt.Dimension(6, 25));
        winsorConvergenceCriterionTextField.setPreferredSize(new java.awt.Dimension(60, 25));

        winsorOutlierLimitLabel.setText("winsorisation outlier limit");

        winsorOutlierLimitTextField.setEnabled(false);
        winsorOutlierLimitTextField.setMinimumSize(new java.awt.Dimension(6, 25));
        winsorOutlierLimitTextField.setPreferredSize(new java.awt.Dimension(60, 25));

        javax.swing.GroupLayout noiseFilterPanelLayout = new javax.swing.GroupLayout(noiseFilterPanel);
        noiseFilterPanel.setLayout(noiseFilterPanelLayout);
        noiseFilterPanelLayout.setHorizontalGroup(
            noiseFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noiseFilterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(noiseFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(noiseFilterPanelLayout.createSequentialGroup()
                        .addComponent(winsorConvergenceCriterionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(winsorConvergenceCriterionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(noiseFilterPanelLayout.createSequentialGroup()
                        .addComponent(winsorFilterCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(noiseFilterPanelLayout.createSequentialGroup()
                        .addComponent(winsorConstantLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(winsorConstantTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(noiseFilterPanelLayout.createSequentialGroup()
                        .addComponent(winsorOutlierLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(winsorOutlierLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        noiseFilterPanelLayout.setVerticalGroup(
            noiseFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noiseFilterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(winsorFilterCheckBox)
                .addGap(18, 18, 18)
                .addGroup(noiseFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(winsorConstantLabel)
                    .addComponent(winsorConstantTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(noiseFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(winsorConvergenceCriterionLabel)
                    .addComponent(winsorConvergenceCriterionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(noiseFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(winsorOutlierLimitLabel)
                    .addComponent(winsorOutlierLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        FilteSettingsTabbedPane.addTab("Noise filter settings", noiseFilterPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FilteSettingsTabbedPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FilteSettingsTabbedPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane FilteSettingsTabbedPane;
    private javax.swing.JButton addMzRatioButton;
    private javax.swing.JLabel addMzRatioLabel;
    private javax.swing.JTextField addMzRatioTextField;
    private javax.swing.JList mzRatioFilterList;
    private javax.swing.JPanel mzRatioFilterPanel;
    private javax.swing.JScrollPane mzRatioFilterScrollPane;
    private javax.swing.JLabel mzToleranceLabel;
    private javax.swing.JTextField mzToleranceTextField;
    private javax.swing.JPanel noiseFilterPanel;
    private javax.swing.JButton removeMzRatioButton;
    private javax.swing.JLabel winsorConstantLabel;
    private javax.swing.JTextField winsorConstantTextField;
    private javax.swing.JLabel winsorConvergenceCriterionLabel;
    private javax.swing.JTextField winsorConvergenceCriterionTextField;
    private javax.swing.JCheckBox winsorFilterCheckBox;
    private javax.swing.JLabel winsorOutlierLimitLabel;
    private javax.swing.JTextField winsorOutlierLimitTextField;
    // End of variables declaration//GEN-END:variables
}