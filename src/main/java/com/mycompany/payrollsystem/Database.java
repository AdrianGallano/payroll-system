package com.mycompany.payrollsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Create -> INSERT INTO
// Read -> SELECT
// Update -> UPDATE
// Delete -> DELETE
public class Database {

    private static Connection connection;
    private static Statement statement;
    private static String url = "jdbc:mysql://localhost:3306/";
    final private static String USERNAME = "root";
    final private static String PASSWORD = "";

    static void createDatabase(String databaseName) {
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);

            // Create a statement object
            statement = connection.createStatement();

            statement.executeUpdate("CREATE DATABASE " + databaseName);
            System.out.println("Database Creation Successsful");

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("Worked");
        moveToDatabase(databaseName);
        createTable();
        goBackToRoot();
    }

    static void deleteDatabase(String databaseName) {
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);

            // Create a statement object
            statement = connection.createStatement();

            statement.executeUpdate("DROP DATABASE " + databaseName);
            System.out.println("Database Deletion Successsful");

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }

    }

    static void moveToDatabase(String databaseName) {
        url += databaseName;
        System.out.println("Moved to " + url);
    }

    static void goBackToRoot() {
        url = "jdbc:mysql://localhost:3306/";
        System.out.println("Moved back to " + url);
    }

    static void createTable() {
        try {
            Connection connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            String createPositionsTableStatement = "CREATE TABLE positions" +
                    "(positionID INT AUTO_INCREMENT PRIMARY KEY," +
                    "positionName VARCHAR(50) NOT NULL," +
                    "isTeaching BOOLEAN NOT NULL," +
                    "payRate INT NOT NULL," +
                    "requiredHours INT NOT NULL);";

            String createDepartmentsTableStatement = "CREATE TABLE departments" +
                    "(departmentID INT AUTO_INCREMENT PRIMARY KEY," +
                    "departmentName VARCHAR(100) NOT NULL);";

            String createEmployeesTableStatement = "CREATE TABLE employees " +
                    "(employeeID VARCHAR(9) NOT NULL, " +
                    "firstName VARCHAR(50) NOT NULL, " +
                    "lastName VARCHAR(50) NOT NULL," +
                    "department INT NOT NULL," +
                    "position INT NOT NULL," +
                    "FOREIGN KEY (position) REFERENCES positions(positionID)," +
                    "FOREIGN KEY (department) REFERENCES departments(departmentID));";

            statement.executeUpdate(createPositionsTableStatement);
            statement.executeUpdate(createDepartmentsTableStatement);
            statement.executeUpdate(createEmployeesTableStatement);
            System.out.println("Table created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }


}
