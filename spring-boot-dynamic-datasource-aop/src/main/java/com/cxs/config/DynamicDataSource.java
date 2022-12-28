package com.cxs.config;

import com.cxs.constant.TypeEnum;
import com.cxs.utils.DynamicDatasourceLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
@Primary
@Component
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Autowired
    private DataSource dataSourceShop;

    @Autowired
    private DataSource dataSourceOrder;

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDatasourceLocalUtil.getLocalCache();
    }

    @Override
    public void afterPropertiesSet() {
        Map<Object, Object> map = new HashMap<>();
        super.setDefaultTargetDataSource(dataSourceShop);
        map.put(TypeEnum.T_ORDER, dataSourceOrder);
        map.put(TypeEnum.T_SHOP, dataSourceShop);
        super.setTargetDataSources(map);
        super.afterPropertiesSet();
    }
}
