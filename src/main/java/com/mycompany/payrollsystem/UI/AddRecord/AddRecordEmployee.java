/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.payrollsystem.UI.AddRecord;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.UIManager;

import com.mycompany.payrollsystem.Database;
import com.mycompany.payrollsystem.PayrollSystem;
import com.mycompany.payrollsystem.UI.Dashboard;

import java.time.LocalDate;

public class AddRecordEmployee extends javax.swing.JFrame {
    static String zeroes;
    static{
        if(Database.CountOfEmployee < 9){
            zeroes = "0000";
        } else if (Database.CountOfEmployee > 99) {
            zeroes = "000";
        } else if (Database.CountOfEmployee > 9) {
            zeroes = "00";
        }else{
            zeroes = "0";
        }
    }
    private static String employeeID = Integer.toString(LocalDate.now().getYear()) + zeroes + Database.CountOfEmployee;
    //Dinaya

    public AddRecordEmployee() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        initComponents();
        Database.populateComboBox(employeeDepartmentSelection, "departmentName", "departments");
        Database.populateComboBox(employeePositionSelection, "positionName", "positions");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        employeeFirstNameText = new javax.swing.JLabel();
        employeeFirstNameTextField = new javax.swing.JTextField();
        employeeLastNameText = new javax.swing.JLabel();
        employeeLastNameTextField = new javax.swing.JTextField();
        employeeDepartmentText = new javax.swing.JLabel();
        employeeDepartmentSelection = new javax.swing.JComboBox<>();
        employeePositionText = new javax.swing.JLabel();
        employeePositionSelection = new javax.swing.JComboBox<>();
        addEmployeeButton = new javax.swing.JButton();

        setTitle("Add Employee Record");
        setPreferredSize(new java.awt.Dimension(500, 300));

        container.setBackground(new java.awt.Color(38, 38, 38));
        container.setPreferredSize(new java.awt.Dimension(500, 400));

        employeeFirstNameText.setForeground(new java.awt.Color(242, 242, 242));
        employeeFirstNameText.setText("First Name:");

        employeeFirstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeFirstNameTextFieldActionPerformed(evt);
            }
        });

        employeeLastNameText.setForeground(new java.awt.Color(242, 242, 242));
        employeeLastNameText.setText("Last Name:");

        employeeLastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeLastNameTextFieldActionPerformed(evt);
            }
        });

        employeeDepartmentText.setForeground(new java.awt.Color(242, 242, 242));
        employeeDepartmentText.setText("Department:");

        employeeDepartmentSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        employeePositionText.setForeground(new java.awt.Color(242, 242, 242));
        employeePositionText.setText("Position: ");

        employeePositionSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addEmployeeButton.setText("Add Employee");
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addEmployeeButton)
                    .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(containerLayout.createSequentialGroup()
                            .addComponent(employeeFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(employeeFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(containerLayout.createSequentialGroup()
                            .addComponent(employeeLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(employeeLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(containerLayout.createSequentialGroup()
                            .addComponent(employeeDepartmentText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(employeeDepartmentSelection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(containerLayout.createSequentialGroup()
                            .addComponent(employeePositionText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(employeePositionSelection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeFirstNameText)
                    .addComponent(employeeFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeLastNameText))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeDepartmentText)
                    .addComponent(employeeDepartmentSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeePositionSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeePositionText))
                .addGap(32, 32, 32)
                .addComponent(addEmployeeButton)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String firstName = employeeFirstNameTextField.getText();
        String lastName = employeeLastNameTextField.getText();
        String selectedEmployeeDepartment = (String) employeeDepartmentSelection.getSelectedItem();
        String selectedEmployeePosition = (String) employeePositionSelection.getSelectedItem();
        Database.CountOfEmployee++;
        employeeID = Integer.toString(LocalDate.now().getYear()) + zeroes + Database.CountOfEmployee;
        int selectedEmployeeDepartmentID = Database.readRecordWhere("departmentID", "departments", "departmentName", selectedEmployeeDepartment);
        int selectedEmployeePositionID = Database.readRecordWhere("positionID", "positions", "positionName", selectedEmployeePosition);
        Database.addRecord("employees", employeeID, firstName, lastName, selectedEmployeeDepartmentID, selectedEmployeePositionID);
        Dashboard.generateTableEmployeeRecords(employeeID, firstName, lastName, selectedEmployeeDepartmentID, selectedEmployeePositionID);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JPanel container;
    private javax.swing.JComboBox<String> employeeDepartmentSelection;
    private javax.swing.JLabel employeeDepartmentText;
    private javax.swing.JLabel employeeFirstNameText;
    private javax.swing.JTextField employeeFirstNameTextField;
    private javax.swing.JLabel employeeLastNameText;
    private javax.swing.JTextField employeeLastNameTextField;
    private javax.swing.JComboBox<String> employeePositionSelection;
    private javax.swing.JLabel employeePositionText;
    // End of variables declaration//GEN-END:variables
}
