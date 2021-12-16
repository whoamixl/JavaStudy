package opp;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "欢迎进入学生系统：xxx";
//        System.out.println(student.printName());
//        Student student1 = new Student("闫小龙");

        char[] test = student.data(new char[]{'a', 'b', 'c'});
        System.out.println(test);
    }
}
