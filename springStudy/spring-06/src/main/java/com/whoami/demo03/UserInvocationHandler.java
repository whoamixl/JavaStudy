package com.whoami.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserInvocationHandler implements InvocationHandler {

    private UserService service;

    public void setService(UserService service) {
        this.service = service;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), service.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log(method.getName());
        Object invoke = method.invoke(service, args);

        return invoke;
    }

    private void log(String msg){
        System.out.println("调用了"+msg+"方法");
    }
}

