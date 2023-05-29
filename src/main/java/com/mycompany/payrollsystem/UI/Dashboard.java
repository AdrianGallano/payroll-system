/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.payrollsystem.UI;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.payrollsystem.Database;
import com.mycompany.payrollsystem.PayrollSystem;
import com.mycompany.payrollsystem.UI.AddRecord.*;

import java.awt.Dimension;
import java.awt.Window;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {


    public Dashboard() {
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
        sidePanel = new javax.swing.JPanel();
        topSidePanel = new javax.swing.JPanel();
        topSidePanelGap = new javax.swing.JPanel();
        payrollText = new javax.swing.JLabel();
        systemText = new javax.swing.JLabel();
        employeeContainer = new javax.swing.JPanel();
        employeeLabel = new java.awt.Label();
        addEmployee = new javax.swing.JButton();
        editEmployee = new javax.swing.JButton();
        deleteEmployee = new javax.swing.JButton();
        departmentContainer = new javax.swing.JPanel();
        departmentLabel = new java.awt.Label();
        addDepartment = new javax.swing.JButton();
        editDepartment = new javax.swing.JButton();
        deleteDepartment = new javax.swing.JButton();
        positionContainer = new javax.swing.JPanel();
        positionLabel = new java.awt.Label();
        addPosition = new javax.swing.JButton();
        editPosition = new javax.swing.JButton();
        deletePosition = new javax.swing.JButton();
        calculatePayroll = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        topMainPanel = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(50, 50), new java.awt.Dimension(0, 32767));
        label2 = new java.awt.Label();
        centerMainPanel = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(50, 50), new java.awt.Dimension(0, 32767));
        Overview = new javax.swing.JTabbedPane();
        employeeTablePanel = new javax.swing.JPanel();
        employeeTableScroll = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        departmentTablePanel = new javax.swing.JPanel();
        departmentTableScroll = new javax.swing.JScrollPane();
        departmentTable = new javax.swing.JTable();
        positionTablePanel = new javax.swing.JPanel();
        positionTableScroll = new javax.swing.JScrollPane();
        positionTable = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        bottomMainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payroll System");
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        container.setForeground(new java.awt.Color(242, 242, 242));
        container.setPreferredSize(new java.awt.Dimension(1032, 720));
        container.setLayout(new java.awt.BorderLayout());

        sidePanel.setBackground(new java.awt.Color(38, 38, 38));
        sidePanel.setForeground(new java.awt.Color(242, 242, 242));
        sidePanel.setName(""); // NOI18N
        sidePanel.setPreferredSize(new java.awt.Dimension(200, 720));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        sidePanel.setLayout(flowLayout1);

        topSidePanel.setBackground(new java.awt.Color(38, 38, 38));
        topSidePanel.setPreferredSize(new java.awt.Dimension(200, 200));

        topSidePanelGap.setBackground(new java.awt.Color(38, 38, 38));
        topSidePanelGap.setPreferredSize(new java.awt.Dimension(40, 50));

        javax.swing.GroupLayout topSidePanelGapLayout = new javax.swing.GroupLayout(topSidePanelGap);
        topSidePanelGap.setLayout(topSidePanelGapLayout);
        topSidePanelGapLayout.setHorizontalGroup(
            topSidePanelGapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        topSidePanelGapLayout.setVerticalGroup(
            topSidePanelGapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topSidePanel.add(topSidePanelGap);

        payrollText.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        payrollText.setForeground(new java.awt.Color(242, 242, 242));
        payrollText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payrollText.setText("PAYROLL");
        payrollText.setPreferredSize(new java.awt.Dimension(200, 50));
        topSidePanel.add(payrollText);

        systemText.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        systemText.setForeground(new java.awt.Color(242, 242, 242));
        systemText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemText.setText("SYSTEM");
        systemText.setPreferredSize(new java.awt.Dimension(200, 50));
        topSidePanel.add(systemText);

        sidePanel.add(topSidePanel);

        employeeContainer.setBackground(new java.awt.Color(38, 38, 38));
        employeeContainer.setPreferredSize(new java.awt.Dimension(200, 120));
        employeeContainer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        employeeLabel.setAlignment(java.awt.Label.CENTER);
        employeeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        employeeLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        employeeLabel.setForeground(new java.awt.Color(242, 242, 242));
        employeeLabel.setName(""); // NOI18N
        employeeLabel.setPreferredSize(new java.awt.Dimension(90, 18));
        employeeLabel.setText("Employee");
        employeeContainer.add(employeeLabel);

        addEmployee.setBackground(new java.awt.Color(38, 38, 38));
        addEmployee.setForeground(new java.awt.Color(242, 242, 242));
        addEmployee.setText("Add record");
        addEmployee.setToolTipText("");
        addEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        addEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addEmployee.setPreferredSize(new java.awt.Dimension(120, 20));
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });
        employeeContainer.add(addEmployee);

        editEmployee.setBackground(new java.awt.Color(38, 38, 38));
        editEmployee.setForeground(new java.awt.Color(242, 242, 242));
        editEmployee.setText("Edit record");
        editEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        editEmployee.setPreferredSize(new java.awt.Dimension(120, 20));
        editEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeActionPerformed(evt);
            }
        });
        employeeContainer.add(editEmployee);

        deleteEmployee.setBackground(new java.awt.Color(38, 38, 38));
        deleteEmployee.setForeground(new java.awt.Color(242, 242, 242));
        deleteEmployee.setText("Delete record");
        deleteEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        deleteEmployee.setPreferredSize(new java.awt.Dimension(120, 20));
        deleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeActionPerformed(evt);
            }
        });
        employeeContainer.add(deleteEmployee);

        sidePanel.add(employeeContainer);

        departmentContainer.setBackground(new java.awt.Color(38, 38, 38));
        departmentContainer.setPreferredSize(new java.awt.Dimension(200, 120));
        departmentContainer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        departmentLabel.setAlignment(java.awt.Label.CENTER);
        departmentLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        departmentLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        departmentLabel.setForeground(new java.awt.Color(242, 242, 242));
        departmentLabel.setName(""); // NOI18N
        departmentLabel.setText("Department");
        departmentContainer.add(departmentLabel);

        addDepartment.setBackground(new java.awt.Color(38, 38, 38));
        addDepartment.setForeground(new java.awt.Color(242, 242, 242));
        addDepartment.setText("Add record");
        addDepartment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        addDepartment.setPreferredSize(new java.awt.Dimension(120, 20));
        addDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDepartmentActionPerformed(evt);
            }
        });
        departmentContainer.add(addDepartment);

        editDepartment.setBackground(new java.awt.Color(38, 38, 38));
        editDepartment.setForeground(new java.awt.Color(242, 242, 242));
        editDepartment.setText("Edit record");
        editDepartment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        editDepartment.setPreferredSize(new java.awt.Dimension(120, 20));
        editDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDepartmentActionPerformed(evt);
            }
        });
        departmentContainer.add(editDepartment);

        deleteDepartment.setBackground(new java.awt.Color(38, 38, 38));
        deleteDepartment.setForeground(new java.awt.Color(242, 242, 242));
        deleteDepartment.setText("Delete Record");
        deleteDepartment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        deleteDepartment.setPreferredSize(new java.awt.Dimension(120, 20));
        deleteDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDepartmentActionPerformed(evt);
            }
        });
        departmentContainer.add(deleteDepartment);

        sidePanel.add(departmentContainer);

        positionContainer.setBackground(new java.awt.Color(38, 38, 38));
        positionContainer.setPreferredSize(new java.awt.Dimension(200, 120));
        positionContainer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        positionLabel.setAlignment(java.awt.Label.CENTER);
        positionLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        positionLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        positionLabel.setForeground(new java.awt.Color(242, 242, 242));
        positionLabel.setName(""); // NOI18N
        positionLabel.setText("Position");
        positionContainer.add(positionLabel);

        addPosition.setBackground(new java.awt.Color(38, 38, 38));
        addPosition.setForeground(new java.awt.Color(242, 242, 242));
        addPosition.setText("Add record");
        addPosition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        addPosition.setPreferredSize(new java.awt.Dimension(120, 20));
        addPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPositionActionPerformed(evt);
            }
        });
        positionContainer.add(addPosition);

        editPosition.setBackground(new java.awt.Color(38, 38, 38));
        editPosition.setForeground(new java.awt.Color(242, 242, 242));
        editPosition.setText("Edit record");
        editPosition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        editPosition.setPreferredSize(new java.awt.Dimension(120, 20));
        editPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPositionActionPerformed(evt);
            }
        });
        positionContainer.add(editPosition);

        deletePosition.setBackground(new java.awt.Color(38, 38, 38));
        deletePosition.setForeground(new java.awt.Color(242, 242, 242));
        deletePosition.setText("Delete Record");
        deletePosition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        deletePosition.setPreferredSize(new java.awt.Dimension(120, 20));
        deletePosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePositionActionPerformed(evt);
            }
        });
        positionContainer.add(deletePosition);

        sidePanel.add(positionContainer);

        calculatePayroll.setText("Calculate Payroll");
        calculatePayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatePayrollActionPerformed(evt);
            }
        });
        sidePanel.add(calculatePayroll);

        container.add(sidePanel, java.awt.BorderLayout.WEST);

        mainPanel.setBackground(new java.awt.Color(13, 13, 13));
        mainPanel.setForeground(new java.awt.Color(242, 242, 242));
        mainPanel.setPreferredSize(new java.awt.Dimension(832, 720));
        mainPanel.setLayout(new java.awt.BorderLayout());

        topMainPanel.setBackground(new java.awt.Color(13, 13, 13));
        topMainPanel.setPreferredSize(new java.awt.Dimension(100, 100));
        topMainPanel.setLayout(new java.awt.BorderLayout());
        topMainPanel.add(filler1, java.awt.BorderLayout.CENTER);

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label2.setForeground(new java.awt.Color(242, 242, 242));
        label2.setText("Dashboard");
        topMainPanel.add(label2, java.awt.BorderLayout.PAGE_END);

        mainPanel.add(topMainPanel, java.awt.BorderLayout.NORTH);

        centerMainPanel.setBackground(new java.awt.Color(13, 13, 13));
        centerMainPanel.setPreferredSize(new java.awt.Dimension(832, 1032));
        centerMainPanel.setLayout(new java.awt.GridBagLayout());
        centerMainPanel.add(filler2, new java.awt.GridBagConstraints());

        Overview.setPreferredSize(new java.awt.Dimension(700, 400));

        employeeTablePanel.setPreferredSize(new java.awt.Dimension(0, 0));

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First name", "Last name", "Department", "Position"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTableScroll.setViewportView(employeeTable);
        if (employeeTable.getColumnModel().getColumnCount() > 0) {
            employeeTable.getColumnModel().getColumn(0).setResizable(false);
            employeeTable.getColumnModel().getColumn(1).setResizable(false);
            employeeTable.getColumnModel().getColumn(2).setResizable(false);
            employeeTable.getColumnModel().getColumn(3).setResizable(false);
            employeeTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout employeeTablePanelLayout = new javax.swing.GroupLayout(employeeTablePanel);
        employeeTablePanel.setLayout(employeeTablePanelLayout);
        employeeTablePanelLayout.setHorizontalGroup(
            employeeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(employeeTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        employeeTablePanelLayout.setVerticalGroup(
            employeeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(employeeTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        Overview.addTab("Employee", employeeTablePanel);

        departmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        departmentTableScroll.setViewportView(departmentTable);
        if (departmentTable.getColumnModel().getColumnCount() > 0) {
            departmentTable.getColumnModel().getColumn(0).setResizable(false);
            departmentTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout departmentTablePanelLayout = new javax.swing.GroupLayout(departmentTablePanel);
        departmentTablePanel.setLayout(departmentTablePanelLayout);
        departmentTablePanelLayout.setHorizontalGroup(
            departmentTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(departmentTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        departmentTablePanelLayout.setVerticalGroup(
            departmentTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(departmentTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        Overview.addTab("Department", departmentTablePanel);

        positionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Teaching / Non Teaching", "Pay rate", "Required Hours"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        positionTableScroll.setViewportView(positionTable);
        if (positionTable.getColumnModel().getColumnCount() > 0) {
            positionTable.getColumnModel().getColumn(0).setResizable(false);
            positionTable.getColumnModel().getColumn(1).setResizable(false);
            positionTable.getColumnModel().getColumn(2).setResizable(false);
            positionTable.getColumnModel().getColumn(3).setResizable(false);
            positionTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout positionTablePanelLayout = new javax.swing.GroupLayout(positionTablePanel);
        positionTablePanel.setLayout(positionTablePanelLayout);
        positionTablePanelLayout.setHorizontalGroup(
            positionTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        positionTablePanelLayout.setVerticalGroup(
            positionTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        Overview.addTab("Position", positionTablePanel);

        centerMainPanel.add(Overview, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        centerMainPanel.add(jDesktopPane1, new java.awt.GridBagConstraints());

        mainPanel.add(centerMainPanel, java.awt.BorderLayout.CENTER);

        bottomMainPanel.setBackground(new java.awt.Color(13, 13, 13));
        bottomMainPanel.setPreferredSize(new java.awt.Dimension(100, 100));
        mainPanel.add(bottomMainPanel, java.awt.BorderLayout.SOUTH);

        container.add(mainPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeActionPerformed
        String employeeID = (String) processSelectedRow(employeeTable);
        Database.deleteRecord("employees", "employeeID", employeeID);
    }//GEN-LAST:event_deleteEmployeeActionPerformed

    private void editEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editEmployeeActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        AddRecordEmployee addRecordEmployee = new AddRecordEmployee();
        centerWindow(addRecordEmployee);
        addRecordEmployee.setVisible(true);
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void addPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPositionActionPerformed
        AddRecordPosition addRecordPosition = new AddRecordPosition();
        centerWindow(addRecordPosition);
        addRecordPosition.setVisible(true);

    }//GEN-LAST:event_addPositionActionPerformed

    private void editPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPositionActionPerformed

    private void deletePositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePositionActionPerformed
        int positionID = (Integer) processSelectedRow(positionTable);
        Database.deleteRecord("positions", "positionID", positionID);
    }//GEN-LAST:event_deletePositionActionPerformed

    private void calculatePayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatePayrollActionPerformed
        PayrollCalculator payrollCalculator = new PayrollCalculator();
        centerWindow(payrollCalculator);
        payrollCalculator.setVisible(true);
    }//GEN-LAST:event_calculatePayrollActionPerformed

    private void addDepartmentActionPerformed(java.awt.event.ActionEvent evt) {
        AddRecordDepartment addRecordDepartment = new AddRecordDepartment();
        centerWindow(addRecordDepartment);
        addRecordDepartment.setVisible(true);
    }

    private void editDepartmentActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }

    private void deleteDepartmentActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        int departmentID = (Integer) processSelectedRow(departmentTable);
        Database.deleteRecord("departments", "departmentID", departmentID);
    }


    public static void generateTableEmployeeRecords(String employeeID, String firstName, String lastName, int department, int position) {
        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        Object[] newRecord = {employeeID, firstName, lastName, department, position};
        model.addRow(newRecord);

        employeeTable.revalidate();
        employeeTable.repaint();
    }

    public static void generateTableDepartmentRecords(int departmentID, String departmentName) {
        DefaultTableModel model = (DefaultTableModel) departmentTable.getModel();
        Object[] newRecord = {departmentID, departmentName};
        model.addRow(newRecord);

        departmentTable.revalidate();
        departmentTable.repaint();
    }

    public static void generateTablePositionRecords(int positionID, String positionName, boolean isTeaching, int payRate, int requiredHours) {
        DefaultTableModel model = (DefaultTableModel) positionTable.getModel();
        Object[] newRecord = {positionID, positionName, isTeaching, payRate, requiredHours};
        model.addRow(newRecord);

        positionTable.revalidate();
        positionTable.repaint();
    }

    public void generateTables() {
        Database.readAllEmployeeRecord(this);
        Database.readAllDepartmentRecord(this);
        Database.readAllPositionRecord(this);
    }

    public static void centerWindow(Window window) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int windowWidth = window.getWidth();
        int windowHeight = window.getHeight();

        int x = (screenWidth - windowWidth) / 2;
        int y = (screenHeight - windowHeight) / 2;

        window.setLocation(x, y);
    }

    private Object processSelectedRow(JTable table) {
        int selectedRow = table.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        if (selectedRow != -1) {
            Object value = table.getValueAt(selectedRow, 0);
            tableModel.removeRow(selectedRow);
            return value;
        }
        return null;
    }

    // process selected row to return the datas

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Overview;
    private javax.swing.JButton addDepartment;
    private javax.swing.JButton addEmployee;
    private javax.swing.JButton addPosition;
    private javax.swing.JPanel bottomMainPanel;
    private javax.swing.JButton calculatePayroll;
    private javax.swing.JPanel centerMainPanel;
    private javax.swing.JPanel container;
    private javax.swing.JButton deleteDepartment;
    private javax.swing.JButton deleteEmployee;
    private javax.swing.JButton deletePosition;
    private javax.swing.JPanel departmentContainer;
    private java.awt.Label departmentLabel;
    private static javax.swing.JTable departmentTable;
    private javax.swing.JPanel departmentTablePanel;
    private javax.swing.JScrollPane departmentTableScroll;
    private javax.swing.JButton editDepartment;
    private javax.swing.JButton editEmployee;
    private javax.swing.JButton editPosition;
    private javax.swing.JPanel employeeContainer;
    private java.awt.Label employeeLabel;
    private static javax.swing.JTable employeeTable;
    private javax.swing.JPanel employeeTablePanel;
    private javax.swing.JScrollPane employeeTableScroll;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private java.awt.Label label2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel payrollText;
    private javax.swing.JPanel positionContainer;
    private java.awt.Label positionLabel;
    private static javax.swing.JTable positionTable;
    private javax.swing.JPanel positionTablePanel;
    private javax.swing.JScrollPane positionTableScroll;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel systemText;
    private javax.swing.JPanel topMainPanel;
    private javax.swing.JPanel topSidePanel;
    private javax.swing.JPanel topSidePanelGap;
    // End of variables declaration//GEN-END:variables
}
