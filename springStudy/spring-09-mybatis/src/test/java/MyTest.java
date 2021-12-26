import com.whoami.dao.StudentMapper;
import com.whoami.dao.StudentMapperImpl;
import com.whoami.dao.StudentMapperImpl2;
import com.whoami.pojo.Student;
import com.whoami.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void getStudentByMapper(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);

        }
    }

    @Test
    public void getStudentBySpring(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        StudentMapper sqlSession = (StudentMapper) context.getBean("studentMapper");
        List<Student> student = sqlSession.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }


    }

    @Test
    public void getStudentBySqlSessionDaoSupport(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        StudentMapper sqlSession = (StudentMapper) context.getBean("studentMapper2");
        List<Student> student = sqlSession.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
    }
}
