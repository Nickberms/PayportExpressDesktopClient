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

public class UpdateEmployeeForm extends javax.swing.JFrame {

    BranchWebServices_Service branch_service = new BranchWebServices_Service();
    BranchWebServices branch_port = branch_service.getBranchWebServicesPort();
    EmployeeWebServices_Service employee_service = new EmployeeWebServices_Service();
    EmployeeWebServices employee_port = employee_service.getEmployeeWebServicesPort();
    public static String adminId;
    public static String firstName;
    public static String lastName;
    public static String employeeId;

    private void populateBranchStationComboBox(String employeeBranchId) {
        List<StringArray> branchArray = branch_port.selectAllBranches();
        cbxBranchStation.removeAllItems();
        String selectedComboBoxItem = null;
        for (StringArray branchStringArray : branchArray) {
            String[] branch = branchStringArray.getItem().toArray(new String[0]);
            String comboBoxItem = branch[0] + " " + branch[2];
            cbxBranchStation.addItem(comboBoxItem);
            if (employeeBranchId != null && employeeBranchId.equals(branch[0])) {
                selectedComboBoxItem = comboBoxItem;
            }
        }
        if (selectedComboBoxItem != null) {
            cbxBranchStation.setSelectedItem(selectedComboBoxItem);
        }
    }

    @SuppressWarnings({"static-access", "UseSpecificCatch", "CallToPrintStackTrace"})
    public UpdateEmployeeForm(String adminId, String firstName, String lastName, String employeeId) {
        this.adminId = adminId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        initComponents();
        String employeeIdStr = employeeId;
        int employeeIdParam = 0;
        List<String> employee = null;
        if (employeeIdStr != null && !employeeIdStr.isEmpty()) {
            try {
                employeeIdParam = Integer.parseInt(employeeIdStr);
                employee = employee_port.selectEmployee(employeeIdParam);
            } catch (Exception error) {
                error.printStackTrace();
            }
        }
        @SuppressWarnings("null")
        String fullAddress = employee.get(7);
        String[] addressParts = fullAddress.split(",");
        String town = addressParts.length > 0 ? addressParts[0].trim() : "";
        String municipality = addressParts.length > 1 ? addressParts[1].trim() : "";
        String province = addressParts.length > 2 ? addressParts[2].trim() : "";
        txtEmployeeId.setText(employeeId);
        populateBranchStationComboBox(employee.get(1));
        cbxWorkingStatus.setSelectedItem(employee.get(2));
        txtFirstName.setText(employee.get(3));
        txtLastName.setText(employee.get(4));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(employee.get(5));
            dteBirthdate.setDate(date);
        } catch (ParseException error) {
            error.printStackTrace();
        }
        cbxSex.setSelectedItem(employee.get(6));
        txtTown.setText(town);
        txtMunicipality.setText(municipality);
        txtProvince.setText(province);
        txtPhoneNumber.setText(employee.get(8));
        txtEmailAddress.setText(employee.get(9));
        txtPassword.setText(employee.get(10));
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
        PlainDocument phoneNumberFilter = (PlainDocument) txtPhoneNumber.getDocument();
        phoneNumberFilter.setDocumentFilter(new NumbersOnly(15));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUpdatePayportExpressEmployee = new javax.swing.JLabel();
        panLeftComponents = new java.awt.Panel();
        lblBranchAndStatus = new javax.swing.JLabel();
        cbxBranchStation = new javax.swing.JComboBox<>();
        lblBranchStation = new javax.swing.JLabel();
        lblBasicInformation = new javax.swing.JLabel();
        lblEmployeeId = new javax.swing.JLabel();
        txtEmployeeId = new javax.swing.JTextField();
        lblWorkingStatus = new javax.swing.JLabel();
        cbxWorkingStatus = new javax.swing.JComboBox<>();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblBirthdate = new javax.swing.JLabel();
        dteBirthdate = new com.toedter.calendar.JDateChooser();
        lblSex = new javax.swing.JLabel();
        cbxSex = new javax.swing.JComboBox<>();
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
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Employee");
        setResizable(false);

        lblUpdatePayportExpressEmployee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUpdatePayportExpressEmployee.setText("Update Payport Express Employee");

        panLeftComponents.setBackground(java.awt.SystemColor.controlHighlight);

        lblBranchAndStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBranchAndStatus.setText("Branch and Status");

        cbxBranchStation.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        cbxBranchStation.setMaximumRowCount(10);
        cbxBranchStation.setLightWeightPopupEnabled(false);

        lblBranchStation.setText("Branch Station:");

        lblBasicInformation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBasicInformation.setText("Basic Information");

        lblEmployeeId.setText("Employee ID:");

        txtEmployeeId.setEditable(false);

        lblWorkingStatus.setText("Working Status:");

