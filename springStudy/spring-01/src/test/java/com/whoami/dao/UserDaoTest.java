package com.whoami.dao;

import com.whoami.servers.ServerDao;
import com.whoami.servers.ServerDaoImpl;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void getUser(){
        ServerDao serverDao = new ServerDaoImpl();
        serverDao.getUser();
    }

    @Test
    public void getUserBySetUserDao(){
        ServerDaoImpl serverDao = new ServerDaoImpl();
        serverDao.setUserDao(new UserDaoOricalImpl());
        serverDao.getUser();

        serverDao.setUserDao(new UserDaoMysqImpl());
        serverDao.getUser();

        serverDao.setUserDao(new UserDaoImpl());
        serverDao.getUser();
    }
}
