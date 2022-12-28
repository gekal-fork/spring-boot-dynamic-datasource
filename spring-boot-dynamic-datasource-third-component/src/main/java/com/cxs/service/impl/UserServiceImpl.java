package com.cxs.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.cxs.mapper.UserMapper;
import com.cxs.model.User;
import com.cxs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @DS(value = "slave_1")
    public List<User> list() {
        return userMapper.selectList();
    }

    @Override
    @DS(value = "master")
    public Integer insert(User user) {
        return userMapper.insert(user);
    }
}
