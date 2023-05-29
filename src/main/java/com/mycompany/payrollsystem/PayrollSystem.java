package com.mycompany.payrollsystem;
import com.mycompany.payrollsystem.UI.Dashboard;

public class PayrollSystem {

    public static void main(String[] args) {

        Dashboard db = new Dashboard();
        Dashboard.centerWindow(db);
        db.setVisible(true);
        Database.moveToDatabase("payrollDB");
        
        db.generateTables();
    }
}
