package com.mycompany.payrollsystem;
import com.mycompany.payrollsystem.UI.Dashboard;

public class PayrollSystem {
    public static Dashboard currentDashboard;
    public static void main(String[] args) {
        Dashboard currentDashboard = new Dashboard();
        Dashboard.centerWindow(currentDashboard);
        currentDashboard.setVisible(true);
        Database.moveToDatabase("payrollDB");

        currentDashboard.generateTables();
    }
}
