/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.payrollsystem.UI;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.payrollsystem.Database;

import javax.swing.UIManager;
import java.sql.*;

public class PayrollCalculator extends javax.swing.JFrame {

    public PayrollCalculator() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        initComponents();
        Database.populateComboBox(employeeIDSelection, "employeeID", "employees");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        teachingHoursText = new javax.swing.JLabel();
        teachingHoursField = new javax.swing.JTextField();
        payRateText = new javax.swing.JLabel();
        payRateNumberText = new javax.swing.JLabel();
        payText = new javax.swing.JLabel();
        payNumberText = new javax.swing.JLabel();
        overloadPayText = new javax.swing.JLabel();
        overloadPayNumberText = new javax.swing.JLabel();
        allowanceText = new javax.swing.JLabel();
        allowanceNumberText = new javax.swing.JLabel();
        deductionsText = new javax.swing.JLabel();
        deductionsNumberText = new javax.swing.JLabel();
        overloadTextField = new javax.swing.JTextField();
        overloadText = new javax.swing.JLabel();
        overtimePayNumberText = new javax.swing.JLabel();
        overtimePayText = new javax.swing.JLabel();
        overtimeRateText = new javax.swing.JLabel();
        overtimeRateNumberText = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        employeeIDText = new javax.swing.JLabel();
        employeeIDSelection = new javax.swing.JComboBox<>();
        absentHoursTextField = new javax.swing.JTextField();
        absentHoursText = new javax.swing.JLabel();

        setTitle("Payroll calculator");

        container.setPreferredSize(new java.awt.Dimension(500, 500));
        container.setLayout(new java.awt.BorderLayout());

        mainPanel.setBackground(new java.awt.Color(38, 38, 38));
        mainPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        teachingHoursText.setText("Teaching Hours:");

        teachingHoursField.setText("0");

        payRateText.setText("Pay Rate:");

        payRateNumberText.setText("0");

        payText.setText("Pay:");

        payNumberText.setText("0");

        overloadPayText.setText("Overload Pay:");

        overloadPayNumberText.setText("0");

        allowanceText.setText("Allowance:");

        allowanceNumberText.setText("0");

        deductionsText.setText("Deductions:");

        deductionsNumberText.setText("0");

        overloadTextField.setText("0");


        overloadText.setText("Overload / Overtime Hours:");

        overtimePayNumberText.setText("0");

        overtimePayText.setText("Overtime Pay:");

        overtimeRateText.setText("Overtime Rate:");

        overtimeRateNumberText.setText("0");

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        employeeIDText.setText("Employee ID:");

        employeeIDSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        absentHoursTextField.setText("0");


        absentHoursText.setText("Absent Hours:");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teachingHoursText)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(employeeIDText)))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teachingHoursField)
                            .addComponent(employeeIDSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(absentHoursText)
                                .addGap(18, 18, 18)
                                .addComponent(absentHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(overloadText)
                                    .addGap(18, 18, 18)
                                    .addComponent(overloadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(overloadPayText)
                                        .addComponent(payText)
                                        .addComponent(payRateText)
                                        .addComponent(allowanceText)
                                        .addComponent(deductionsText)
                                        .addComponent(overtimePayText)
                                        .addComponent(overtimeRateText))
                                    .addGap(18, 18, 18)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(payRateNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                        .addComponent(overloadPayNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(allowanceNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(payNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deductionsNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(overtimePayNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(overtimeRateNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(calculateButton)))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIDText)
                    .addComponent(employeeIDSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teachingHoursText)
                    .addComponent(teachingHoursField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overloadText)
                    .addComponent(overloadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(absentHoursText)
                    .addComponent(absentHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payRateText)
                    .addComponent(payRateNumberText))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overloadPayText)
                    .addComponent(overloadPayNumberText))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allowanceText)
                    .addComponent(allowanceNumberText))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deductionsText)
                    .addComponent(deductionsNumberText))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overtimePayText)
                    .addComponent(overtimePayNumberText))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overtimeRateText)
                    .addComponent(overtimeRateNumberText))
                .addGap(31, 31, 31)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payText)
                    .addComponent(payNumberText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculateButton)
                .addGap(42, 42, 42))
        );

        container.add(mainPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        String employeeID = (String) employeeIDSelection.getSelectedItem();


        boolean isTeaching = Database.getIsTeaching(employeeID);
        double payRate = Database.getPayRate(employeeID);
        double teachingHours = Integer.parseInt(teachingHoursField.getText());
        double noOfAbsentHours = Integer.parseInt(absentHoursTextField.getText());
        double allowance = payRate * .1;
        double pay;
        System.out.println("Pay rate: " + payRate);
        System.out.println("Allowance: " + allowance);
        if(isTeaching){
            double deductions = payRate * noOfAbsentHours;
            double overloadPay = Double.parseDouble(overloadTextField.getText());
            pay = (teachingHours * payRate + overloadPay + allowance ) - deductions;
            System.out.println("Deductions: " + deductions);
            deductionsNumberText.setText(Double.toString(deductions));
            payNumberText.setText(Double.toString(pay));

        }else{
            double noOfOvertimeHours = Double.parseDouble(overloadTextField.getText());
            double overtimeRate = (payRate/30/8) * 1.20;
            double overtimePay = noOfOvertimeHours * overtimeRate;
            double deductions = (payRate/30/8) * noOfAbsentHours;
            pay = (teachingHours * payRate + overtimePay + allowance ) - deductions;

            overtimeRateNumberText.setText(Double.toString(overtimeRate));
            overtimePayNumberText.setText(Double.toString(overtimePay));
            deductionsNumberText.setText(Double.toString(deductions));
            payNumberText.setText(Double.toString(pay));
        }
        payRateNumberText.setText(Double.toString(payRate));
        allowanceNumberText.setText(Double.toString(allowance));
        System.out.println("pay: " + pay);
    }//GEN-LAST:event_calculateButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel absentHoursText;
    private javax.swing.JTextField absentHoursTextField;
    private javax.swing.JLabel allowanceNumberText;
    private javax.swing.JLabel allowanceText;
    private javax.swing.JButton calculateButton;
    private javax.swing.JPanel container;
    private javax.swing.JLabel deductionsNumberText;
    private javax.swing.JLabel deductionsText;
    private javax.swing.JComboBox<String> employeeIDSelection;
    private javax.swing.JLabel employeeIDText;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel overloadPayNumberText;
    private javax.swing.JLabel overloadPayText;
    private javax.swing.JLabel overloadText;
    private javax.swing.JTextField overloadTextField;
    private javax.swing.JLabel overtimePayNumberText;
    private javax.swing.JLabel overtimePayText;
    private javax.swing.JLabel overtimeRateNumberText;
    private javax.swing.JLabel overtimeRateText;
    private javax.swing.JLabel payNumberText;
    private javax.swing.JLabel payRateNumberText;
    private javax.swing.JLabel payRateText;
    private javax.swing.JLabel payText;
    private javax.swing.JTextField teachingHoursField;
    private javax.swing.JLabel teachingHoursText;
    // End of variables declaration//GEN-END:variables
}
