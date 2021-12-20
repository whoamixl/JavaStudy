package com.whoami.dao;

import com.whoami.pojo.StudentLog4j;

import java.util.List;
import java.util.Map;

public interface StudentLog4jMapper {
    List<StudentLog4j> getStudentLog4j();

    List getStudentLog4jByMap();

    List<Map> getStudentLog4jByID(Map map);

    List getStudentLog4jByLimit(Map map);
}
