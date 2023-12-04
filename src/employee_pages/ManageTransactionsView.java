package employee_pages;

import public_pages.*;

public class ManageTransactionsView extends javax.swing.JFrame {

    public static String employeeId;
    public static String branchStationed;
    public static String firstName;
    public static String lastName;
    
    @SuppressWarnings("static-access")
    public ManageTransactionsView(String employeeId, String branchStationed, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.branchStationed = branchStationed;
        this.firstName = firstName;
        this.lastName = lastName;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransactionsView = new javax.swing.JTable();
        panEmployeeDetails = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblEmployeeId = new javax.swing.JLabel();
        lblBranchStationed = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        panManageTransactions = new javax.swing.JPanel();
        btnPayServiceFee = new javax.swing.JButton();
        btnSendAmount = new javax.swing.JButton();
        btnWithdrawAmount = new javax.swing.JButton();
        btnDeleteTransaction = new javax.swing.JButton();
        lblSearchTransactions = new javax.swing.JLabel();
        txtSearchTransactions = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Transactions");
        setResizable(false);

        tblTransactionsView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Control Number", "Fee Status", "Service Fee", "Sender", "Sender Contact", "Receiver", "Receiver Contact", "Amount", "Sender Employee", "Receiver Employee", "Branch Sent", "Branch Withdrawn", "Date Sent", "Date Withdrawn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTransactionsView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblTransactionsView.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTransactionsView.getTableHeader().setResizingAllowed(false);
        tblTransactionsView.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblTransactionsView);
        if (tblTransactionsView.getColumnModel().getColumnCount() > 0) {
            tblTransactionsView.getColumnModel().getColumn(0).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(0).setPreferredWidth(55);
            tblTransactionsView.getColumnModel().getColumn(1).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(1).setPreferredWidth(25);
            tblTransactionsView.getColumnModel().getColumn(2).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(2).setPreferredWidth(35);
            tblTransactionsView.getColumnModel().getColumn(3).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(3).setPreferredWidth(5);
            tblTransactionsView.getColumnModel().getColumn(4).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(4).setPreferredWidth(55);
            tblTransactionsView.getColumnModel().getColumn(5).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(5).setPreferredWidth(15);
            tblTransactionsView.getColumnModel().getColumn(6).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblTransactionsView.getColumnModel().getColumn(7).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(7).setPreferredWidth(5);
            tblTransactionsView.getColumnModel().getColumn(8).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(8).setPreferredWidth(65);
            tblTransactionsView.getColumnModel().getColumn(9).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(9).setPreferredWidth(70);
            tblTransactionsView.getColumnModel().getColumn(10).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(10).setPreferredWidth(35);
            tblTransactionsView.getColumnModel().getColumn(11).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(11).setPreferredWidth(65);
            tblTransactionsView.getColumnModel().getColumn(12).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(12).setPreferredWidth(25);
            tblTransactionsView.getColumnModel().getColumn(13).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(13).setPreferredWidth(55);
        }

        panEmployeeDetails.setBackground(java.awt.SystemColor.controlHighlight);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblWelcome.setText("Welcome");

        lblEmployeeId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmployeeId.setText("Employee ID:");

        lblBranchStationed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBranchStationed.setText("Branch Stationed:");

        javax.swing.GroupLayout panEmployeeDetailsLayout = new javax.swing.GroupLayout(panEmployeeDetails);
        panEmployeeDetails.setLayout(panEmployeeDetailsLayout);
        panEmployeeDetailsLayout.setHorizontalGroup(
            panEmployeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEmployeeDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panEmployeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWelcome)
                    .addComponent(lblEmployeeId)
                    .addComponent(lblBranchStationed))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panEmployeeDetailsLayout.setVerticalGroup(
            panEmployeeDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEmployeeDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmployeeId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBranchStationed)
                .addContainerGap())
        );

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        panManageTransactions.setBackground(java.awt.SystemColor.controlHighlight);

        btnPayServiceFee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPayServiceFee.setText("Pay Service Fee");
        btnPayServiceFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayServiceFeeActionPerformed(evt);
            }
        });

        btnSendAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSendAmount.setText("Send Amount");
        btnSendAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendAmountActionPerformed(evt);
            }
        });

        btnWithdrawAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnWithdrawAmount.setText("Withdraw Amount");
        btnWithdrawAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawAmountActionPerformed(evt);
            }
        });

        btnDeleteTransaction.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeleteTransaction.setText("Delete Transaction");
        btnDeleteTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTransactionActionPerformed(evt);
            }
        });

        lblSearchTransactions.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSearchTransactions.setText("Search Transactions:");

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panManageTransactionsLayout = new javax.swing.GroupLayout(panManageTransactions);
        panManageTransactions.setLayout(panManageTransactionsLayout);
        panManageTransactionsLayout.setHorizontalGroup(
            panManageTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManageTransactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panManageTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panManageTransactionsLayout.createSequentialGroup()
                        .addComponent(btnPayServiceFee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSendAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnWithdrawAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panManageTransactionsLayout.createSequentialGroup()
                        .addComponent(lblSearchTransactions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchTransactions)))
                .addGap(18, 18, 18)
                .addGroup(panManageTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panManageTransactionsLayout.setVerticalGroup(
            panManageTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panManageTransactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panManageTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPayServiceFee)
                    .addComponent(btnSendAmount)
                    .addComponent(btnWithdrawAmount)
                    .addComponent(btnDeleteTransaction))
                .addGap(27, 27, 27)
                .addGroup(panManageTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchTransactions)
                    .addComponent(txtSearchTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(panEmployeeDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(panManageTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panEmployeeDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panManageTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendAmountActionPerformed

    private void btnPayServiceFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayServiceFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPayServiceFeeActionPerformed

    private void btnWithdrawAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWithdrawAmountActionPerformed

    private void btnDeleteTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTransactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteTransactionActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        EmployeeLogin employeeLogin = new EmployeeLogin();
        employeeLogin.setLocationRelativeTo(null);
        employeeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageTransactionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ManageTransactionsView(employeeId, branchStationed, firstName, lastName).setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteTransaction;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPayServiceFee;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSendAmount;
    private javax.swing.JButton btnWithdrawAmount;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBranchStationed;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblSearchTransactions;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel panEmployeeDetails;
    private javax.swing.JPanel panManageTransactions;
    private javax.swing.JTable tblTransactionsView;
    private javax.swing.JTextField txtSearchTransactions;
    // End of variables declaration//GEN-END:variables
}