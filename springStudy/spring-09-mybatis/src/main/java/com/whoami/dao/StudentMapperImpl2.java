package com.whoami.dao;

import com.whoami.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class StudentMapperImpl2 extends SqlSessionDaoSupport implements StudentMapper {

    @Override
    public List<Student> getStudent() {
        return getSqlSession().getMapper(StudentMapper.class).getStudent();
    }
}
