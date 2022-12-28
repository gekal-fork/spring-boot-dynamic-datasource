package com.cxs.service.impl;

import com.cxs.aspect.DataSourceType;
import com.cxs.constant.TypeEnum;
import com.cxs.mapper.OrderMapper;
import com.cxs.model.Order;
import com.cxs.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    @DataSourceType(TypeEnum.T_ORDER)
    public Integer addOrder(Order order) {
        return orderMapper.addOrder(order);
    }
}
