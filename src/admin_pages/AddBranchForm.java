package admin_pages;

import extra_features.*;
import web_services.*;
import javax.swing.*;
import javax.swing.text.*;

public class AddBranchForm extends javax.swing.JFrame {

    BranchWebServices_Service branch_service = new BranchWebServices_Service();
    BranchWebServices branch_port = branch_service.getBranchWebServicesPort();

    public AddBranchForm() {
        initComponents();
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

        panAddNewBranchForm = new java.awt.Panel();
        lblName = new javax.swing.JLabel();
        txtBranchName = new javax.swing.JTextField();
        lblBranchName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblTown = new javax.swing.JLabel();
        lblMunicipality = new javax.swing.JLabel();
        lblProvince = new javax.swing.JLabel();
        txtTown = new javax.swing.JTextField();
        txtMunicipality = new javax.swing.JTextField();
        txtProvince = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblAddNewPayportExpressBranch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Branch");
        setResizable(false);

        panAddNewBranchForm.setBackground(java.awt.SystemColor.controlHighlight);

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setText("Name");

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

        javax.swing.GroupLayout panAddNewBranchFormLayout = new javax.swing.GroupLayout(panAddNewBranchForm);
        panAddNewBranchForm.setLayout(panAddNewBranchFormLayout);
        panAddNewBranchFormLayout.setHorizontalGroup(
            panAddNewBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddNewBranchFormLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panAddNewBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panAddNewBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panAddNewBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblAddress)
                            .addGroup(panAddNewBranchFormLayout.createSequentialGroup()
                                .addGroup(panAddNewBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMunicipality)
                                    .addComponent(lblProvince)
                                    .addComponent(lblTown)
                                    .addComponent(lblBranchName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panAddNewBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProvince)
                                    .addComponent(txtMunicipality)
                                    .addComponent(txtBranchName)
                                    .addComponent(txtTown))))
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        panAddNewBranchFormLayout.setVerticalGroup(
            panAddNewBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddNewBranchFormLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblName)
                .addGap(18, 18, 18)
                .addGroup(panAddNewBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBranchName))
                .addGap(18, 18, 18)
                .addComponent(lblAddress)
                .addGap(18, 18, 18)
                .addGroup(panAddNewBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAddNewBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMunicipality)
                    .addComponent(txtMunicipality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAddNewBranchFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProvince)
                    .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addGap(18, 18, 18))
        );

        lblAddNewPayportExpressBranch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddNewPayportExpressBranch.setText("Add New Payport Express Branch");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(panAddNewBranchForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddNewPayportExpressBranch))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblAddNewPayportExpressBranch)
                .addGap(26, 26, 26)
                .addComponent(panAddNewBranchForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings({"UnnecessaryReturnStatement", "CallToPrintStackTrace"})
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
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
                    branch_port.insertNewBranch(branchName, address);
                    this.dispose();
                }
            } catch (Exception error) {
                error.printStackTrace();
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBranchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AddBranchForm().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddNewPayportExpressBranch;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBranchName;
    private javax.swing.JLabel lblMunicipality;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JLabel lblTown;
    private java.awt.Panel panAddNewBranchForm;
    private javax.swing.JTextField txtBranchName;
    private javax.swing.JTextField txtMunicipality;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtTown;
    // End of variables declaration//GEN-END:variables
}