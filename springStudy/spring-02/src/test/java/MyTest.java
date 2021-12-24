import com.whoami.dao.Student;
import com.whoami.dao.Teacher;
import com.whoami.dao.Teacher2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Teacher2 student = (Teacher2) context.getBean("teacher2");
        String s = student.toString();
        System.out.println(s);

//        Object teacher = context.getBean("teacher");
//        String s1 = teacher.toString();
//        System.out.println(s1);

//        Object teacher2 = context.getBean("teacher2");
//        String s1 = teacher2.toString();
//        System.out.println(s1);

    }
}
