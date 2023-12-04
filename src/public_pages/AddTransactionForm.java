package public_pages;

import extra_features.*;
import web_services.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class AddTransactionForm extends javax.swing.JFrame {

    public AddTransactionForm() {
        initComponents();
        JTextField[] lettersFields = {
            txtSenderFirstName,
            txtSenderMiddleName,
            txtSenderLastName,
            txtReceiverFirstName,
            txtReceiverMiddleName,
            txtReceiverLastName
        };
        LettersOnly lettersOnlyFilter = new LettersOnly();
        for (JTextField textField : lettersFields) {
            ((PlainDocument) textField.getDocument()).setDocumentFilter(lettersOnlyFilter);
        }
        PlainDocument senderContactNumberFilter = (PlainDocument) txtSenderContactNumber.getDocument();
        senderContactNumberFilter.setDocumentFilter(new NumbersOnly(15));
        PlainDocument receiverContactNumberFilter = (PlainDocument) txtReceiverContactNumber.getDocument();
        receiverContactNumberFilter.setDocumentFilter(new NumbersOnly(15));
        PlainDocument amountFilter = (PlainDocument) txtAmount.getDocument();
        amountFilter.setDocumentFilter(new NumbersOnly(6));
        txtAmount.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateServiceFee();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateServiceFee();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }

            private void updateServiceFee() {
                String serviceFee = CalculateServiceFee.calculateServiceFee(txtAmount.getText());
                txtServiceFee.setText(serviceFee);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAmountMoney2 = new javax.swing.JLabel();
        txtAmountMoney2 = new javax.swing.JTextField();
        lblPayportExpressTransactionForm = new javax.swing.JLabel();
        panLeftComponents = new java.awt.Panel();
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
        panRightComponents = new java.awt.Panel();
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
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        lblAmountMoney2.setText("Service Fee:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Transaction");
        setResizable(false);

        lblPayportExpressTransactionForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPayportExpressTransactionForm.setText("Payport Express Transaction Form");

        panLeftComponents.setBackground(java.awt.SystemColor.controlHighlight);

        lblSenderFirstName.setText("First Name:");

        lblSenderMiddleName.setText("Middle Name:");

        lblSenderDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSenderDetails.setText("Sender Details");

        lblSenderLastName.setText("Last Name:");

        cbxSenderNameSuffix.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        cbxSenderNameSuffix.setMaximumRowCount(11);
        cbxSenderNameSuffix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Sr.", "Jr.", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" }));
        cbxSenderNameSuffix.setLightWeightPopupEnabled(false);

        lblSenderNameSuffix.setText("Name Suffix:");

        lblSenderContactNumber.setText("Contact Number:");

        lblAmountMoney.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAmountMoney.setText("Amount Money");

        lblAmount.setText("Amount:");

        lblServiceFee.setText("Service Fee:");

        txtServiceFee.setEditable(false);

        javax.swing.GroupLayout panLeftComponentsLayout = new javax.swing.GroupLayout(panLeftComponents);
        panLeftComponents.setLayout(panLeftComponentsLayout);
        panLeftComponentsLayout.setHorizontalGroup(
            panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLeftComponentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLeftComponentsLayout.createSequentialGroup()
                        .addComponent(lblSenderDetails)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panLeftComponentsLayout.createSequentialGroup()
                        .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panLeftComponentsLayout.createSequentialGroup()
                                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSenderLastName)
                                    .addComponent(lblSenderContactNumber)
                                    .addComponent(lblSenderNameSuffix)
                                    .addComponent(lblSenderFirstName)
                                    .addComponent(lblSenderMiddleName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtSenderContactNumber)
                                    .addComponent(cbxSenderNameSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenderLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenderMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenderFirstName)))
                            .addGroup(panLeftComponentsLayout.createSequentialGroup()
                                .addComponent(lblAmountMoney)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panLeftComponentsLayout.createSequentialGroup()
                                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAmount)
                                    .addComponent(lblServiceFee))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtAmount)
                                    .addComponent(txtServiceFee))))
                        .addGap(18, 18, 18))))
        );
        panLeftComponentsLayout.setVerticalGroup(
            panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLeftComponentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblSenderDetails)
                .addGap(18, 18, 18)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenderFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenderFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenderMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenderMiddleName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenderLastName)
                    .addComponent(txtSenderLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSenderNameSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenderNameSuffix))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenderContactNumber)
                    .addComponent(txtSenderContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblAmountMoney)
                .addGap(18, 18, 18)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServiceFee)
                    .addComponent(txtServiceFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        panLeftComponentsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxSenderNameSuffix, txtSenderContactNumber});

        panRightComponents.setBackground(java.awt.SystemColor.controlHighlight);

        lblReceiverFirstName.setText("First Name:");

        lblReceiverMiddleName.setText("Middle Name:");

        lblReceiverDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReceiverDetails.setText("Receiver Details");

        lblReceiverLastName.setText("Last Name:");

        cbxReceiverNameSuffix.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        cbxReceiverNameSuffix.setMaximumRowCount(11);
        cbxReceiverNameSuffix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Sr.", "Jr.", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" }));
        cbxReceiverNameSuffix.setLightWeightPopupEnabled(false);

        lblReceiverNameSuffix.setText("Name Suffix:");

        lblReceiverContactNumber.setText("Contact Number:");

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRightComponentsLayout = new javax.swing.GroupLayout(panRightComponents);
        panRightComponents.setLayout(panRightComponentsLayout);
        panRightComponentsLayout.setHorizontalGroup(
            panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRightComponentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panRightComponentsLayout.createSequentialGroup()
                        .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panRightComponentsLayout.createSequentialGroup()
                                .addComponent(lblReceiverLastName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtReceiverLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panRightComponentsLayout.createSequentialGroup()
                                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblReceiverContactNumber)
                                    .addComponent(lblReceiverNameSuffix))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReceiverContactNumber)
                                    .addComponent(cbxReceiverNameSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panRightComponentsLayout.createSequentialGroup()
                                .addComponent(lblReceiverFirstName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtReceiverFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panRightComponentsLayout.createSequentialGroup()
                                .addComponent(lblReceiverMiddleName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtReceiverMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblReceiverDetails))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        panRightComponentsLayout.setVerticalGroup(
            panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRightComponentsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblReceiverDetails)
                .addGap(18, 18, 18)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReceiverFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReceiverFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReceiverMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReceiverMiddleName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReceiverLastName)
                    .addComponent(txtReceiverLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxReceiverNameSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReceiverNameSuffix))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReceiverContactNumber)
                    .addComponent(txtReceiverContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addGap(32, 32, 32))
        );

        panRightComponentsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxReceiverNameSuffix, txtReceiverContactNumber});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPayportExpressTransactionForm)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panLeftComponents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(panRightComponents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblPayportExpressTransactionForm)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panLeftComponents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panRightComponents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Index index = new Index();
        index.setLocationRelativeTo(null);
        index.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private String buildFullName(String firstName, String middleName, String lastName, String nameSuffix) {
        String fullName = firstName;
        if (middleName != null && !middleName.isEmpty()) {
            fullName += " " + middleName;
        }
        fullName += " " + lastName;
        if (nameSuffix != null && !nameSuffix.isEmpty() && !nameSuffix.equals("None")) {
            fullName += " " + nameSuffix;
        }
        return fullName;
    }

    private void clearInputFields() {
        txtServiceFee.setText("");
        txtSenderFirstName.setText("");
        txtSenderMiddleName.setText("");
        txtSenderLastName.setText("");
        cbxSenderNameSuffix.setSelectedIndex(0);
        txtSenderContactNumber.setText("");
        txtReceiverFirstName.setText("");
        txtReceiverMiddleName.setText("");
        txtReceiverLastName.setText("");
        cbxReceiverNameSuffix.setSelectedIndex(0);
        txtReceiverContactNumber.setText("");
        txtAmount.setText("");
    }

    @SuppressWarnings({"UseSpecificCatch", "CallToPrintStackTrace", "UnnecessaryReturnStatement"})
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        TransactionWebServices_Service transaction_service = new TransactionWebServices_Service();
        TransactionWebServices transaction_port = transaction_service.getTransactionWebServicesPort();
        try {
            float serviceFee = Float.parseFloat(txtServiceFee.getText());
            String senderFirstName = txtSenderFirstName.getText().trim();
            senderFirstName = NameFormatter.formatName(senderFirstName);
            String senderMiddleName = txtSenderMiddleName.getText().trim();
            senderMiddleName = NameFormatter.formatName(senderMiddleName);
            String senderLastName = txtSenderLastName.getText().trim();
            senderLastName = NameFormatter.formatName(senderLastName);
            String senderName = buildFullName(senderFirstName, senderMiddleName, senderLastName, (String) cbxSenderNameSuffix.getSelectedItem());
            String senderContactNumber = txtSenderContactNumber.getText();
            String receiverFirstName = txtReceiverFirstName.getText().trim();
            receiverFirstName = NameFormatter.formatName(receiverFirstName);
            String receiverMiddleName = txtReceiverMiddleName.getText().trim();
            receiverMiddleName = NameFormatter.formatName(receiverMiddleName);
            String receiverLastName = txtReceiverLastName.getText().trim();
            receiverLastName = NameFormatter.formatName(receiverLastName);
            String receiverName = buildFullName(receiverFirstName, receiverMiddleName, receiverLastName, (String) cbxReceiverNameSuffix.getSelectedItem());
            String receiverContactNumber = txtReceiverContactNumber.getText();
            String amountString = txtAmount.getText();
            float amount = Float.parseFloat(txtAmount.getText());
            try {
                if (senderFirstName.isEmpty() || senderLastName.isEmpty() || receiverFirstName.isEmpty() || receiverLastName.isEmpty() || amountString.isEmpty() || amount <= 0) {
                    return;
                } else if (senderContactNumber.length() < 3 || receiverContactNumber.length() < 3) {
                    JOptionPane.showMessageDialog(this, "Contact numbers should be at least 3 characters long.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    transaction_port.insertNewTransaction(serviceFee, senderName, senderContactNumber, receiverName, receiverContactNumber, amount);
                    JOptionPane.showMessageDialog(this, "Submission successful. You can come to any of our branches at any time to confirm and process your transaction.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clearInputFields();
                }
            } catch (Exception error) {
                error.printStackTrace();
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed
    
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
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
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
    private java.awt.Panel panLeftComponents;
    private java.awt.Panel panRightComponents;
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