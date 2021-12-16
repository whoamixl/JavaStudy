package com.yxl.lession02;

import com.yxl.lession02.utils.JdbcUtils;

import java.sql.*;

public class UtilsTest {
    public static void main(String[] args) throws SQLException {
        new JdbcUtils();
        Connection conn = JdbcUtils.getConn();
        String sql = "SELECT * FROM `student`";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()){
            System.out.println(resultSet.getObject("name"));
            System.out.println(resultSet.getObject("sex"));
            System.out.println(resultSet.getObject("age"));
            System.out.println(resultSet.getObject("address"));
            System.out.println("===============================================================");
        }

        JdbcUtils.release(conn,statement,resultSet);
    }
}
