package com.whoami.dao;

import com.sun.corba.se.spi.orb.ParserImplBase;
import com.whoami.pojo.StudentAnnotation;
import com.whoami.utils.MybatisUtilsAnnotation;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class StudentAnnotationTest {
    @Test
    public void getStudentByAnnotation(){
        SqlSession sqlSession = MybatisUtilsAnnotation.getSqlSession();

        StudentAnnotationMapper mapper = sqlSession.getMapper(StudentAnnotationMapper.class);
        List<StudentAnnotation> studentAnnotation = mapper.getStudentAnnotation();
        for (StudentAnnotation annotation : studentAnnotation) {
            System.out.println(annotation);

        }

        sqlSession.close();
    }


    @Test
    public void addStudentByAnnotation(){
        SqlSession sqlSession = MybatisUtilsAnnotation.getSqlSession();

        StudentAnnotationMapper mapper = sqlSession.getMapper(StudentAnnotationMapper.class);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("name","小z");
        objectObjectHashMap.put("sex",1);
        objectObjectHashMap.put("age",23);
        objectObjectHashMap.put("address","中国成都");

        int i = mapper.insertAnnotation(objectObjectHashMap);
        sqlSession.commit();
        System.out.println(i);

        sqlSession.close();
    }

    @Test
    public void updateAnnotationParm(){
        SqlSession sqlSession = MybatisUtilsAnnotation.getSqlSession();

        StudentAnnotationMapper mapper = sqlSession.getMapper(StudentAnnotationMapper.class);
        int i = mapper.updateAnnotation("我在中国成都",16);
        System.out.println(i);
        sqlSession.commit();


        sqlSession.close();
    }

    @Test
    public void deleteAnnotationParm(){
        SqlSession sqlSession = MybatisUtilsAnnotation.getSqlSession();

        StudentAnnotationMapper mapper = sqlSession.getMapper(StudentAnnotationMapper.class);
        int i = mapper.deleteAnnotation("小龙");
        System.out.println(i);
        sqlSession.commit();


        sqlSession.close();
    }


    @Test
    public void updateAnnotationGeneral(){
        SqlSession sqlSession = MybatisUtilsAnnotation.getSqlSession();

        StudentAnnotationMapper mapper = sqlSession.getMapper(StudentAnnotationMapper.class);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("address","我在中国成都222");
        objectObjectHashMap.put("id",16);
        int i = mapper.updateAnnotationGeneral(objectObjectHashMap);
        System.out.println(i);
        sqlSession.commit();


        sqlSession.close();
    }
}
