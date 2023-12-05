package employee_pages;

import web_services.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import net.java.dev.jaxb.array.*;

public class ManageTransactionsView extends javax.swing.JFrame {

    BranchWebServices_Service branch_service = new BranchWebServices_Service();
    BranchWebServices branch_port = branch_service.getBranchWebServicesPort();
    EmployeeWebServices_Service employee_service = new EmployeeWebServices_Service();
    EmployeeWebServices employee_port = employee_service.getEmployeeWebServicesPort();
    TransactionWebServices_Service transaction_service = new TransactionWebServices_Service();
    TransactionWebServices transaction_port = transaction_service.getTransactionWebServicesPort();
    public static String employeeId;
    public static String branchStationed;
    public static String firstName;
    public static String lastName;

    private void populateTransactionsTable() {
        List<StringArray> transactionArray = transaction_port.selectAllTransactions();
        List<String[]> transactions = new ArrayList<>();
        for (StringArray transactionStringArray : transactionArray) {
            transactions.add(transactionStringArray.getItem().toArray(new String[0]));
        }
        Map<String, String> employeeMap = new HashMap<>();
        List<StringArray> employeeArray = employee_port.selectAllEmployees();
        for (StringArray employeeStringArray : employeeArray) {
            String[] employee = employeeStringArray.getItem().toArray(new String[0]);
            employeeMap.put(employee[0], employee[3] + " " + employee[4]);
        }
        Map<String, String> branchMap = new HashMap<>();
        List<StringArray> branchArray = branch_port.selectAllBranches();
        for (StringArray branchStringArray : branchArray) {
            String[] branch = branchStringArray.getItem().toArray(new String[0]);
            branchMap.put(branch[0], branch[2]);
        }
        String keyword = txtSearchTransactions.getText();
        if (keyword != null) {
            keyword = keyword.toLowerCase();
        }
        DefaultTableModel model = (DefaultTableModel) tblTransactionsView.getModel();
        model.setRowCount(0);
        for (String[] transaction : transactions) {
            boolean matchesKeyword = true;
            if (keyword != null && !keyword.trim().isEmpty()) {
                matchesKeyword = false;
                for (int i = 0; i < transaction.length; i++) {
                    String field = transaction[i];
                    if (field != null && field.toLowerCase().contains(keyword)) {
                        matchesKeyword = true;
                        break;
                    }
                    if ((i == 7 || i == 8) && employeeMap.containsKey(field) && employeeMap.get(field).toLowerCase().contains(keyword)) {
                        matchesKeyword = true;
                        break;
                    }
                    if ((i == 9 || i == 10) && branchMap.containsKey(field) && branchMap.get(field).toLowerCase().contains(keyword)) {
                        matchesKeyword = true;
                        break;
                    }
                }
            }
            if (matchesKeyword) {
                Object[] row = new Object[]{
                    transaction[0],
                    transaction[1],
                    transaction[2],
                    transaction[3],
                    transaction[4],
                    transaction[5],
                    transaction[6],
                    transaction[7],
                    ("0".equals(transaction[8])) ? "" : transaction[8] + " " + employeeMap.getOrDefault(transaction[8], ""),
                    ("0".equals(transaction[9])) ? "" : transaction[9] + " " + employeeMap.getOrDefault(transaction[9], ""),
                    ("0".equals(transaction[10])) ? "" : transaction[10] + " " + branchMap.getOrDefault(transaction[10], ""),
                    ("0".equals(transaction[11])) ? "" : transaction[11] + " " + branchMap.getOrDefault(transaction[11], ""),
                    transaction[12],
                    transaction[13]
                };
                model.addRow(row);
            }
        }
    }

