/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_pages;

import public_pages.AdminLogin;
import public_pages.EmployeeLogin;

/**
 *
 * @author Kein
 */
public class ManageBranchesView extends javax.swing.JFrame {

    /**
     * Creates new form ManageTransactionsView
     */
    public ManageBranchesView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBranchesView = new javax.swing.JTable();
        panBranchesAdminDetails = new javax.swing.JPanel();
        lblBranchesWelcomeAdmin = new javax.swing.JLabel();
        lblBranchesAdminId = new javax.swing.JLabel();
        btnGoToEmployeesTable = new javax.swing.JButton();
        btnBranchesAdminLogout = new javax.swing.JButton();
        panManageBranches = new javax.swing.JPanel();
        btnUpdateBranch = new javax.swing.JButton();
        btnDeleteBranch = new javax.swing.JButton();
        lblSearchBranches = new javax.swing.JLabel();
        txtSearchBranches = new javax.swing.JTextField();
        btnSearchBranches = new javax.swing.JButton();
        btnAddBranch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Branches");
        setResizable(false);

        tblBranchesView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Branch ID", "Operation Status", "Branch Name", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBranchesView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblBranchesView.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblBranchesView.getTableHeader().setResizingAllowed(false);
        tblBranchesView.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblBranchesView);
        if (tblBranchesView.getColumnModel().getColumnCount() > 0) {
            tblBranchesView.getColumnModel().getColumn(0).setResizable(false);
            tblBranchesView.getColumnModel().getColumn(0).setPreferredWidth(25);
            tblBranchesView.getColumnModel().getColumn(1).setResizable(false);
            tblBranchesView.getColumnModel().getColumn(1).setPreferredWidth(60);
            tblBranchesView.getColumnModel().getColumn(2).setResizable(false);
            tblBranchesView.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblBranchesView.getColumnModel().getColumn(3).setResizable(false);
            tblBranchesView.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        panBranchesAdminDetails.setBackground(java.awt.SystemColor.controlHighlight);

        lblBranchesWelcomeAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBranchesWelcomeAdmin.setText("Welcome");

        lblBranchesAdminId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBranchesAdminId.setText("Admin ID:");

        btnGoToEmployeesTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGoToEmployeesTable.setText("Go to Employees Table");
        btnGoToEmployeesTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToEmployeesTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBranchesAdminDetailsLayout = new javax.swing.GroupLayout(panBranchesAdminDetails);
        panBranchesAdminDetails.setLayout(panBranchesAdminDetailsLayout);
        panBranchesAdminDetailsLayout.setHorizontalGroup(
            panBranchesAdminDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBranchesAdminDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBranchesAdminDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBranchesAdminDetailsLayout.createSequentialGroup()
                        .addGroup(panBranchesAdminDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBranchesWelcomeAdmin)
                            .addComponent(lblBranchesAdminId))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnGoToEmployeesTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panBranchesAdminDetailsLayout.setVerticalGroup(
            panBranchesAdminDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBranchesAdminDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBranchesWelcomeAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBranchesAdminId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGoToEmployeesTable)
                .addContainerGap())
        );

        btnBranchesAdminLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBranchesAdminLogout.setText("Logout");
        btnBranchesAdminLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchesAdminLogoutActionPerformed(evt);
            }
        });

        panManageBranches.setBackground(java.awt.SystemColor.controlHighlight);

        btnUpdateBranch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateBranch.setText("Update Branch");
        btnUpdateBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBranchActionPerformed(evt);
            }
        });

        btnDeleteBranch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeleteBranch.setText("Delete Branch");
        btnDeleteBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBranchActionPerformed(evt);
            }
        });

        lblSearchBranches.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSearchBranches.setText("Search Branches:");

        btnSearchBranches.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearchBranches.setText("Search");
        btnSearchBranches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBranchesActionPerformed(evt);
            }
        });

        btnAddBranch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddBranch.setText("Add Branch");
        btnAddBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBranchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panManageBranchesLayout = new javax.swing.GroupLayout(panManageBranches);
        panManageBranches.setLayout(panManageBranchesLayout);
        panManageBranchesLayout.setHorizontalGroup(
            panManageBranchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManageBranchesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panManageBranchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panManageBranchesLayout.createSequentialGroup()
                        .addComponent(lblSearchBranches)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAddBranch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panManageBranchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateBranch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchBranches))
                .addGap(18, 18, 18)
                .addGroup(panManageBranchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteBranch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchBranches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panManageBranchesLayout.setVerticalGroup(
            panManageBranchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManageBranchesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panManageBranchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateBranch)
                    .addComponent(btnDeleteBranch)
                    .addComponent(btnAddBranch))
                .addGap(33, 33, 33)
                .addGroup(panManageBranchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchBranches)
                    .addComponent(txtSearchBranches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchBranches))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panBranchesAdminDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(panManageBranches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnBranchesAdminLogout)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBranchesAdminLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panManageBranches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panBranchesAdminDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateBranchActionPerformed

    private void btnDeleteBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteBranchActionPerformed

    private void btnSearchBranchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBranchesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchBranchesActionPerformed

    private void btnBranchesAdminLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchesAdminLogoutActionPerformed
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setLocationRelativeTo(null);
        adminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBranchesAdminLogoutActionPerformed

    private void btnAddBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBranchActionPerformed

    private void btnGoToEmployeesTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToEmployeesTableActionPerformed
        ManageEmployeesView manageEmployeesView = new ManageEmployeesView();
        manageEmployeesView.setLocationRelativeTo(null);
        manageEmployeesView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoToEmployeesTableActionPerformed

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
            java.util.logging.Logger.getLogger(ManageBranchesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBranchesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBranchesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBranchesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBranchesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBranch;
    private javax.swing.JButton btnBranchesAdminLogout;
    private javax.swing.JButton btnDeleteBranch;
    private javax.swing.JButton btnGoToEmployeesTable;
    private javax.swing.JButton btnSearchBranches;
    private javax.swing.JButton btnUpdateBranch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBranchesAdminId;
    private javax.swing.JLabel lblBranchesWelcomeAdmin;
    private javax.swing.JLabel lblSearchBranches;
    private javax.swing.JPanel panBranchesAdminDetails;
    private javax.swing.JPanel panManageBranches;
    private javax.swing.JTable tblBranchesView;
    private javax.swing.JTextField txtSearchBranches;
    // End of variables declaration//GEN-END:variables
}
