package admin_pages;

import public_pages.*;

public class ManageEmployeesView extends javax.swing.JFrame {

    public static String adminId;
    public static String firstName;
    public static String lastName;

    @SuppressWarnings("static-access")
    public ManageEmployeesView(String adminId, String firstName, String lastName) {
        this.adminId = adminId;
        this.firstName = firstName;
        this.lastName = lastName;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeesView = new javax.swing.JTable();
        panAdminDetails = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblAdminId = new javax.swing.JLabel();
        btnGoToBranchesTable = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        panManageEmployees = new javax.swing.JPanel();
        btnUpdateEmployee = new javax.swing.JButton();
        btnDeleteEmployee = new javax.swing.JButton();
        lblSearchEmployees = new javax.swing.JLabel();
        txtSearchEmployees = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAddEmployee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Employees");
        setResizable(false);

        tblEmployeesView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Branch Stationed", "Working Status", "First Name", "Last Name", "Birthdate", "Sex", "Address", "Phone Number", "Email Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployeesView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblEmployeesView.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblEmployeesView.getTableHeader().setResizingAllowed(false);
        tblEmployeesView.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblEmployeesView);
        if (tblEmployeesView.getColumnModel().getColumnCount() > 0) {
            tblEmployeesView.getColumnModel().getColumn(0).setResizable(false);
            tblEmployeesView.getColumnModel().getColumn(0).setPreferredWidth(25);
            tblEmployeesView.getColumnModel().getColumn(1).setResizable(false);
            tblEmployeesView.getColumnModel().getColumn(1).setPreferredWidth(60);
            tblEmployeesView.getColumnModel().getColumn(2).setResizable(false);
            tblEmployeesView.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblEmployeesView.getColumnModel().getColumn(3).setResizable(false);
            tblEmployeesView.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblEmployeesView.getColumnModel().getColumn(4).setResizable(false);
            tblEmployeesView.getColumnModel().getColumn(4).setPreferredWidth(20);
            tblEmployeesView.getColumnModel().getColumn(5).setResizable(false);
            tblEmployeesView.getColumnModel().getColumn(5).setPreferredWidth(30);
            tblEmployeesView.getColumnModel().getColumn(6).setResizable(false);
            tblEmployeesView.getColumnModel().getColumn(6).setPreferredWidth(1);
            tblEmployeesView.getColumnModel().getColumn(7).setResizable(false);
            tblEmployeesView.getColumnModel().getColumn(7).setPreferredWidth(100);
            tblEmployeesView.getColumnModel().getColumn(8).setResizable(false);
            tblEmployeesView.getColumnModel().getColumn(8).setPreferredWidth(50);
            tblEmployeesView.getColumnModel().getColumn(9).setResizable(false);
            tblEmployeesView.getColumnModel().getColumn(9).setPreferredWidth(100);
        }

        panAdminDetails.setBackground(java.awt.SystemColor.controlHighlight);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblWelcome.setText("Welcome");

        lblAdminId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAdminId.setText("Admin ID:");

        btnGoToBranchesTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGoToBranchesTable.setText("Go to Branches Table");
        btnGoToBranchesTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToBranchesTableActionPerformed(evt);
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
                    .addComponent(btnGoToBranchesTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btnGoToBranchesTable)
                .addContainerGap())
        );

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        panManageEmployees.setBackground(java.awt.SystemColor.controlHighlight);

        btnUpdateEmployee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateEmployee.setText("Update Employee");
        btnUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmployeeActionPerformed(evt);
            }
        });

        btnDeleteEmployee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeleteEmployee.setText("Delete Employee");
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });

        lblSearchEmployees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSearchEmployees.setText("Search Employees:");

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAddEmployee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddEmployee.setText("Add Employee");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panManageEmployeesLayout = new javax.swing.GroupLayout(panManageEmployees);
        panManageEmployees.setLayout(panManageEmployeesLayout);
        panManageEmployeesLayout.setHorizontalGroup(
            panManageEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManageEmployeesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panManageEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panManageEmployeesLayout.createSequentialGroup()
                        .addComponent(lblSearchEmployees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchEmployees))
                    .addGroup(panManageEmployeesLayout.createSequentialGroup()
                        .addComponent(btnAddEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panManageEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panManageEmployeesLayout.setVerticalGroup(
            panManageEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManageEmployeesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panManageEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateEmployee)
                    .addComponent(btnDeleteEmployee)
                    .addComponent(btnAddEmployee))
                .addGap(33, 33, 33)
                .addGroup(panManageEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchEmployees)
                    .addComponent(txtSearchEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(panManageEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
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
                            .addComponent(panManageEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panAdminDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmployeeActionPerformed
        UpdateEmployeeForm updateEmployeeForm = new UpdateEmployeeForm();
        updateEmployeeForm.setLocationRelativeTo(null);
        updateEmployeeForm.setVisible(true);
    }//GEN-LAST:event_btnUpdateEmployeeActionPerformed

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setLocationRelativeTo(null);
        adminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        AddEmployeeForm addEmployeeForm = new AddEmployeeForm();
        addEmployeeForm.setLocationRelativeTo(null);
        addEmployeeForm.setVisible(true);
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void btnGoToBranchesTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToBranchesTableActionPerformed
        ManageBranchesView manageBranchesView = new ManageBranchesView();
        manageBranchesView.setLocationRelativeTo(null);
        manageBranchesView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoToBranchesTableActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ManageEmployeesView(adminId, firstName, lastName).setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JButton btnGoToBranchesTable;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateEmployee;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdminId;
    private javax.swing.JLabel lblSearchEmployees;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel panAdminDetails;
    private javax.swing.JPanel panManageEmployees;
    private javax.swing.JTable tblEmployeesView;
    private javax.swing.JTextField txtSearchEmployees;
    // End of variables declaration//GEN-END:variables
}