    @SuppressWarnings("static-access")
    public ManageTransactionsView(String employeeId, String branchStationed, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.branchStationed = branchStationed;
        this.firstName = firstName;
        this.lastName = lastName;
        initComponents();
        int branchId = 0;
        @SuppressWarnings("UnusedAssignment")
        String branchName = "";
        branchId = Integer.parseInt((String) branchStationed);
        HashMap<Integer, String> branchMap = new HashMap<>();
        List<StringArray> branchArray = branch_port.selectAllBranches();
        for (StringArray branchStringArray : branchArray) {
            String[] branch = branchStringArray.getItem().toArray(new String[0]);
            branchMap.put(Integer.parseInt(branch[0]), branch[2]);
        }
        branchName = branchMap.getOrDefault(branchId, "");
        lblEmployeeId.setText("Employee ID: " + employeeId);
        lblBranchStationed.setText("Branch Stationed: " + branchId + " " + branchName);
        lblWelcome.setText("Welcome, " + firstName + " " + lastName);
        populateTransactionsTable();
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

        tblTransactionsView.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
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
            tblTransactionsView.getColumnModel().getColumn(3).setPreferredWidth(25);
            tblTransactionsView.getColumnModel().getColumn(4).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(4).setPreferredWidth(55);
            tblTransactionsView.getColumnModel().getColumn(5).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(5).setPreferredWidth(25);
            tblTransactionsView.getColumnModel().getColumn(6).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(6).setPreferredWidth(65);
            tblTransactionsView.getColumnModel().getColumn(7).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(7).setPreferredWidth(5);
            tblTransactionsView.getColumnModel().getColumn(8).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(8).setPreferredWidth(65);
            tblTransactionsView.getColumnModel().getColumn(9).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(9).setPreferredWidth(70);
            tblTransactionsView.getColumnModel().getColumn(10).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(10).setPreferredWidth(65);
            tblTransactionsView.getColumnModel().getColumn(11).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(11).setPreferredWidth(65);
            tblTransactionsView.getColumnModel().getColumn(12).setResizable(false);
            tblTransactionsView.getColumnModel().getColumn(12).setPreferredWidth(50);
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
        int selectedRow = tblTransactionsView.getSelectedRow();
        if (selectedRow != -1) {
            String controlNumberParam = (String) tblTransactionsView.getValueAt(selectedRow, 0);
            int controlNumber = Integer.parseInt(controlNumberParam);
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Send amount? Make sure it is already been paid",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                List<String> transaction = transaction_port.selectTransaction(controlNumber);
                String feeStatus = transaction.get(1);
                int branchSent = Integer.parseInt(transaction.get(10));
                int branchWithdrawn = Integer.parseInt(transaction.get(11));
                if ("Unpaid".equals(feeStatus) || branchSent != 0 || branchWithdrawn != 0) {
                    populateTransactionsTable();
                } else {
                    transaction_port.sendAmount(controlNumber, Integer.parseInt(employeeId), Integer.parseInt(branchStationed));
                    populateTransactionsTable();
                }
            }
        }
    }//GEN-LAST:event_btnSendAmountActionPerformed

    private void btnPayServiceFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayServiceFeeActionPerformed
        int selectedRow = tblTransactionsView.getSelectedRow();
        if (selectedRow != -1) {
            String controlNumberParam = (String) tblTransactionsView.getValueAt(selectedRow, 0);
            int controlNumber = Integer.parseInt(controlNumberParam);
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Pay service fee? This action cannot be undone",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                List<String> transaction = transaction_port.selectTransaction(controlNumber);
                String feeStatus = transaction.get(1);
                if ("Paid".equals(feeStatus)) {
                    populateTransactionsTable();
                } else {
                    transaction_port.payServiceFee(controlNumber);
                    populateTransactionsTable();
                }
            }
        }
    }//GEN-LAST:event_btnPayServiceFeeActionPerformed

    private void btnWithdrawAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawAmountActionPerformed
        int selectedRow = tblTransactionsView.getSelectedRow();
        if (selectedRow != -1) {
            String controlNumberParam = (String) tblTransactionsView.getValueAt(selectedRow, 0);
            int controlNumber = Integer.parseInt(controlNumberParam);
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Withdraw amount? Make sure it is already been sent",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                List<String> transaction = transaction_port.selectTransaction(controlNumber);
                int branchSent = Integer.parseInt(transaction.get(10));
                int branchWithdrawn = Integer.parseInt(transaction.get(11));
                if (branchSent != 0 && branchWithdrawn == 0) {
                    transaction_port.withdrawAmount(controlNumber, Integer.parseInt(employeeId), Integer.parseInt(branchStationed));
                    populateTransactionsTable();
                } else {
                    populateTransactionsTable();
                }
            }
        }
    }//GEN-LAST:event_btnWithdrawAmountActionPerformed

    private void btnDeleteTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTransactionActionPerformed
        int selectedRow = tblTransactionsView.getSelectedRow();
        if (selectedRow != -1) {
            String controlNumberParam = (String) tblTransactionsView.getValueAt(selectedRow, 0);
            int controlNumber = Integer.parseInt(controlNumberParam);
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Delete transaction? Make sure it is still unpaid",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                List<String> transaction = transaction_port.selectTransaction(controlNumber);
                String feeStatus = transaction.get(1);
                if ("Paid".equals(feeStatus)) {
                    populateTransactionsTable();
                } else {
                    transaction_port.deleteTransaction(controlNumber);
                    populateTransactionsTable();
                }
            }
        }
    }//GEN-LAST:event_btnDeleteTransactionActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        populateTransactionsTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        public_pages.EmployeeLogin employeeLogin = new public_pages.EmployeeLogin();
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