package com.ricky.spring.controller;

import com.ricky.spring.service.UserService;
import com.ricky.spring.service.impl.UserServiceImpl;

/**
 * Date:2022/7/2
 * Author:ybc
 * Description:
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
