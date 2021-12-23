package com.whoami.dao;

import com.whoami.pojo.SubjectOneForMore;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/************
 * 一对多学习测试
 */
public interface SubjectOneForMoreMapper {
    List getSubjectOneForMore(@Param("id")int id);
}
