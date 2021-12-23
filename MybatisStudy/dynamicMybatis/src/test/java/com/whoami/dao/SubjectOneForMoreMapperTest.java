package com.whoami.dao;

import com.whoami.pojo.SubjectOneForMore;
import com.whoami.utils.StudentDyanmicUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：WHOAMI
 * @date ：Created in 2021/12/23 10:46
 * @description：
 * @modified By：
 * @version: $
 */
public class SubjectOneForMoreMapperTest {
    @Test
    public void getSubjectOneForMoreTest(){
        SqlSession sqlSession = StudentDyanmicUtils.getSqlSession();
        SubjectOneForMoreMapper mapper = sqlSession.getMapper(SubjectOneForMoreMapper.class);
        List subjectOneForMore = mapper.getSubjectOneForMore(1);
        for (Object o : subjectOneForMore) {
            System.out.println(o);

        }
        System.out.println(subjectOneForMore);
        sqlSession.close();
    }
}
