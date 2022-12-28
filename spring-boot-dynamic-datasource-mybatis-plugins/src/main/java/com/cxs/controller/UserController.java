package com.cxs.controller;

import com.cxs.constant.TypeEnum;
import com.cxs.model.User;
import com.cxs.service.UserService;
import com.cxs.utils.DynamicDatasourceLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Object list(){
        return userService.list();
    }

    @GetMapping("/insert")
    public Object insert(){
        User user = new User();
        user.setUserName("admin");
        return userService.insert(user);
    }
}
