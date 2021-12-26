package com.whoami.diy;


import com.whoami.service.UserServiceImpl1;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.support.ExpressionPointcut;

//使用注解方式实现aop

@Aspect
public class AnnotationPoint {

    @Before("execution(* com.whoami.service.UserServiceImpl1.*(..))")
    public void before(){
        System.out.println("+++++++++++++++++++方法前++++++++++++++++++++++++");
    }

    @After("execution(* com.whoami.service.UserServiceImpl1.*(..))")
    public void after(){
        System.out.println("+++++++++++++++++++方法后++++++++++++++++++++++++");
    }


    //在环绕中我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.whoami.service.UserServiceImpl1.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        System.out.println(jp.getSignature());
        //执行方法
        Object proceed = jp.proceed();

        System.out.println(proceed);
        System.out.println("环绕后");

    }

}
