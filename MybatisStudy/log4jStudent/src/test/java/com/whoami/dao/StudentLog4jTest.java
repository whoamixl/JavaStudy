package com.whoami.dao;

import com.whoami.pojo.StudentLog4j;
import com.whoami.utils.StudentLog4jUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
public class StudentLog4jTest {
    private static Logger logger = Logger.getLogger(StudentLog4jTest.class);
    @Test
    public void getStudentLog4j(){
        SqlSession sqlSession = StudentLog4jUtils.getSqlSession();
        StudentLog4jMapper mapper = sqlSession.getMapper(StudentLog4jMapper.class);

        List<StudentLog4j> studentLog4j = mapper.getStudentLog4j();
        for (StudentLog4j log4j : studentLog4j) {
            System.out.println(log4j);
        }


        sqlSession.close();
    }

    @Test
    public void getStudentLog4jByMap(){
        SqlSession sqlSession = StudentLog4jUtils.getSqlSession();
        StudentLog4jMapper mapper = sqlSession.getMapper(StudentLog4jMapper.class);
        List<Map> list = mapper.getStudentLog4jByMap();
        for (Map map : list) {
            System.out.println(map);
            logger.debug("kais");

        }
        sqlSession.close();
    }

    @Test
    public void getStudentLog4jByID(){
        SqlSession sqlSession = StudentLog4jUtils.getSqlSession();
        StudentLog4jMapper mapper = sqlSession.getMapper(StudentLog4jMapper.class);
        Map map = new HashMap();
        map.put("userId",4);

        List<Map> studentLog4jByID = mapper.getStudentLog4jByID(map);

        for (Map map1 : studentLog4jByID) {
            System.out.println(map1);

        }
        sqlSession.close();
    }


    public void getStudentLog4jByLimit(int startIndex , int pageSize){
        SqlSession sqlSession = StudentLog4jUtils.getSqlSession();
        StudentLog4jMapper mapper = sqlSession.getMapper(StudentLog4jMapper.class);
        Map map = new HashMap();
        map.put("startIndex",startIndex);
        map.put("pageSize",pageSize);

        List<Map> studentLog4jByID = mapper.getStudentLog4jByLimit(map);

        for (Map map1 : studentLog4jByID) {
            System.out.println(map1);

        }
        sqlSession.close();
    }

    @Test
    public void limitTest(){
        this.getStudentLog4jByLimit(1,5);
    }
}

