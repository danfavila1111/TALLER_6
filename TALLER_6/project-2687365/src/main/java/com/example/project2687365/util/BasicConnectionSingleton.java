package com.example.project2687365.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicConnectionSingleton {
    private static String url = "jdbc:mysql://localhost:3306/tyw?serverTimezone=America/Bogota";
    private static String user = "tyw";
    private static String pass = "0000";
    private static Connection conn;

    public static Connection getInstance() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, user, pass);
        }
        return conn;
    }
}
