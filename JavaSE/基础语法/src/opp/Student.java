package opp;

public class Student {

    public String name;
    public int age;

    public Student() {
    }

    public Student(String name){
        System.out.println("欢迎进入学生系统:"+name);
    }

    public String printName() {
        return this.name;
    }

    public char[] data(char[] test) {
        int x = test.length;
        char[] newDate = new char[x];
        int index = x;
        for (int i = 0; i < x; i++) {
            newDate[i] = test[index-1];
            index--;
        }
        System.out.println();
        return newDate;
    }
}
