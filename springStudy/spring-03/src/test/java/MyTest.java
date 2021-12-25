import com.whoami.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        People people = Context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
        people.setName("yxl");
        System.out.println(people.toString());
    }
}