        cbxWorkingStatus.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        cbxWorkingStatus.setMaximumRowCount(3);
        cbxWorkingStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "On Leave", "Fired" }));
        cbxWorkingStatus.setLightWeightPopupEnabled(false);

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblBirthdate.setText("Birthdate:");

        dteBirthdate.setDateFormatString("dd/MM/yyyy");
        dteBirthdate.setFocusable(false);

        lblSex.setText("Sex:");

        cbxSex.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        cbxSex.setMaximumRowCount(2);
        cbxSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbxSex.setLightWeightPopupEnabled(false);

        javax.swing.GroupLayout panLeftComponentsLayout = new javax.swing.GroupLayout(panLeftComponents);
        panLeftComponents.setLayout(panLeftComponentsLayout);
        panLeftComponentsLayout.setHorizontalGroup(
            panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLeftComponentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLeftComponentsLayout.createSequentialGroup()
                        .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSex)
                            .addComponent(lblLastName)
                            .addComponent(lblFirstName)
                            .addComponent(lblBranchStation)
                            .addComponent(lblWorkingStatus)
                            .addComponent(lblEmployeeId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dteBirthdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxWorkingStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxBranchStation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployeeId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblBasicInformation)
                    .addComponent(lblBranchAndStatus))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panLeftComponentsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxBranchStation, cbxSex, cbxWorkingStatus, dteBirthdate, txtEmployeeId, txtFirstName, txtLastName});

        panLeftComponentsLayout.setVerticalGroup(
            panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLeftComponentsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeId))
                .addGap(18, 18, 18)
                .addComponent(lblBranchAndStatus)
                .addGap(18, 18, 18)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBranchStation)
                    .addComponent(cbxBranchStation, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWorkingStatus)
                    .addComponent(cbxWorkingStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(lblBirthdate)
                    .addComponent(dteBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panLeftComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSex))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panLeftComponentsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxSex, dteBirthdate, txtFirstName, txtLastName});

        panLeftComponentsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxBranchStation, cbxWorkingStatus});

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

        javax.swing.GroupLayout panRightComponentsLayout = new javax.swing.GroupLayout(panRightComponents);
        panRightComponents.setLayout(panRightComponentsLayout);
        panRightComponentsLayout.setHorizontalGroup(
            panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRightComponentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                    .addComponent(lblAddress)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panRightComponentsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmailAddress, txtPassword});

        panRightComponentsLayout.setVerticalGroup(
            panRightComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRightComponentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addGap(18, 18, 18))
        );

        panRightComponentsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmailAddress, txtPassword});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panLeftComponents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(panRightComponents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUpdatePayportExpressEmployee))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblUpdatePayportExpressEmployee)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panLeftComponents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panRightComponents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ManageEmployeesView manageEmployeesView = new ManageEmployeesView(adminId, firstName, lastName);
        manageEmployeesView.setLocationRelativeTo(null);
        manageEmployeesView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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

    @SuppressWarnings({"UnnecessaryReturnStatement", "UseSpecificCatch", "CallToPrintStackTrace"})
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            int branchStation = getSelectedBranchId();
            String workingStatus = (String) cbxWorkingStatus.getSelectedItem();
            String employeeFirstName = txtFirstName.getText().trim();
            employeeFirstName = NameFormatter.formatName(employeeFirstName);
            String employeelastName = txtLastName.getText().trim();
            employeelastName = NameFormatter.formatName(employeelastName);
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
                if (employeeFirstName.isEmpty() || employeelastName.isEmpty() || birthdateString.isEmpty() || town.isEmpty() || municipality.isEmpty() || province.isEmpty() || password.isEmpty()) {
                    return;
                } else if (phoneNumber.length() < 3) {
                    JOptionPane.showMessageDialog(this, "The phone number should be at least 3 characters long", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!isValidEmail(emailAddress)) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid email address", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    employee_port.updateEmployee(Integer.parseInt(employeeId), branchStation, workingStatus, employeeFirstName, employeelastName, birthdate, sex, address, phoneNumber, emailAddress, password);
                    ManageEmployeesView manageEmployeesView = new ManageEmployeesView(adminId, firstName, lastName);
                    manageEmployeesView.setLocationRelativeTo(null);
                    manageEmployeesView.setVisible(true);
                    this.dispose();
                }
            } catch (Exception error) {
                error.printStackTrace();
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new UpdateEmployeeForm(adminId, firstName, lastName, employeeId).setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxBranchStation;
    private javax.swing.JComboBox<String> cbxSex;
    private javax.swing.JComboBox<String> cbxWorkingStatus;
    private com.toedter.calendar.JDateChooser dteBirthdate;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBasicInformation;
    private javax.swing.JLabel lblBirthdate;
    private javax.swing.JLabel lblBranchAndStatus;
    private javax.swing.JLabel lblBranchStation;
    private javax.swing.JLabel lblCredentials;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMunicipality;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblTown;
    private javax.swing.JLabel lblUpdatePayportExpressEmployee;
    private javax.swing.JLabel lblWorkingStatus;
    private java.awt.Panel panLeftComponents;
    private java.awt.Panel panRightComponents;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMunicipality;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtTown;
    // End of variables declaration//GEN-END:variables
}