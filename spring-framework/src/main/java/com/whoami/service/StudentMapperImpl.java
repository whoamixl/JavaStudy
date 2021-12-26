package com.whoami.service;

import com.whoami.pojo.Student;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentMapperImpl extends SqlSessionDaoSupport implements StudentMapper {
    @Override
    public List<Student> getStudent() {
        return getSqlSession().getMapper(StudentMapper.class).getStudent();
    }
}
