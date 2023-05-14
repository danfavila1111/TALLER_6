package com.example.project2687365.util;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.SQLExceptionList;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL =
            "jdbc:mysql://localhost:3306/tyw?serverTimezone=America/Bogota";
    private static final String User = "tyw_user";
    private static final String Pass = "tyw_password";
    private static BasicDataSource pool;
    public static BasicDataSource getInstance() throws SQLException {
        if (pool == null){
            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(User);
            pool.setPassword(Pass);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }
        return pool;
    }

    public static Connection getConnection() throws SQLException{
        return getInstance().getConnection();
    }
}
