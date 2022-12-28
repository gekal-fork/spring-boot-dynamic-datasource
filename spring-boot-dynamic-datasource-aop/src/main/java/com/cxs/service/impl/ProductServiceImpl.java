package com.cxs.service.impl;

import com.cxs.aspect.DataSourceType;
import com.cxs.constant.TypeEnum;
import com.cxs.mapper.ProductMapper;
import com.cxs.model.Product;
import com.cxs.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    @DataSourceType(TypeEnum.T_SHOP)
    public List<Product> productList() {
        return productMapper.selectList();
    }
}
