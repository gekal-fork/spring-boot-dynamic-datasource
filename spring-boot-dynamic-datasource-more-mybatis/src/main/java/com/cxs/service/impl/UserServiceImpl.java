package com.cxs.service.impl;

import com.cxs.mapper.master.MasterUserMapper;
import com.cxs.mapper.slave.SlaveUserMapper;
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
    private MasterUserMapper masterUserMapper;

    @Autowired
    private SlaveUserMapper slaveUserMapper;

    @Override
    public List<User> list() {
        return slaveUserMapper.selectList();
    }

    @Override
    public Integer insert(User user) {
        return masterUserMapper.insert(user);
    }
}
