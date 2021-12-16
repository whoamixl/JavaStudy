package com.whoami.dao;

import com.whoami.pojo.Student;
import com.whoami.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.crypto.interfaces.PBEKey;
import java.util.List;

public class StudentDaoTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
}
