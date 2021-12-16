package com.yxl.lession02.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Utils_3_Test {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils_3.getConn();
            String sql = "SELECT * FROM `student`";
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();

            while (rs.next()) {
                System.out.println("姓名是："+rs.getObject("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils_3.release(conn,pre,rs);
        }

    }
}
