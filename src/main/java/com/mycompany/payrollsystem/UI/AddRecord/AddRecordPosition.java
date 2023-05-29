/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.payrollsystem.UI.AddRecord;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.payrollsystem.Database;
import com.mycompany.payrollsystem.PayrollSystem;
import com.mycompany.payrollsystem.UI.Dashboard;

import javax.swing.*;

/**
 * @author Aid
 */
public class AddRecordPosition extends javax.swing.JFrame {


    public AddRecordPosition() {

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
        positionNameText = new javax.swing.JLabel();
        positionNameTextField = new javax.swing.JTextField();
        isTeachingField = new javax.swing.JCheckBox();
        positionPayRateText = new javax.swing.JLabel();
        positionPayRateTextField = new javax.swing.JTextField();
        positionRequiredHoursText = new javax.swing.JLabel();
        positionRequiredHoursTextField = new javax.swing.JTextField();
        addPositionButon = new javax.swing.JButton();

        setTitle("Add Position Record");
        setPreferredSize(new java.awt.Dimension(500, 300));

        container.setBackground(new java.awt.Color(38, 38, 38));
        container.setPreferredSize(new java.awt.Dimension(500, 400));

        positionNameText.setForeground(new java.awt.Color(242, 242, 242));
        positionNameText.setText("Name:");

        isTeachingField.setText("Teaching Profession");

        positionPayRateText.setForeground(new java.awt.Color(242, 242, 242));
        positionPayRateText.setText("Pay rate:");

        positionRequiredHoursText.setForeground(new java.awt.Color(242, 242, 242));
        positionRequiredHoursText.setText("Required hours:");

        addPositionButon.setText("Add Position");
        addPositionButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPositionButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
                containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(containerLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(containerLayout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(positionNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(positionNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(addPositionButon)
                                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerLayout.createSequentialGroup()
                                                                .addComponent(positionRequiredHoursText)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(positionRequiredHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(containerLayout.createSequentialGroup()
                                                                .addComponent(positionPayRateText)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(isTeachingField)
                                                                        .addComponent(positionPayRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(158, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
                containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(containerLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(positionNameText)
                                        .addComponent(positionNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(isTeachingField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(positionPayRateText)
                                        .addComponent(positionPayRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(positionRequiredHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(positionRequiredHoursText))
                                .addGap(26, 26, 26)
                                .addComponent(addPositionButon)
                                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPositionButonActionPerformed(java.awt.event.ActionEvent evt) {
        String positionName = positionNameTextField.getText();
        boolean isTeaching =  isTeachingField.isSelected();
        int positionPayRate = Integer.parseInt(positionPayRateTextField.getText());
        int requiredHours = Integer.parseInt(positionRequiredHoursTextField.getText());
        Database.addRecord("positions", positionName, isTeaching, positionPayRate, requiredHours);
        int positionID = Database.readRecordWhere("positionID", "positions", "positionName", positionName);
        Dashboard.generateTablePositionRecords(positionID, positionName, isTeaching, positionPayRate, requiredHours);

    }




    private javax.swing.JButton addPositionButon;
    private javax.swing.JPanel container;
    private javax.swing.JCheckBox isTeachingField;
    private javax.swing.JLabel positionNameText;
    private javax.swing.JTextField positionNameTextField;
    private javax.swing.JLabel positionPayRateText;
    private javax.swing.JTextField positionPayRateTextField;
    private javax.swing.JLabel positionRequiredHoursText;
    private javax.swing.JTextField positionRequiredHoursTextField;
    // End of variables declaration//GEN-END:variables
}
