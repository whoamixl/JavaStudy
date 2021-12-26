package com.whoami.service;

public class UserServiceImpl1 implements UserService{
    @Override
    public void add() {
        System.out.println("添加了一个");
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
    public void query() {
        System.out.println("查询了一个");
    }
}
