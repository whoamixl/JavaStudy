package com.yxl.lession02.utils;

import javax.xml.stream.StreamFilter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils_2 {
    private static String driver = null;
    private static String url = null;
    private static String username = null;
    private static String password = null;

    static {
        InputStream in = JdbcUtils_2.class.getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void test(){
        System.out.println("开始了");
    }
    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }

    public static void release(Connection conn, PreparedStatement pre, ResultSet rs){
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pre!=null){
            try {
                pre.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
