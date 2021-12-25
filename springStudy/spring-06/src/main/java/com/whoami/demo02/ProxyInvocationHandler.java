package com.whoami.demo02;

import javax.crypto.interfaces.PBEKey;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.SQLIntegrityConstraintViolationException;

public class ProxyInvocationHandler implements InvocationHandler {

//    Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
//            new Class<?>[] { Foo.class },
//            handler);


    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        seeHose();
        Object invoke = method.invoke(rent, args);
        pare();

        return invoke;
    }

    private void seeHose(){
        System.out.println("中介带你看房子");
    }

    private void pare(){
        System.out.println("中介收中介费");
    }

}
