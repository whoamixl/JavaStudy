package com.whoami.dao;

import com.whoami.pojo.Student;
import com.whoami.pojo.Student01;

import java.util.List;

public interface StudentMapper01 {
    List<Student01> getStudent01();

    //根据id查询
    List<Student01> getStudentByID(int id);


    //插入
    int addStudent(Student01 stu);

    //修改
    int updateStudent(Student01 stu);

    //删除
    int deleteStudentById(int id);
}
