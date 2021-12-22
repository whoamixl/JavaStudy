package com.whoami.dao;

import com.whoami.pojo.StudentDyanmic;
import com.whoami.utils.StudentDyanmicUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class StudentDyanmicMapperTest {

//    @Test
//    public void getStudentSubjcetTest(){
//
//        SqlSession sqlSession = StudentDyanmicUtils.getSqlSession();
//        StudentDyanmicMapper mapper = sqlSession.getMapper(StudentDyanmicMapper.class);
//        List<StudentDyanmic> studentSubjcet = mapper.getStudentSubjcet();
//        for (StudentDyanmic studentDyanmic : studentSubjcet) {
//            System.out.println(studentDyanmic);
//        }
//
//        sqlSession.close();
//    }

    @Test
    public void getStudentSubjcetBySubjectNameTest(){

        SqlSession sqlSession = StudentDyanmicUtils.getSqlSession();
        StudentDyanmicMapper mapper = sqlSession.getMapper(StudentDyanmicMapper.class);
        List<StudentDyanmic> studentSubjcet = mapper.getStudentSubjcet(1);
        for (StudentDyanmic studentDyanmic : studentSubjcet) {
            System.out.println(studentDyanmic);
        }

        sqlSession.close();
    }

    @Test
    public void getStudentSubjcetByResultTest(){

        SqlSession sqlSession = StudentDyanmicUtils.getSqlSession();
        StudentDyanmicMapper mapper = sqlSession.getMapper(StudentDyanmicMapper.class);
        List<StudentDyanmic> studentSubjcetByResult = mapper.getStudentSubjcetByResult();
        for (StudentDyanmic studentDyanmic : studentSubjcetByResult) {
            System.out.println(studentDyanmic);

        }

        sqlSession.close();
    }
}
