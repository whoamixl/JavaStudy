package com.whoami.dao;

import com.whoami.pojo.Student01;
import com.whoami.utils.MybatisUtils_01;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
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

    @Test
    public void getStudentByDyanmicg(){
        SqlSession sqlSession = MybatisUtils_01.getSession();
        StudentMapper01 mapper = sqlSession.getMapper(StudentMapper01.class);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
//        objectObjectHashMap.put("name", "小于");
        objectObjectHashMap.put("sex",1);
        objectObjectHashMap.put("age",22);
        List<Student01> studentByDyanmicg = mapper.getStudentByDyanmicg(objectObjectHashMap);
        for (Student01 student01 : studentByDyanmicg) {
            System.out.println(student01);
        }
    }

    @Test
    public void getStudentByForeach(){
        SqlSession sqlSession = MybatisUtils_01.getSession();
        StudentMapper01 mapper = sqlSession.getMapper(StudentMapper01.class);
        ArrayList<Object> item = new ArrayList<>();
        item.add(22);
        item.add(23);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("item1",item);
        List<Student01> studentByDyanmicg = mapper.getStudentByForeach(objectObjectHashMap);
        for (Student01 student01 : studentByDyanmicg) {
            System.out.println(student01);
        }
    }
}
