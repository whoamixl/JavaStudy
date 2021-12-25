package com.whoami.demo03;

public class Client {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        UserInvocationHandler userInvocationHandler = new UserInvocationHandler();
        userInvocationHandler.setService(userService);

        UserService proxy = (UserService) userInvocationHandler.getProxy();
        proxy.delete();

    }
}
