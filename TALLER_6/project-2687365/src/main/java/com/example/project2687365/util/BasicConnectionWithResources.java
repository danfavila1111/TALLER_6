package com.example.project2687365.util;

import javax.crypto.CipherInputStream;
import java.sql.*;

public class BasicConnectionWithResources {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tyw?serverTimezone=America/Bogota";
        String username = "tyw";
        String password = "0000";
        String sql = "SELECT * FROM tyw.users_tbl";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getString("user_firstname"));
                System.out.print(" | ");
                System.out.println(rs.getString("user_lastname"));
                System.out.print(" | ");
                System.out.println(rs.getString("user_email"));
                System.out.print(" | ");
                System.out.println(rs.getString("user_password"));
                System.out.print(" | ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
