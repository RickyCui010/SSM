package com.ricky.spring.dao.impl;

import com.ricky.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Date:2022/7/2
 * Author:ybc
 * Description:
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
