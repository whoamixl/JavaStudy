package com.whoami.dao;

import com.whoami.pojo.StudentDyanmic;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/****
 * 多对一学习测试
 */
public interface StudentDyanmicMapper {
//    List<StudentDyanmic> getStudentSubjcet();

    List<StudentDyanmic> getStudentSubjcet(@Param("subjectId")int subjectId);

    List<StudentDyanmic> getStudentSubjcetByResult();

    List<StudentDyanmic> getStudentSubjcetCollection();
}
