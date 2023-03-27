package com.ricky.spring.controller;

import com.ricky.spring.service.UserService;
import com.ricky.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Date:2022/7/2
 * Author:ybc
 * Description:
 */
//@Controller("controller")
@Controller
public class UserController {

    @Autowired(required = false)
//    @Qualifier("userServiceImpl")
    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

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
