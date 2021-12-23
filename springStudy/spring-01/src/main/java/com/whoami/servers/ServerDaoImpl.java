package com.whoami.servers;

import com.whoami.dao.UserDao;

public class ServerDaoImpl implements ServerDao{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
