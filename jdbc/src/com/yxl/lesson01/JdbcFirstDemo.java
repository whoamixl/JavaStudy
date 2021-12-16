package com.yxl.lesson01;


import java.sql.*;

//我的第一个jdbc程序
public class JdbcFirstDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2、新建连接
        String url ="jdbc:mysql://101.43.118.204:3306/mysqlStudy?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String name = "root";
        String passwd = "yxl123520.";
        //3、连接成功
        Connection connection = DriverManager.getConnection(url, name, passwd);

        //4、获取sql对象
        Statement statement = connection.createStatement();

        //5、用sql对象执行sql
        String sql = "SELECT * FROM `student`";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println(resultSet.getObject("name"));
            System.out.println(resultSet.getObject("sex"));
            System.out.println(resultSet.getObject("age"));
            System.out.println(resultSet.getObject("address"));
            System.out.println("===============================================================");
        }

        //6、释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
