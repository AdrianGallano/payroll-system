/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.payrollsystem.UI.AddRecord;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.payrollsystem.Database;
import com.mycompany.payrollsystem.UI.Dashboard;

import javax.swing.*;
import java.time.LocalDate;

public class AddRecordDepartment extends javax.swing.JFrame {


    public AddRecordDepartment() {

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        departmentNameText = new javax.swing.JLabel();
        departmentNameTextField = new javax.swing.JTextField();
        addDepartmentButton = new javax.swing.JButton();

        setTitle("Add Department Record");
        setPreferredSize(new java.awt.Dimension(500, 200));

        container.setBackground(new java.awt.Color(38, 38, 38));
        container.setPreferredSize(new java.awt.Dimension(400, 150));

        departmentNameText.setForeground(new java.awt.Color(242, 242, 242));
        departmentNameText.setText("Name:");



        addDepartmentButton.setText("Add Department");
        addDepartmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDepartmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
                containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(containerLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(addDepartmentButton)
                                        .addGroup(containerLayout.createSequentialGroup()
                                                .addComponent(departmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(departmentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(47, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
                containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(containerLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(departmentNameText)
                                        .addComponent(departmentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(addDepartmentButton)
                                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void addDepartmentButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String departmentName = departmentNameTextField.getText();
        Database.addRecord("departments", departmentName);
        int departmentID = Database.readRecordWhere("departmentID", "departments", "departmentName", departmentName);
        Dashboard.generateTableDepartmentRecords(departmentID, departmentName);
    }




    private javax.swing.JButton addDepartmentButton;
    private javax.swing.JPanel container;
    private javax.swing.JLabel departmentNameText;
    private javax.swing.JTextField departmentNameTextField;

}
