package public_pages;

public class AddTransactionForm extends javax.swing.JFrame {

    public AddTransactionForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAmountMoney2 = new javax.swing.JLabel();
        txtAmountMoney2 = new javax.swing.JTextField();
        lblPayportExpressTransactionForm = new javax.swing.JLabel();
        panSenderDetails = new java.awt.Panel();
        txtSenderFirstName = new javax.swing.JTextField();
        txtSenderMiddleName = new javax.swing.JTextField();
        lblSenderFirstName = new javax.swing.JLabel();
        lblSenderMiddleName = new javax.swing.JLabel();
        lblSenderDetails = new javax.swing.JLabel();
        lblSenderLastName = new javax.swing.JLabel();
        txtSenderLastName = new javax.swing.JTextField();
        cbxSenderNameSuffix = new javax.swing.JComboBox<>();
        lblSenderNameSuffix = new javax.swing.JLabel();
        lblSenderContactNumber = new javax.swing.JLabel();
        txtSenderContactNumber = new javax.swing.JTextField();
        lblAmountMoney = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        lblServiceFee = new javax.swing.JLabel();
        txtServiceFee = new javax.swing.JTextField();
        panReceiverDetails = new java.awt.Panel();
        txtReceiverFirstName = new javax.swing.JTextField();
        txtReceiverMiddleName = new javax.swing.JTextField();
        lblReceiverFirstName = new javax.swing.JLabel();
        lblReceiverMiddleName = new javax.swing.JLabel();
        lblReceiverDetails = new javax.swing.JLabel();
        lblReceiverLastName = new javax.swing.JLabel();
        txtReceiverLastName = new javax.swing.JTextField();
        cbxReceiverNameSuffix = new javax.swing.JComboBox<>();
        lblReceiverNameSuffix = new javax.swing.JLabel();
        lblReceiverContactNumber = new javax.swing.JLabel();
        txtReceiverContactNumber = new javax.swing.JTextField();
        btnSubmitTransaction = new javax.swing.JButton();
        btnCancelTransactionSubmission = new javax.swing.JButton();

        lblAmountMoney2.setText("Service Fee:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Transaction");
        setResizable(false);

        lblPayportExpressTransactionForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPayportExpressTransactionForm.setText("Payport Express Transaction Form");

        panSenderDetails.setBackground(java.awt.SystemColor.controlHighlight);

        lblSenderFirstName.setText("First Name:");

        lblSenderMiddleName.setText("Middle Name:");

        lblSenderDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSenderDetails.setText("Sender Details");

        lblSenderLastName.setText("Last Name:");

