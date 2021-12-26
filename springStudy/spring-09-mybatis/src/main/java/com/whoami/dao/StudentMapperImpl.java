package com.whoami.dao;

import com.whoami.pojo.Student;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class StudentMapperImpl implements StudentMapper{

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Student> getStudent() {
        StudentMapper mapper =  sqlSession.getMapper(StudentMapper.class);
        return mapper.getStudent();
    }
}
