import com.whoami.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
        UserService userService = (UserService) context.getBean("userService1");
        userService.add();
    }
}
