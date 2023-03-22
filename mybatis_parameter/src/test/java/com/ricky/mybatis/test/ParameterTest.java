package com.ricky.mybatis.test;

import com.ricky.mybatis.mapper.UserMapper;
import com.ricky.mybatis.pojo.User;
import com.ricky.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ParameterTest {

    @Test
    public void testGetUserByUsername(){

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserByUsername("roott");

        System.out.println(user);
    }


    @Test
    public void testCheckLogin(){

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.checkLogin("root","123");

        System.out.println(user);
    }

    @Test
    public void testCheckLoginByMap(){

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();

        map.put("username" , "root");

        map.put("password" , "123");

        User user = mapper.checkLoginByMap(map);

        System.out.println(user);
    }

    @Test
    public void testInsertUser(){

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User(null,"root","123456",33,"女", "123456@qq.com" );

        mapper.insertUser(user);
    }

    @Test
    public void testCheckLoginByParam(){

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.checkLoginByParam("root","123");

        System.out.println(user);
    }


}
