package admin_pages;

import web_services.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import net.java.dev.jaxb.array.*;

public class ManageBranchesView extends javax.swing.JFrame {

    BranchWebServices_Service branch_service = new BranchWebServices_Service();
    BranchWebServices branch_port = branch_service.getBranchWebServicesPort();
    public static String adminId;
    public static String firstName;
    public static String lastName;

    private void populateBranchesTable() {
        List<StringArray> branchArray = branch_port.selectAllBranches();
        List<String[]> branches = new ArrayList<>();
        for (StringArray branchStringArray : branchArray) {
            branches.add(branchStringArray.getItem().toArray(new String[0]));
        }
        String keyword = txtSearchBranches.getText();
        if (keyword != null) {
            keyword = keyword.toLowerCase();
        }
        DefaultTableModel model = (DefaultTableModel) tblBranchesView.getModel();
        model.setRowCount(0);
        for (String[] branch : branches) {
            boolean matchesKeyword = true;
            if (keyword != null && !keyword.trim().isEmpty()) {
                matchesKeyword = false;
                for (String field : branch) {
                    if (field != null && field.toLowerCase().contains(keyword)) {
                        matchesKeyword = true;
                        break;
                    }
                }
            }
            if (matchesKeyword) {
                Object[] row = new Object[]{
                    branch[0],
                    branch[1],
                    branch[2],
                    branch[3]
                };
                model.addRow(row);
            }
        }
    }

    @SuppressWarnings("static-access")
    public ManageBranchesView(String adminId, String firstName, String lastName) {
        this.adminId = adminId;
        this.firstName = firstName;
        this.lastName = lastName;
        initComponents();
        lblWelcome.setText("Welcome, " + firstName + " " + lastName);
        lblAdminId.setText("Admin ID: " + adminId);
        populateBranchesTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBranchesView = new javax.swing.JTable();
        panAdminDetails = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblAdminId = new javax.swing.JLabel();
        btnGoToEmployeesTable = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        panManageBranches = new javax.swing.JPanel();
        btnUpdateBranch = new javax.swing.JButton();
        btnDeleteBranch = new javax.swing.JButton();
        lblSearchBranches = new javax.swing.JLabel();
        txtSearchBranches = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAddBranch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Branches");
        setResizable(false);

        tblBranchesView.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
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

        panAdminDetails.setBackground(java.awt.SystemColor.controlHighlight);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblWelcome.setText("Welcome");

        lblAdminId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAdminId.setText("Admin ID:");

        btnGoToEmployeesTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGoToEmployeesTable.setText("Go to Employees Table");
        btnGoToEmployeesTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToEmployeesTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAdminDetailsLayout = new javax.swing.GroupLayout(panAdminDetails);
        panAdminDetails.setLayout(panAdminDetailsLayout);
        panAdminDetailsLayout.setHorizontalGroup(
            panAdminDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAdminDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAdminDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAdminDetailsLayout.createSequentialGroup()
                        .addGroup(panAdminDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWelcome)
                            .addComponent(lblAdminId))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnGoToEmployeesTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panAdminDetailsLayout.setVerticalGroup(
            panAdminDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAdminDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdminId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGoToEmployeesTable)
                .addContainerGap())
        );

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
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

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
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
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(btnSearch))
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
                        .addComponent(panAdminDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(panManageBranches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnLogout)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panManageBranches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panAdminDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBranchActionPerformed
        int selectedRow = tblBranchesView.getSelectedRow();
        if (selectedRow != -1) {
            String branchId = (String) tblBranchesView.getValueAt(selectedRow, 0);
            UpdateBranchForm updateBranchForm = new UpdateBranchForm(adminId, firstName, lastName, branchId);
            updateBranchForm.setLocationRelativeTo(null);
            updateBranchForm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnUpdateBranchActionPerformed

    private void btnDeleteBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBranchActionPerformed
        int selectedRow = tblBranchesView.getSelectedRow();
        if (selectedRow != -1) {
            String branchIdParam = (String) tblBranchesView.getValueAt(selectedRow, 0);
            int branchId = Integer.parseInt(branchIdParam);
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Delete branch? Make sure it does not hold any records anymore",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                branch_port.deleteBranch(branchId);
                populateBranchesTable();
            }
        }
    }//GEN-LAST:event_btnDeleteBranchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        populateBranchesTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        public_pages.AdminLogin adminLogin = new public_pages.AdminLogin();
        adminLogin.setLocationRelativeTo(null);
        adminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBranchActionPerformed
        AddBranchForm addBranchForm = new AddBranchForm(adminId, firstName, lastName);
        addBranchForm.setLocationRelativeTo(null);
        addBranchForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddBranchActionPerformed

    private void btnGoToEmployeesTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToEmployeesTableActionPerformed
        ManageEmployeesView manageEmployeesView = new ManageEmployeesView(adminId, firstName, lastName);
        manageEmployeesView.setLocationRelativeTo(null);
        manageEmployeesView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoToEmployeesTableActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBranchesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ManageBranchesView(adminId, firstName, lastName).setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBranch;
    private javax.swing.JButton btnDeleteBranch;
    private javax.swing.JButton btnGoToEmployeesTable;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateBranch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdminId;
    private javax.swing.JLabel lblSearchBranches;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel panAdminDetails;
    private javax.swing.JPanel panManageBranches;
    private javax.swing.JTable tblBranchesView;
    private javax.swing.JTextField txtSearchBranches;
    // End of variables declaration//GEN-END:variables
}