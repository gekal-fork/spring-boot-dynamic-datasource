package com.cxs.controller;

import com.cxs.model.Order;
import com.cxs.model.Product;
import com.cxs.service.OrderService;
import com.cxs.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
@RestController
public class GlobalController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @GetMapping("/shop/list")
    public Object list(){
        return productService.productList();
    }

    @GetMapping("/order/add")
    public Object add(){
        Order order = new Order();
        order.setProductId(1);
        order.setCreateTime(LocalDateTime.now());
        return orderService.addOrder(order);
    }
}
