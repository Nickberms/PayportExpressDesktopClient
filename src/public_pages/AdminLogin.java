/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package public_pages;

import admin_pages.ManageBranchesView;
import admin_pages.ManageEmployeesView;

/**
 *
 * @author Kein
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeLogin
     */
    public AdminLogin() {
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

        lblAdminLogin = new javax.swing.JLabel();
        panAdminLoginForm = new javax.swing.JPanel();
        btnLogIn = new javax.swing.JButton();
        btnGoToAddTransactionForm = new javax.swing.JButton();
        lblEmailAddress = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnLogInAsEmployee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setResizable(false);

        lblAdminLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdminLogin.setText("Admin Login");

        panAdminLoginForm.setBackground(java.awt.SystemColor.controlHighlight);

        btnLogIn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogIn.setText("Log In");
        btnLogIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        btnGoToAddTransactionForm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGoToAddTransactionForm.setText("Go to Add Transaction Form");
        btnGoToAddTransactionForm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGoToAddTransactionForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToAddTransactionFormActionPerformed(evt);
            }
        });

        lblEmailAddress.setText("Email Address:");

        lblPassword.setText("Password:");

        btnLogInAsEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogInAsEmployee.setText("Log in as Employee");
        btnLogInAsEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
                .addGroup(panAdminLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAdminLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btnGoToAddTransactionForm)
                        .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLogInAsEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panAdminLoginFormLayout.createSequentialGroup()
                        .addGroup(panAdminLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailAddress)
                            .addComponent(lblPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panAdminLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword)
                            .addComponent(txtEmailAddress))))
                .addGap(26, 26, 26))
        );

        panAdminLoginFormLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnGoToAddTransactionForm, btnLogIn, btnLogInAsEmployee});

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

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        ManageEmployeesView manageEmployeesView = new ManageEmployeesView();
        manageEmployeesView.setLocationRelativeTo(null);
        manageEmployeesView.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
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
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
