package com.whoami.dao;

import com.whoami.pojo.Student;
import com.whoami.pojo.Student01;

import java.util.List;
import java.util.Map;

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

    //动态sql
    List<Student01> getStudentByDyanmicg(Map map);

    List<Student01> getStudentByForeach(Map map);
}
