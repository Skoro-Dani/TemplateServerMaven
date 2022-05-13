package com.skorolitniy.template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static String dbhost = "jdbc:mysql://localhost:3306/lifegate";
    private static String username = "root";
    private static String password = "";
    private static Connection conn;

    @SuppressWarnings("finally")
    public static Connection createNewDBconnection(){
        try {
            conn = DriverManager.getConnection(dbhost, username, password);
        } catch (SQLException e) {
            System.out.println("Cannot create database connection");
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
            e.printStackTrace();
        } finally {
            return conn;
        }
    }
}