        cbxSenderNameSuffix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Sr.", "Jr.", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" }));

        lblSenderNameSuffix.setText("Name Suffix:");

        lblSenderContactNumber.setText("Contact Number:");

        lblAmountMoney.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAmountMoney.setText("Amount Money");

        lblAmount.setText("Amount:");

        lblServiceFee.setText("Service Fee:");

        javax.swing.GroupLayout panSenderDetailsLayout = new javax.swing.GroupLayout(panSenderDetails);
        panSenderDetails.setLayout(panSenderDetailsLayout);
        panSenderDetailsLayout.setHorizontalGroup(
            panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSenderDetailsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSenderDetailsLayout.createSequentialGroup()
                        .addComponent(lblSenderDetails)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panSenderDetailsLayout.createSequentialGroup()
                        .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panSenderDetailsLayout.createSequentialGroup()
                                .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSenderLastName)
                                    .addComponent(lblSenderContactNumber)
                                    .addComponent(lblSenderNameSuffix)
                                    .addComponent(lblSenderFirstName)
                                    .addComponent(lblSenderMiddleName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtSenderContactNumber)
                                    .addComponent(cbxSenderNameSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenderLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenderMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenderFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panSenderDetailsLayout.createSequentialGroup()
                                .addComponent(lblAmountMoney)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panSenderDetailsLayout.createSequentialGroup()
                                .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAmount)
                                    .addComponent(lblServiceFee))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtAmount)
                                    .addComponent(txtServiceFee))))
                        .addGap(26, 26, 26))))
        );
        panSenderDetailsLayout.setVerticalGroup(
            panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSenderDetailsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblSenderDetails)
                .addGap(18, 18, 18)
                .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenderFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenderFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenderMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenderMiddleName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenderLastName)
                    .addComponent(txtSenderLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSenderNameSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenderNameSuffix))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenderContactNumber)
                    .addComponent(txtSenderContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblAmountMoney)
                .addGap(18, 18, 18)
                .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panSenderDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServiceFee)
                    .addComponent(txtServiceFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        panReceiverDetails.setBackground(java.awt.SystemColor.controlHighlight);

        lblReceiverFirstName.setText("First Name:");

        lblReceiverMiddleName.setText("Middle Name:");

        lblReceiverDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReceiverDetails.setText("Receiver Details");

        lblReceiverLastName.setText("Last Name:");

        cbxReceiverNameSuffix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Sr.", "Jr.", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" }));

        lblReceiverNameSuffix.setText("Name Suffix:");

        lblReceiverContactNumber.setText("Contact Number:");

        btnSubmitTransaction.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSubmitTransaction.setText("Submit");
        btnSubmitTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitTransactionActionPerformed(evt);
            }
        });

        btnCancelTransactionSubmission.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelTransactionSubmission.setText("Cancel");
        btnCancelTransactionSubmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelTransactionSubmissionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panReceiverDetailsLayout = new javax.swing.GroupLayout(panReceiverDetails);
        panReceiverDetails.setLayout(panReceiverDetailsLayout);
        panReceiverDetailsLayout.setHorizontalGroup(
            panReceiverDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReceiverDetailsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panReceiverDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelTransactionSubmission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panReceiverDetailsLayout.createSequentialGroup()
                        .addGroup(panReceiverDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSubmitTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panReceiverDetailsLayout.createSequentialGroup()
                                .addComponent(lblReceiverLastName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtReceiverLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panReceiverDetailsLayout.createSequentialGroup()
                                .addGroup(panReceiverDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblReceiverContactNumber)
                                    .addComponent(lblReceiverNameSuffix))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panReceiverDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReceiverContactNumber)
                                    .addComponent(cbxReceiverNameSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panReceiverDetailsLayout.createSequentialGroup()
                                .addComponent(lblReceiverFirstName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtReceiverFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panReceiverDetailsLayout.createSequentialGroup()
                                .addComponent(lblReceiverMiddleName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtReceiverMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblReceiverDetails))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        panReceiverDetailsLayout.setVerticalGroup(
            panReceiverDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReceiverDetailsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblReceiverDetails)
                .addGap(18, 18, 18)
                .addGroup(panReceiverDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReceiverFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReceiverFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panReceiverDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReceiverMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReceiverMiddleName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panReceiverDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReceiverLastName)
                    .addComponent(txtReceiverLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panReceiverDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxReceiverNameSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReceiverNameSuffix))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panReceiverDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReceiverContactNumber)
                    .addComponent(txtReceiverContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnSubmitTransaction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelTransactionSubmission)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPayportExpressTransactionForm)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panSenderDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(panReceiverDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblPayportExpressTransactionForm)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panSenderDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panReceiverDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelTransactionSubmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelTransactionSubmissionActionPerformed
        Index index = new Index();
        index.setLocationRelativeTo(null);
        index.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelTransactionSubmissionActionPerformed

    private void btnSubmitTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitTransactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitTransactionActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTransactionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AddTransactionForm().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelTransactionSubmission;
    private javax.swing.JButton btnSubmitTransaction;
    private javax.swing.JComboBox<String> cbxReceiverNameSuffix;
    private javax.swing.JComboBox<String> cbxSenderNameSuffix;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblAmountMoney;
    private javax.swing.JLabel lblAmountMoney2;
    private javax.swing.JLabel lblPayportExpressTransactionForm;
    private javax.swing.JLabel lblReceiverContactNumber;
    private javax.swing.JLabel lblReceiverDetails;
    private javax.swing.JLabel lblReceiverFirstName;
    private javax.swing.JLabel lblReceiverLastName;
    private javax.swing.JLabel lblReceiverMiddleName;
    private javax.swing.JLabel lblReceiverNameSuffix;
    private javax.swing.JLabel lblSenderContactNumber;
    private javax.swing.JLabel lblSenderDetails;
    private javax.swing.JLabel lblSenderFirstName;
    private javax.swing.JLabel lblSenderLastName;
    private javax.swing.JLabel lblSenderMiddleName;
    private javax.swing.JLabel lblSenderNameSuffix;
    private javax.swing.JLabel lblServiceFee;
    private java.awt.Panel panReceiverDetails;
    private java.awt.Panel panSenderDetails;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtAmountMoney2;
    private javax.swing.JTextField txtReceiverContactNumber;
    private javax.swing.JTextField txtReceiverFirstName;
    private javax.swing.JTextField txtReceiverLastName;
    private javax.swing.JTextField txtReceiverMiddleName;
    private javax.swing.JTextField txtSenderContactNumber;
    private javax.swing.JTextField txtSenderFirstName;
    private javax.swing.JTextField txtSenderLastName;
    private javax.swing.JTextField txtSenderMiddleName;
    private javax.swing.JTextField txtServiceFee;
    // End of variables declaration//GEN-END:variables
}