package base;

public class Demo05 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意内存溢出问题
        //JDK新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        System.out.println(money);
        int years = 20;
        int total = money*years; // 计算时内存溢出
        long total2 = money*years; //默认是int 转换之前就存在问题了

        long total3 = money * ((long) years);
        System.out.println(total3);

        //L   l
    }
}
