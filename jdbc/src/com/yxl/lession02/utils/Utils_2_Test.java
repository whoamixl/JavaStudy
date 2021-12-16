package com.yxl.lession02.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Utils_2_Test {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            conn = JdbcUtils_2.getConn();
            String sql = "SELECT * FROM `student`";
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getObject("name"));
            }
        }finally {
            JdbcUtils_2.release(conn,preparedStatement,resultSet);
        }



    }
}
