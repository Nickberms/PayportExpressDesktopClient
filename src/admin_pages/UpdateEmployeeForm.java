/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_pages;

import extra_features.*;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Kein
 */
public class UpdateEmployeeForm extends javax.swing.JFrame {

    /**
     * Creates new form UpdateEmployeeForm
     */
    public UpdateEmployeeForm() {
        initComponents();
        JTextField[] lettersFields = {
            txtFirstName,
            txtLastName,
            txtTown,
            txtMunicipality,
            txtProvince
        };
        LettersOnly lettersOnlyFilter = new LettersOnly();
        for (JTextField textField : lettersFields) {
            ((PlainDocument) textField.getDocument()).setDocumentFilter(lettersOnlyFilter);
        }
        PlainDocument phoneNumberFilter = (PlainDocument) txtPhoneNumber.getDocument();
        phoneNumberFilter.setDocumentFilter(new NumbersOnly(15));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUpdatePayportExpressEmployee = new javax.swing.JLabel();
        panLeftComponents = new java.awt.Panel();
        lblBranchAndStatus = new javax.swing.JLabel();
        cbxBranchStation = new javax.swing.JComboBox<>();
        lblBranchStation = new javax.swing.JLabel();
        lblBasicInformation = new javax.swing.JLabel();
        lblEmployeeId = new javax.swing.JLabel();
        txtEmployeeId = new javax.swing.JTextField();
        lblWorkingStatus = new javax.swing.JLabel();
        cbxWorkingStatus = new javax.swing.JComboBox<>();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblBirthdate = new javax.swing.JLabel();
        dteBirthdate = new com.toedter.calendar.JDateChooser();
        lblSex = new javax.swing.JLabel();
        cbxSex = new javax.swing.JComboBox<>();
        panRightComponents = new java.awt.Panel();
        lblAddress = new javax.swing.JLabel();
        txtMunicipality = new javax.swing.JTextField();
        txtTown = new javax.swing.JTextField();
        lblMunicipality = new javax.swing.JLabel();
        lblTown = new javax.swing.JLabel();
        lblProvince = new javax.swing.JLabel();
        txtProvince = new javax.swing.JTextField();
        lblCredentials = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblEmailAddress = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Employee");
        setResizable(false);

        lblUpdatePayportExpressEmployee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUpdatePayportExpressEmployee.setText("Update Payport Express Employee");

        panLeftComponents.setBackground(java.awt.SystemColor.controlHighlight);

        lblBranchAndStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBranchAndStatus.setText("Branch and Status");

        cbxBranchStation.setMaximumRowCount(1);
        cbxBranchStation.setLightWeightPopupEnabled(false);
        cbxBranchStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBranchStationActionPerformed(evt);
            }
        });

        lblBranchStation.setText("Branch Station:");

        lblBasicInformation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBasicInformation.setText("Basic Information");

        lblEmployeeId.setText("Employee ID:");

        txtEmployeeId.setEditable(false);
        txtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIdActionPerformed(evt);
            }
        });

        lblWorkingStatus.setText("Working Status:");

        cbxWorkingStatus.setMaximumRowCount(3);
        cbxWorkingStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "On Leave", "Fired" }));
        cbxWorkingStatus.setLightWeightPopupEnabled(false);
        cbxWorkingStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxWorkingStatusActionPerformed(evt);
            }
        });

        lblFirstName.setText("First Name:");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblLastName.setText("Last Name:");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        lblBirthdate.setText("Birthdate:");

        dteBirthdate.setDateFormatString("dd/MM/yyyy");
        dteBirthdate.setFocusable(false);

        lblSex.setText("Sex:");

        cbxSex.setMaximumRowCount(2);
        cbxSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbxSex.setLightWeightPopupEnabled(false);
        cbxSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLeftComponentsLayout = new javax.swing.GroupLayout(panLeftComponents);
        panLeftComponents.setLayout(panLeftComponentsLayout);
        panLeftComponentsLayout.setHorizontalGroup(
            panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLeftComponentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLeftComponentsLayout.createSequentialGroup()
                        .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSex)
                            .addComponent(lblLastName)
                            .addComponent(lblFirstName)
                            .addComponent(lblBranchStation)
                            .addComponent(lblWorkingStatus)
                            .addComponent(lblEmployeeId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dteBirthdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxWorkingStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxBranchStation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployeeId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblBasicInformation)
                    .addComponent(lblBranchAndStatus))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panLeftComponentsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxBranchStation, cbxSex, cbxWorkingStatus, dteBirthdate, txtEmployeeId, txtFirstName, txtLastName});

        panLeftComponentsLayout.setVerticalGroup(
            panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLeftComponentsLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeId))
                .addGap(18, 18, 18)
                .addComponent(lblBranchAndStatus)
                .addGap(18, 18, 18)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBranchStation)
                    .addComponent(cbxBranchStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWorkingStatus)
                    .addComponent(cbxWorkingStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblBasicInformation)
                .addGap(18, 18, 18)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dteBirthdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panLeftComponentsLayout.createSequentialGroup()
                        .addComponent(lblBirthdate)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSex))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        panRightComponents.setBackground(java.awt.SystemColor.controlHighlight);

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddress.setText("Address");

        txtMunicipality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMunicipalityActionPerformed(evt);
            }
        });

        txtTown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTownActionPerformed(evt);
            }
        });

        lblMunicipality.setText("Municipality:");

        lblTown.setText("Town:");

        lblProvince.setText("Province:");

        txtProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinceActionPerformed(evt);
            }
        });

        lblCredentials.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCredentials.setText("Credentials");

        lblPhoneNumber.setText("Phone Number:");

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        lblEmailAddress.setText("Email Address:");

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        lblPassword.setText("Password:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panRightComponentsLayout = new javax.swing.GroupLayout(panRightComponents);
        panRightComponents.setLayout(panRightComponentsLayout);
        panRightComponentsLayout.setHorizontalGroup(
            panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRightComponentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panRightComponentsLayout.createSequentialGroup()
                        .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailAddress)
                            .addComponent(lblPassword)
                            .addComponent(lblPhoneNumber)
                            .addComponent(lblMunicipality)
                            .addComponent(lblProvince))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMunicipality, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblCredentials)
                    .addComponent(lblTown)
                    .addComponent(lblAddress)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        panRightComponentsLayout.setVerticalGroup(
            panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRightComponentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblAddress)
                .addGap(18, 18, 18)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMunicipality)
                    .addComponent(txtMunicipality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProvince)
                    .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblCredentials)
                .addGap(18, 18, 18)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailAddress)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panLeftComponents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(panRightComponents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUpdatePayportExpressEmployee))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblUpdatePayportExpressEmployee)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panLeftComponents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panRightComponents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ManageEmployeesView manageEmployeesView = new ManageEmployeesView();
        manageEmployeesView.setLocationRelativeTo(null);
        manageEmployeesView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIdActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtTownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTownActionPerformed

    private void txtMunicipalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMunicipalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMunicipalityActionPerformed

    private void txtProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvinceActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void cbxSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexActionPerformed

    private void cbxBranchStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBranchStationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxBranchStationActionPerformed

    private void cbxWorkingStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxWorkingStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxWorkingStatusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxBranchStation;
    private javax.swing.JComboBox<String> cbxSex;
    private javax.swing.JComboBox<String> cbxWorkingStatus;
    private com.toedter.calendar.JDateChooser dteBirthdate;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBasicInformation;
    private javax.swing.JLabel lblBirthdate;
    private javax.swing.JLabel lblBranchAndStatus;
    private javax.swing.JLabel lblBranchStation;
    private javax.swing.JLabel lblCredentials;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMunicipality;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblTown;
    private javax.swing.JLabel lblUpdatePayportExpressEmployee;
    private javax.swing.JLabel lblWorkingStatus;
    private java.awt.Panel panLeftComponents;
    private java.awt.Panel panRightComponents;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMunicipality;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtTown;
    // End of variables declaration//GEN-END:variables
}
