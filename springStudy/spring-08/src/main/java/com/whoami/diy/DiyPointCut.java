package com.whoami.diy;

public class DiyPointCut {
    public void before(){
        System.out.println("====================在方法执行前=====================");
    }

    public void after(){
        System.out.println("====================在方法执行后=====================");
    }
}
