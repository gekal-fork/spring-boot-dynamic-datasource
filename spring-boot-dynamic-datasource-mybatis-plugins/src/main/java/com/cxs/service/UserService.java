package com.cxs.service;

import com.cxs.model.User;

import java.util.List;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
public interface UserService {
    List<User> list();
    Integer insert(User user);
}
