package com.ricky.spring.service.impl;

import com.ricky.spring.dao.UserDao;
import com.ricky.spring.service.UserService;

/**
 * Date:2022/7/2
 * Author:ybc
 * Description:
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
