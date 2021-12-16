package base;

public class Demo07 {

    //    类变量 static
    static double salary = 2500;

    //属性：变量

    //实例变量：从属于对象；如果不自行初始化，这个类型的默认值 0  0.0
    //布尔值 默认是false；
    //除了基本数据类型，其他的都是null；
    String name;
    int age;

    //main 方法 程序入口
    public static void main(String[] args) {

        //局部变量；必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //变量类型 变量名字 = new base.Demo07()
        Demo07 demo07 = new Demo07();
        System.out.println(demo07.name);
        System.out.println(demo07.age);

        System.out.println(salary);
    }


    //其他方法
    public void add(){
//        System.out.println(i);//不能输出，因为i是main方法的局部变量
    }
}
