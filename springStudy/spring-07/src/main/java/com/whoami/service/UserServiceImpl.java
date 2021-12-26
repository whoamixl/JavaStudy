package com.whoami.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加了一个");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个");
    }

    @Override
    public void update() {
        System.out.println("修改了一个");
    }

    @Override
    public void select() {
        System.out.println("选择了一个");
    }
}
