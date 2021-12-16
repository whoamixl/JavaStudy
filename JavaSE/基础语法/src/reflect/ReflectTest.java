package reflect;

import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) {
        Person student = new Student();
        Class c1 = student.getClass();
        System.out.println(c1.hashCode());

        try {
            Class c2 = Class.forName("reflect.Student");
            System.out.println(c2.hashCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        Class c4 = c3.getClass();
        System.out.println(c4.getClass());

        Method[] methods = c3.getMethods();
        for(Method x : methods){
            System.out.println(x.getName());
        }

    }
}


class Person{
    String name;
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person{
    public Student() {
        this.name = "学生";
    }

    private void print(){
        System.out.println(this.name);
    }

}

class Teacher extends Person{
    public Teacher() {
        this.name = "老师";
    }

    private void print(){
        System.out.println(this.name);
    }
}