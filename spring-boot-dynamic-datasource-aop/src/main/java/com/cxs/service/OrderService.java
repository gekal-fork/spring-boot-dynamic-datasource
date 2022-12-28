package com.cxs.service;

import com.cxs.model.Order;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
public interface OrderService {
    Integer addOrder(Order order);
}
