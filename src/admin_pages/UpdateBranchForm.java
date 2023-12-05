package admin_pages;

import extra_features.*;
import web_services.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.*;

public class UpdateBranchForm extends javax.swing.JFrame {

    BranchWebServices_Service branch_service = new BranchWebServices_Service();
    BranchWebServices branch_port = branch_service.getBranchWebServicesPort();
    public static String adminId;
    public static String firstName;
    public static String lastName;
    public static String branchId;

    @SuppressWarnings({"static-access", "UseSpecificCatch", "CallToPrintStackTrace"})
    public UpdateBranchForm(String adminId, String firstName, String lastName, String branchId) {
        this.adminId = adminId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.branchId = branchId;
        initComponents();
        String branchIdStr = branchId;
        int branchIdParam = 0;
        List<String> branch = null;
        if (branchIdStr != null && !branchIdStr.isEmpty()) {
            try {
                branchIdParam = Integer.parseInt(branchIdStr);
                branch = branch_port.selectBranch(branchIdParam);
            } catch (Exception error) {
                error.printStackTrace();
            }
        }
        @SuppressWarnings("null")
        String fullAddress = branch.get(3);
        String[] addressParts = fullAddress.split(",");
        String town = addressParts.length > 0 ? addressParts[0].trim() : "";
        String municipality = addressParts.length > 1 ? addressParts[1].trim() : "";
        String province = addressParts.length > 2 ? addressParts[2].trim() : "";
        txtBranchId.setText(branchId);
        cbxOperationStatus.setSelectedItem(branch.get(1));
        txtBranchName.setText(branch.get(2));
        txtTown.setText(town);
        txtMunicipality.setText(municipality);
        txtProvince.setText(province);
        JTextField[] lettersFields = {
            txtBranchName,
            txtTown,
            txtMunicipality,
            txtProvince
        };
        LettersOnly lettersOnlyFilter = new LettersOnly();
        for (JTextField textField : lettersFields) {
            ((PlainDocument) textField.getDocument()).setDocumentFilter(lettersOnlyFilter);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUpdatePayportExpressBranch = new javax.swing.JLabel();
        panUpdateBranchForm = new java.awt.Panel();
        lblStatusAndName = new javax.swing.JLabel();
        txtBranchName = new javax.swing.JTextField();
        lblBranchName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblTown = new javax.swing.JLabel();
        lblMunicipality = new javax.swing.JLabel();
        lblProvince = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblOperationStatus = new javax.swing.JLabel();
        cbxOperationStatus = new javax.swing.JComboBox<>();
        lblBranchId = new javax.swing.JLabel();
        txtBranchId = new javax.swing.JTextField();
        txtTown = new javax.swing.JTextField();
        txtMunicipality = new javax.swing.JTextField();
        txtProvince = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Branch");
        setResizable(false);

        lblUpdatePayportExpressBranch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUpdatePayportExpressBranch.setText("Update Payport Express Branch");

        panUpdateBranchForm.setBackground(java.awt.SystemColor.controlHighlight);

        lblStatusAndName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStatusAndName.setText("Status and Name");

        lblBranchName.setText("Branch Name:");

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddress.setText("Address");

        lblTown.setText("Town:");

        lblMunicipality.setText("Municipality:");

        lblProvince.setText("Province:");

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblOperationStatus.setText("Operation Status:");

        cbxOperationStatus.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        cbxOperationStatus.setMaximumRowCount(2);
        cbxOperationStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        cbxOperationStatus.setLightWeightPopupEnabled(false);

        lblBranchId.setText("Branch ID:");

        txtBranchId.setEditable(false);

        javax.swing.GroupLayout panUpdateBranchFormLayout = new javax.swing.GroupLayout(panUpdateBranchForm);
        panUpdateBranchForm.setLayout(panUpdateBranchFormLayout);
        panUpdateBranchFormLayout.setHorizontalGroup(
            panUpdateBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUpdateBranchFormLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panUpdateBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panUpdateBranchFormLayout.createSequentialGroup()
                        .addComponent(lblBranchName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBranchName))
                    .addComponent(lblAddress)
                    .addComponent(lblStatusAndName)
                    .addGroup(panUpdateBranchFormLayout.createSequentialGroup()
                        .addGroup(panUpdateBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOperationStatus)
                            .addComponent(lblTown)
                            .addComponent(lblMunicipality)
                            .addComponent(lblProvince))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panUpdateBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTown)
                            .addComponent(cbxOperationStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMunicipality)
                            .addComponent(txtProvince)))
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panUpdateBranchFormLayout.createSequentialGroup()
                        .addComponent(lblBranchId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBranchId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        panUpdateBranchFormLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxOperationStatus, txtBranchId, txtBranchName});

        panUpdateBranchFormLayout.setVerticalGroup(
            panUpdateBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUpdateBranchFormLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panUpdateBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBranchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBranchId))
                .addGap(18, 18, 18)
                .addComponent(lblStatusAndName)
                .addGap(18, 18, 18)
                .addGroup(panUpdateBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBranchName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panUpdateBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOperationStatus)
                    .addComponent(cbxOperationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblAddress)
                .addGap(18, 18, 18)
                .addGroup(panUpdateBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTown)
                    .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panUpdateBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMunicipality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipality))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panUpdateBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProvince))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(panUpdateBranchForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdatePayportExpressBranch))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblUpdatePayportExpressBranch)
                .addGap(26, 26, 26)
                .addComponent(panUpdateBranchForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ManageBranchesView manageBranchesView = new ManageBranchesView(adminId, firstName, lastName);
        manageBranchesView.setLocationRelativeTo(null);
        manageBranchesView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    @SuppressWarnings({"UnnecessaryReturnStatement", "UseSpecificCatch", "CallToPrintStackTrace"})
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String operationStatus = (String) cbxOperationStatus.getSelectedItem();
            String branchName = txtBranchName.getText().trim();
            branchName = NameFormatter.formatName(branchName);
            String town = txtTown.getText().trim();
            town = NameFormatter.formatName(town);
            String municipality = txtMunicipality.getText().trim();
            municipality = NameFormatter.formatName(municipality);
            String province = txtProvince.getText().trim();
            province = NameFormatter.formatName(province);
            String address = town + ", " + municipality + ", " + province;
            try {
                if (branchName.isEmpty() || town.isEmpty() || municipality.isEmpty() || province.isEmpty()) {
                    return;
                } else {
                    branch_port.updateBranch(Integer.parseInt(branchId), operationStatus, branchName, address);
                    ManageBranchesView manageBranchesView = new ManageBranchesView(adminId, firstName, lastName);
                    manageBranchesView.setLocationRelativeTo(null);
                    manageBranchesView.setVisible(true);
                    this.dispose();
                }
            } catch (Exception error) {
                error.printStackTrace();
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBranchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new UpdateBranchForm(adminId, firstName, lastName, branchId).setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxOperationStatus;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBranchId;
    private javax.swing.JLabel lblBranchName;
    private javax.swing.JLabel lblMunicipality;
    private javax.swing.JLabel lblOperationStatus;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JLabel lblStatusAndName;
    private javax.swing.JLabel lblTown;
    private javax.swing.JLabel lblUpdatePayportExpressBranch;
    private java.awt.Panel panUpdateBranchForm;
    private javax.swing.JTextField txtBranchId;
    private javax.swing.JTextField txtBranchName;
    private javax.swing.JTextField txtMunicipality;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtTown;
    // End of variables declaration//GEN-END:variables
}