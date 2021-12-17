package com.whoami.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils_01 {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String resoure = "mybatis-config01.xml";
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream(resoure);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
