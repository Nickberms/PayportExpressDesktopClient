package public_pages;

public class Index extends javax.swing.JFrame {

    public Index() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panIndexButtons = new javax.swing.JPanel();
        btnGoToAddTransactionForm = new javax.swing.JButton();
        btnGoToEmployeeLogin = new javax.swing.JButton();
        lblPayportExpress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payport Express");
        setResizable(false);

        panIndexButtons.setBackground(java.awt.SystemColor.controlHighlight);

        btnGoToAddTransactionForm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGoToAddTransactionForm.setText("Go to Add Transaction Form");
        btnGoToAddTransactionForm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGoToAddTransactionForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToAddTransactionFormActionPerformed(evt);
            }
        });

        btnGoToEmployeeLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGoToEmployeeLogin.setText("Go to Employee Login");
        btnGoToEmployeeLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGoToEmployeeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToEmployeeLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panIndexButtonsLayout = new javax.swing.GroupLayout(panIndexButtons);
        panIndexButtons.setLayout(panIndexButtonsLayout);
        panIndexButtonsLayout.setHorizontalGroup(
            panIndexButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIndexButtonsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panIndexButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnGoToAddTransactionForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGoToEmployeeLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        panIndexButtonsLayout.setVerticalGroup(
            panIndexButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIndexButtonsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnGoToAddTransactionForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGoToEmployeeLogin)
                .addGap(26, 26, 26))
        );

        lblPayportExpress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPayportExpress.setText("Payport Express");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblPayportExpress)
                    .addComponent(panIndexButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblPayportExpress)
                .addGap(26, 26, 26)
                .addComponent(panIndexButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToAddTransactionFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToAddTransactionFormActionPerformed
        AddTransactionForm addTransactionForm = new AddTransactionForm();
        addTransactionForm.setLocationRelativeTo(null);
        addTransactionForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoToAddTransactionFormActionPerformed

    private void btnGoToEmployeeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToEmployeeLoginActionPerformed
        EmployeeLogin employeeLogin = new EmployeeLogin();
        employeeLogin.setLocationRelativeTo(null);
        employeeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoToEmployeeLoginActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Index().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoToAddTransactionForm;
    private javax.swing.JButton btnGoToEmployeeLogin;
    private javax.swing.JLabel lblPayportExpress;
    private javax.swing.JPanel panIndexButtons;
    // End of variables declaration//GEN-END:variables
}