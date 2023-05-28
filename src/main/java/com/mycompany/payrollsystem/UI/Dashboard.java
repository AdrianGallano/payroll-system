/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.payrollsystem.UI;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

/**
 *
 * @author Aid
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton10 = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        topSidePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeContainer = new javax.swing.JPanel();
        employeeLabel = new java.awt.Label();
        addEmployee = new javax.swing.JButton();
        editEmployee = new javax.swing.JButton();
        deleteEmployee = new javax.swing.JButton();
        positionContainer = new javax.swing.JPanel();
        positionLabel = new java.awt.Label();
        addPosition = new javax.swing.JButton();
        editPosition = new javax.swing.JButton();
        deletePosition = new javax.swing.JButton();
        departmentContainer = new javax.swing.JPanel();
        departmentLabel = new java.awt.Label();
        addDepartment = new javax.swing.JButton();
        editDepartment = new javax.swing.JButton();
        deleteDepartment = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        topMainPanel = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(50, 50), new java.awt.Dimension(0, 32767));
        label2 = new java.awt.Label();
        centerMainPanel = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(50, 50), new java.awt.Dimension(0, 32767));
        Overview = new javax.swing.JTabbedPane();
        employeeTablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        departmentTablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        positionTablePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        bottomMainPanel = new javax.swing.JPanel();

        jButton10.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

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

        jPanel1.setBackground(new java.awt.Color(38, 38, 38));
        jPanel1.setPreferredSize(new java.awt.Dimension(40, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topSidePanel.add(jPanel1);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PAYROLL");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 50));
        topSidePanel.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SYSTEM");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 50));
        topSidePanel.add(jLabel3);

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
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
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout employeeTablePanelLayout = new javax.swing.GroupLayout(employeeTablePanel);
        employeeTablePanel.setLayout(employeeTablePanelLayout);
        employeeTablePanelLayout.setHorizontalGroup(
            employeeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        employeeTablePanelLayout.setVerticalGroup(
            employeeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );

        Overview.addTab("Employee", employeeTablePanel);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
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
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout departmentTablePanelLayout = new javax.swing.GroupLayout(departmentTablePanel);
        departmentTablePanel.setLayout(departmentTablePanelLayout);
        departmentTablePanelLayout.setHorizontalGroup(
            departmentTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        departmentTablePanelLayout.setVerticalGroup(
            departmentTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );

        Overview.addTab("Department", departmentTablePanel);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Teaching / Non Teaching", "Pay rate", "Required Hours"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout positionTablePanelLayout = new javax.swing.GroupLayout(positionTablePanel);
        positionTablePanel.setLayout(positionTablePanelLayout);
        positionTablePanelLayout.setHorizontalGroup(
            positionTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        positionTablePanelLayout.setVerticalGroup(
            positionTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );

        Overview.addTab("Position", positionTablePanel);

        centerMainPanel.add(Overview, new java.awt.GridBagConstraints());

        mainPanel.add(centerMainPanel, java.awt.BorderLayout.CENTER);

        bottomMainPanel.setBackground(new java.awt.Color(13, 13, 13));
        bottomMainPanel.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout bottomMainPanelLayout = new javax.swing.GroupLayout(bottomMainPanel);
        bottomMainPanel.setLayout(bottomMainPanelLayout);
        bottomMainPanelLayout.setHorizontalGroup(
            bottomMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bottomMainPanelLayout.setVerticalGroup(
            bottomMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mainPanel.add(bottomMainPanel, java.awt.BorderLayout.SOUTH);

        container.add(mainPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void deleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteEmployeeActionPerformed

    private void editEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editEmployeeActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void addPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPositionActionPerformed

    private void editPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPositionActionPerformed

    private void deletePositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletePositionActionPerformed

    private void addDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDepartmentActionPerformed

    private void editDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editDepartmentActionPerformed

    private void deleteDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteDepartmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Overview;
    private javax.swing.JButton addDepartment;
    private javax.swing.JButton addEmployee;
    private javax.swing.JButton addPosition;
    private javax.swing.JPanel bottomMainPanel;
    private javax.swing.JPanel centerMainPanel;
    private javax.swing.JPanel container;
    private javax.swing.JButton deleteDepartment;
    private javax.swing.JButton deleteEmployee;
    private javax.swing.JButton deletePosition;
    private javax.swing.JPanel departmentContainer;
    private java.awt.Label departmentLabel;
    private javax.swing.JPanel departmentTablePanel;
    private javax.swing.JButton editDepartment;
    private javax.swing.JButton editEmployee;
    private javax.swing.JButton editPosition;
    private javax.swing.JPanel employeeContainer;
    private java.awt.Label employeeLabel;
    private javax.swing.JPanel employeeTablePanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private java.awt.Label label2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel positionContainer;
    private java.awt.Label positionLabel;
    private javax.swing.JPanel positionTablePanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel topMainPanel;
    private javax.swing.JPanel topSidePanel;
    // End of variables declaration//GEN-END:variables
}
