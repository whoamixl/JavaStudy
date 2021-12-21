package com.whoami.dao;

import com.whoami.pojo.StudentAnnotation;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

public interface StudentAnnotationMapper {
    @Select("select * from mysqlStudy.student")
    List<StudentAnnotation> getStudentAnnotation();

    @Insert("insert into mysqlStudy.student (name,sex,age,address) values(#{name},#{sex},#{age},#{address})")
    int insertAnnotation(HashMap map);

    @Update("update mysqlStudy.student set address=#{address} where id=#{id}")
    int updateAnnotation(@Param("address")String address,@Param("id")int id);

    @Delete("delete from mysqlStudy.student where name=#{name}")
    int deleteAnnotation(@Param("name")String name);

    @Update("update mysqlStudy.student set address=#{address} where id=#{id}")
    int updateAnnotationGeneral(HashMap map);
}
