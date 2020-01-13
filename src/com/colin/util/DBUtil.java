package com.colin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil
{
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/zgf_blog";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName(DRIVER);
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

    public static void closeAll(AutoCloseable... autoCloseables)
    {
        for (AutoCloseable autoCloseable : autoCloseables) {
            try {
                autoCloseable.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
