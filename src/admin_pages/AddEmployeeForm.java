package admin_pages;

import extra_features.*;
import web_services.*;
import com.toedter.calendar.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.xml.datatype.*;
import net.java.dev.jaxb.array.*;

public class AddEmployeeForm extends javax.swing.JFrame {

    BranchWebServices_Service branch_service = new BranchWebServices_Service();
    BranchWebServices branch_port = branch_service.getBranchWebServicesPort();
    EmployeeWebServices_Service employee_service = new EmployeeWebServices_Service();
    EmployeeWebServices employee_port = employee_service.getEmployeeWebServicesPort();

    private void populateBranchStationComboBox() {
        List<StringArray> branchArray = branch_port.selectAllBranches();
        for (StringArray branchStringArray : branchArray) {
            String[] branch = branchStringArray.getItem().toArray(new String[0]);
            String comboBoxItem = branch[0] + " " + branch[2];
            cbxBranchStation.addItem(comboBoxItem);
        }
    }

    public AddEmployeeForm() {
        initComponents();
        populateBranchStationComboBox();
        JTextField[] lettersFields = {
            txtFirstName,
            txtLastName,
            txtTown,
            txtMunicipality,
            txtProvince
        };
        LettersOnly lettersOnlyFilter = new LettersOnly();
        for (JTextField textField : lettersFields) {
            ((PlainDocument) textField.getDocument()).setDocumentFilter(lettersOnlyFilter);
        }
        ((JTextField) dteBirthdate.getDateEditor().getUiComponent()).setEditable(false);
        PlainDocument phoneNumberFilter = (PlainDocument) txtPhoneNumber.getDocument();
        phoneNumberFilter.setDocumentFilter(new NumbersOnly(15));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPayportExpressTransactionForm = new javax.swing.JLabel();
        panLeftComponents = new java.awt.Panel();
        lblBranch = new javax.swing.JLabel();
        cbxBranchStation = new javax.swing.JComboBox<>();
        lblBranchStation = new javax.swing.JLabel();
        lblBasicInformation = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        dteBirthdate = new com.toedter.calendar.JDateChooser();
        lblBirthdate = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        cbxSex = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblAddNewPayportExpressEmployee = new javax.swing.JLabel();
        panRightComponents = new java.awt.Panel();
        lblAddress = new javax.swing.JLabel();
        txtMunicipality = new javax.swing.JTextField();
        txtTown = new javax.swing.JTextField();
        lblMunicipality = new javax.swing.JLabel();
        lblTown = new javax.swing.JLabel();
        lblProvince = new javax.swing.JLabel();
        txtProvince = new javax.swing.JTextField();
        lblCredentials = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblEmailAddress = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        lblPayportExpressTransactionForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPayportExpressTransactionForm.setText("Payport Express Transaction Form");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee");
        setResizable(false);

        panLeftComponents.setBackground(java.awt.SystemColor.controlHighlight);

        lblBranch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBranch.setText("Branch");

        cbxBranchStation.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        cbxBranchStation.setMaximumRowCount(10);
        cbxBranchStation.setLightWeightPopupEnabled(false);

        lblBranchStation.setText("Branch Station:");

        lblBasicInformation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBasicInformation.setText("Basic Information");

        lblLastName.setText("Last Name:");

        lblFirstName.setText("First Name:");

        dteBirthdate.setDateFormatString("dd/MM/yyyy");
        dteBirthdate.setFocusable(false);

        lblBirthdate.setText("Birthdate:");

        lblSex.setText("Sex:");

        cbxSex.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        cbxSex.setMaximumRowCount(2);
        cbxSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbxSex.setLightWeightPopupEnabled(false);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panLeftComponentsLayout = new javax.swing.GroupLayout(panLeftComponents);
        panLeftComponents.setLayout(panLeftComponentsLayout);
        panLeftComponentsLayout.setHorizontalGroup(
            panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLeftComponentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panLeftComponentsLayout.createSequentialGroup()
                        .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBranch)
                            .addComponent(lblBasicInformation)
                            .addGroup(panLeftComponentsLayout.createSequentialGroup()
                                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBranchStation)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblLastName)
                                    .addComponent(lblBirthdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSex))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(cbxBranchStation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dteBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxSex, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        panLeftComponentsLayout.setVerticalGroup(
            panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLeftComponentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblBranch)
                .addGap(18, 18, 18)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBranchStation)
                    .addComponent(cbxBranchStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblBasicInformation)
                .addGap(18, 18, 18)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dteBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBirthdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSex))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addGap(18, 18, 18))
        );

        panLeftComponentsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxBranchStation, cbxSex, dteBirthdate, txtFirstName, txtLastName});

        lblAddNewPayportExpressEmployee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddNewPayportExpressEmployee.setText("Add New Payport Express Employee");

        panRightComponents.setBackground(java.awt.SystemColor.controlHighlight);

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddress.setText("Address");

        lblMunicipality.setText("Municipality:");

        lblTown.setText("Town:");

        lblProvince.setText("Province:");

        lblCredentials.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCredentials.setText("Credentials");

        lblPhoneNumber.setText("Phone Number:");

        lblEmailAddress.setText("Email Address:");

        lblPassword.setText("Password:");

        javax.swing.GroupLayout panRightComponentsLayout = new javax.swing.GroupLayout(panRightComponents);
        panRightComponents.setLayout(panRightComponentsLayout);
        panRightComponentsLayout.setHorizontalGroup(
            panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRightComponentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRightComponentsLayout.createSequentialGroup()
                        .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailAddress)
                            .addComponent(lblPassword)
                            .addComponent(lblPhoneNumber)
                            .addComponent(lblMunicipality)
                            .addComponent(lblProvince))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMunicipality, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblCredentials)
                    .addComponent(lblTown)
                    .addComponent(lblAddress))
                .addGap(18, 18, 18))
        );

        panRightComponentsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmailAddress, txtPassword});

        panRightComponentsLayout.setVerticalGroup(
            panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRightComponentsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblAddress)
                .addGap(18, 18, 18)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMunicipality)
                    .addComponent(txtMunicipality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProvince)
                    .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblCredentials)
                .addGap(18, 18, 18)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailAddress)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        panRightComponentsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmailAddress, txtPassword});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddNewPayportExpressEmployee)
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
                .addComponent(lblAddNewPayportExpressEmployee)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panRightComponents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panLeftComponents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int getSelectedBranchId() {
        String selectedBranch = (String) cbxBranchStation.getSelectedItem();
        if (selectedBranch != null && !selectedBranch.isEmpty()) {
            String[] parts = selectedBranch.split(" ");
            return Integer.parseInt(parts[0]);
        } else {
            return -1;
        }
    }

    private String getFormattedDateFromDateChooser(JDateChooser dateChooser) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateChooser.getDate();
        if (date != null) {
            return dateFormat.format(date);
        } else {
            return null;
        }
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    @SuppressWarnings({"UseSpecificCatch", "CallToPrintStackTrace", "UnnecessaryReturnStatement"})
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            int branchStation = getSelectedBranchId();
            String firstName = txtFirstName.getText().trim();
            firstName = NameFormatter.formatName(firstName);
            String lastName = txtLastName.getText().trim();
            lastName = NameFormatter.formatName(lastName);
            String birthdateString = getFormattedDateFromDateChooser(dteBirthdate);
            @SuppressWarnings("UnusedAssignment")
            Date gregorian = null;
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            gregorian = dateFormat.parse(birthdateString);
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(gregorian);
            XMLGregorianCalendar birthdate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
            String sex = (String) cbxSex.getSelectedItem();
            String town = txtTown.getText().trim();
            town = NameFormatter.formatName(town);
            String municipality = txtMunicipality.getText().trim();
            municipality = NameFormatter.formatName(municipality);
            String province = txtProvince.getText().trim();
            province = NameFormatter.formatName(province);
            String address = town + ", " + municipality + ", " + province;
            String phoneNumber = txtPhoneNumber.getText();
            String emailAddress = txtEmailAddress.getText().toLowerCase().trim();
            String password = txtPassword.getText();
            try {
                if (firstName.isEmpty() || lastName.isEmpty() || birthdateString.isEmpty() || town.isEmpty() || municipality.isEmpty() || province.isEmpty() || password.isEmpty()) {
                    return;
                } else if (phoneNumber.length() < 3) {
                    JOptionPane.showMessageDialog(this, "The phone number should be at least 3 characters long.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!isValidEmail(emailAddress)) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    employee_port.insertNewEmployee(branchStation, firstName, lastName, birthdate, sex, address, phoneNumber, emailAddress, password);
                    this.dispose();
                }
            } catch (Exception error) {
                error.printStackTrace();
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AddEmployeeForm().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxBranchStation;
    private javax.swing.JComboBox<String> cbxSex;
    private com.toedter.calendar.JDateChooser dteBirthdate;
    private javax.swing.JLabel lblAddNewPayportExpressEmployee;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBasicInformation;
    private javax.swing.JLabel lblBirthdate;
    private javax.swing.JLabel lblBranch;
    private javax.swing.JLabel lblBranchStation;
    private javax.swing.JLabel lblCredentials;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMunicipality;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPayportExpressTransactionForm;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblTown;
    private java.awt.Panel panLeftComponents;
    private java.awt.Panel panRightComponents;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMunicipality;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtTown;
    // End of variables declaration//GEN-END:variables
}