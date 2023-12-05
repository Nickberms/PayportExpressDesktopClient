package public_pages;

import web_services.*;
import employee_pages.*;
import java.util.*;
import javax.swing.*;

public class EmployeeLogin extends javax.swing.JFrame {

    BranchWebServices_Service branch_service = new BranchWebServices_Service();
    BranchWebServices branch_port = branch_service.getBranchWebServicesPort();
    EmployeeWebServices_Service employee_service = new EmployeeWebServices_Service();
    EmployeeWebServices employee_port = employee_service.getEmployeeWebServicesPort();

    public EmployeeLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmployeeLogin = new javax.swing.JLabel();
        panEmployeeLoginForm = new javax.swing.JPanel();
        lblEmailAddress = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogIn = new javax.swing.JButton();
        btnGoToAddTransactionForm = new javax.swing.JButton();
        btnLogInAsAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Login");
        setResizable(false);

        lblEmployeeLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEmployeeLogin.setText("Employee Login");

        panEmployeeLoginForm.setBackground(java.awt.SystemColor.controlHighlight);

        lblEmailAddress.setText("Email Address:");

        lblPassword.setText("Password:");

        btnLogIn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        btnGoToAddTransactionForm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGoToAddTransactionForm.setText("Go to Add Transaction Form");
        btnGoToAddTransactionForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToAddTransactionFormActionPerformed(evt);
            }
        });

        btnLogInAsAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogInAsAdmin.setText("Log in as Admin");
        btnLogInAsAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInAsAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEmployeeLoginFormLayout = new javax.swing.GroupLayout(panEmployeeLoginForm);
        panEmployeeLoginForm.setLayout(panEmployeeLoginFormLayout);
        panEmployeeLoginFormLayout.setHorizontalGroup(
            panEmployeeLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEmployeeLoginFormLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panEmployeeLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panEmployeeLoginFormLayout.createSequentialGroup()
                        .addGroup(panEmployeeLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailAddress)
                            .addComponent(lblPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panEmployeeLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGoToAddTransactionForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogInAsAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        panEmployeeLoginFormLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmailAddress, txtPassword});

        panEmployeeLoginFormLayout.setVerticalGroup(
            panEmployeeLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEmployeeLoginFormLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panEmployeeLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailAddress)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEmployeeLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGoToAddTransactionForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogInAsAdmin)
                .addGap(26, 26, 26))
        );

        panEmployeeLoginFormLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmailAddress, txtPassword});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblEmployeeLogin)
                    .addComponent(panEmployeeLoginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblEmployeeLogin)
                .addGap(26, 26, 26)
                .addComponent(panEmployeeLoginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings({"CallToPrintStackTrace", "UseSpecificCatch"})
    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        try {
            String emailAddress = txtEmailAddress.getText();
            String password = txtPassword.getText();
            List<String> employee = employee_port.employeeLogin(emailAddress, password);
            if (employee != null) {
                String workingStatus = employee.get(2);
                int branchId = Integer.parseInt(employee.get(1));
                List<String> branch = null;
                try {
                    branch = branch_port.selectBranch(branchId);
                } catch (Exception error) {
                    error.printStackTrace();
                }
                @SuppressWarnings("null")
                String operationStatus = branch.get(1);
                if ("Fired".equals(workingStatus)) {
                    JOptionPane.showMessageDialog(this, "Access is prohibited for former employees", "Error", JOptionPane.ERROR_MESSAGE);
                } else if ("On Leave".equals(workingStatus)) {
                    JOptionPane.showMessageDialog(this, "Access is prohibited for employees on leave", "Error", JOptionPane.ERROR_MESSAGE);
                } else if ("Inactive".equals(operationStatus)) {
                    JOptionPane.showMessageDialog(this, "Access is prohibited for employees at inactive branches", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    String employeeId = employee.get(0);
                    String branchStationed = employee.get(1);
                    String firstName = employee.get(3);
                    String lastName = employee.get(4);
                    ManageTransactionsView manageTransactionsView = new ManageTransactionsView(employeeId, branchStationed, firstName, lastName);
                    manageTransactionsView.setLocationRelativeTo(null);
                    manageTransactionsView.setVisible(true);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid email address or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, "Invalid email address or password", "Error", JOptionPane.ERROR_MESSAGE);
            error.printStackTrace();
        }
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnGoToAddTransactionFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToAddTransactionFormActionPerformed
        AddTransactionForm addTransactionForm = new AddTransactionForm();
        addTransactionForm.setLocationRelativeTo(null);
        addTransactionForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoToAddTransactionFormActionPerformed

    private void btnLogInAsAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInAsAdminActionPerformed
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setLocationRelativeTo(null);
        adminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogInAsAdminActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new EmployeeLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoToAddTransactionForm;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnLogInAsAdmin;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmployeeLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPanel panEmployeeLoginForm;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}