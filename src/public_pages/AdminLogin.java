package public_pages;

import web_services.*;
import admin_pages.*;
import java.util.*;
import javax.swing.*;

public class AdminLogin extends javax.swing.JFrame {

    AdminWebServices_Service admin_service = new AdminWebServices_Service();
    AdminWebServices admin_port = admin_service.getAdminWebServicesPort();

    public AdminLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdminLogin = new javax.swing.JLabel();
        panAdminLoginForm = new javax.swing.JPanel();
        lblEmailAddress = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogIn = new javax.swing.JButton();
        btnGoToAddTransactionForm = new javax.swing.JButton();
        btnLogInAsEmployee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setResizable(false);

        lblAdminLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdminLogin.setText("Admin Login");

        panAdminLoginForm.setBackground(java.awt.SystemColor.controlHighlight);

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

        btnLogInAsEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogInAsEmployee.setText("Log in as Employee");
        btnLogInAsEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInAsEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAdminLoginFormLayout = new javax.swing.GroupLayout(panAdminLoginForm);
        panAdminLoginForm.setLayout(panAdminLoginFormLayout);
        panAdminLoginFormLayout.setHorizontalGroup(
            panAdminLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAdminLoginFormLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panAdminLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panAdminLoginFormLayout.createSequentialGroup()
                        .addGroup(panAdminLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailAddress)
                            .addComponent(lblPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panAdminLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGoToAddTransactionForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogInAsEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        panAdminLoginFormLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmailAddress, txtPassword});

        panAdminLoginFormLayout.setVerticalGroup(
            panAdminLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAdminLoginFormLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panAdminLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailAddress)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAdminLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGoToAddTransactionForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogInAsEmployee)
                .addGap(26, 26, 26))
        );

        panAdminLoginFormLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmailAddress, txtPassword});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblAdminLogin)
                    .addComponent(panAdminLoginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblAdminLogin)
                .addGap(26, 26, 26)
                .addComponent(panAdminLoginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings({"CallToPrintStackTrace", "UseSpecificCatch"})
    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        try {
            String emailAddress = txtEmailAddress.getText();
            String password = txtPassword.getText();
            List<String> admin = admin_port.adminLogin(emailAddress, password);
            if (admin != null) {
                String adminId = admin.get(0);
                String firstName = admin.get(1);
                String lastName = admin.get(2);
                ManageEmployeesView manageEmployeesView = new ManageEmployeesView(adminId, firstName, lastName);
                manageEmployeesView.setLocationRelativeTo(null);
                manageEmployeesView.setVisible(true);
                this.dispose();
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

    private void btnLogInAsEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInAsEmployeeActionPerformed
        EmployeeLogin employeeLogin = new EmployeeLogin();
        employeeLogin.setLocationRelativeTo(null);
        employeeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogInAsEmployeeActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AdminLogin().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoToAddTransactionForm;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnLogInAsEmployee;
    private javax.swing.JLabel lblAdminLogin;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPanel panAdminLoginForm;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}