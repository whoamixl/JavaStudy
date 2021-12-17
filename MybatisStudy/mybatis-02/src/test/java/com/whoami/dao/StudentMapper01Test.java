package com.whoami.dao;

import com.whoami.pojo.Student01;
import com.whoami.utils.MybatisUtils_01;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapper01Test {

    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils_01.getSession();
        StudentMapper01 mapper = sqlSession.getMapper(com.whoami.dao.StudentMapper01.class);
        List<Student01> studentList = mapper.getStudent01();
        for (Student01 student : studentList) {
            System.out.println(student);

        }
        sqlSession.close();
    }

    @Test
    public void getStudentByID(){
        SqlSession sqlSession = MybatisUtils_01.getSession();
        StudentMapper01 mapper = sqlSession.getMapper(com.whoami.dao.StudentMapper01.class);
        List<Student01> studentList = mapper.getStudentByID(4);
        for (Student01 student : studentList) {
            System.out.println(student);

        }
        sqlSession.close();
    }

    @Test
    public void addStudent(){
        SqlSession sqlSession = MybatisUtils_01.getSession();
        StudentMapper01 mapper = sqlSession.getMapper(com.whoami.dao.StudentMapper01.class);
        Student01 student01 = new Student01();
        student01.setName("小怪");
        student01.setSex(1);
        student01.setAge(22);
        int i = mapper.addStudent(student01);
        sqlSession.commit();
        System.out.println(i);
        sqlSession.close();
    }

    @Test
    public void updateStudent(){
        SqlSession sqlSession = MybatisUtils_01.getSession();
        StudentMapper01 mapper = sqlSession.getMapper(com.whoami.dao.StudentMapper01.class);
        Student01 student01 = new Student01();
        student01.setId(7);
        student01.setName("小柒");
        student01.setSex(1);
        student01.setAge(44);
        student01.setAddress("我在成都");
        int i = mapper.updateStudent(student01);
        sqlSession.commit();
        System.out.println(i);
        sqlSession.close();
    }


    @Test
    public void deleteStudentById(){
        SqlSession sqlSession = MybatisUtils_01.getSession();
        StudentMapper01 mapper = sqlSession.getMapper(com.whoami.dao.StudentMapper01.class);
        int i = mapper.deleteStudentById(6);
        sqlSession.commit();
        System.out.println(i);
        sqlSession.close();
    }
}
