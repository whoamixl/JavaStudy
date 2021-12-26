import com.whoami.pojo.Student;
import com.whoami.service.SpringConfig;
import com.whoami.service.StudentMapper;
import com.whoami.service.StudentMapperImpl;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void myTest(){
        SpringConfig springConfig = new SpringConfig();
        StudentMapperImpl studentMapper = new StudentMapperImpl();
        try {
            studentMapper.setSqlSessionTemplate(springConfig.sqlSession());
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Student> student = studentMapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);

        }
    }
}
