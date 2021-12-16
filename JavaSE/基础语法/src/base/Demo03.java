package base;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Demo03 {
    public static void main(String[] args) {
        //进制   二进制0b   十进制    八进制    十六进制

        int i = 10;
        int i2 = 010;  //八进制
        int i3 = 0x10; //十六进制0x   0-9 A-F 16

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("=============================================");
        //==========================================================
        //浮点数扩展？   银行业务怎么表示？ 钱
        //BigDecimal    数学工具类
        //==========================================================
        //float  有限  离散  舍入误差
        //double

        //        最好完全避免使用浮点数进行比较
        //        最好完全避免使用浮点数进行比较
        //        最好完全避免使用浮点数进行比较

        float f = 0.1f; //0.1
        double d = 1.0/10; //0.1
        System.out.println(f);
        System.out.println(d);
        System.out.println(f==d);  //false


        float d1 = 232323232323f;
        float d2 = d1 + 1;

        System.out.println(d1);
        System.out.println(d1==d2);


        System.out.println("=============================================");

        //============================================================
        //字符扩展
        //============================================================
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int)c1);    //强制转换

        System.out.println(c2);
        System.out.println((int)c2);    //强制转换


        System.out.println("=============================================");

        //所以的字符本质还是数字
        //编码    Unicode 表：a=97， A=65  2字节  0-65535  Excel 2 16 = 65535

        //U0000 UFFFF

        char c3 = '\u0061';
        System.out.println(c3);

        //转义字符
        // \t 制表符
        // \n 换行
        // ........
        System.out.println("Hello\tyyy\nWorld");

        System.out.println("=============================================");

        String sa = new String("hello world");
        String sb = new String("hello world");

        System.out.println(sa==sb);

        String sc = "hello world";
        String sd = "hello world";

        System.out.println(sc==sd);
        //对象，从内存分析


        //boolean 扩展
        boolean flag = true;
        if(flag){

        }
        if(flag == true){

        }
        //less is more 代码要精简易读
    }
}
