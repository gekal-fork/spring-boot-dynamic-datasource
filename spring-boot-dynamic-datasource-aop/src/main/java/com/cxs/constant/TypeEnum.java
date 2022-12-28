package com.cxs.constant;

import lombok.Getter;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
public enum TypeEnum {
    // 写
    T_ORDER("order-service"),
    // 读
    T_SHOP("shop-service");

    @Getter
    private String service;

    TypeEnum(String service) {
        this.service = service;
    }
}
