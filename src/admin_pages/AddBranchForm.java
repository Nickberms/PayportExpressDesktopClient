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
public class AddBranchForm extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        txtBranchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBranchNameActionPerformed(evt);
            }
        });

        lblBranchName.setText("Branch Name:");

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddress.setText("Address");

        lblTown.setText("Town:");

        lblMunicipality.setText("Municipality:");

        lblProvince.setText("Province:");

        txtTown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTownActionPerformed(evt);
            }
        });

        txtMunicipality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMunicipalityActionPerformed(evt);
            }
        });

        txtProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinceActionPerformed(evt);
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

    private void txtProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvinceActionPerformed

    private void txtMunicipalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMunicipalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMunicipalityActionPerformed

    private void txtTownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTownActionPerformed

    private void txtBranchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBranchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBranchNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ManageBranchesView manageBranchesView = new ManageBranchesView();
        manageBranchesView.setLocationRelativeTo(null);
        manageBranchesView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddBranchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBranchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBranchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBranchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBranchForm().setVisible(true);
            }
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
