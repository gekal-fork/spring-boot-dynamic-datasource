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
    private DataSource master;

    @Autowired
    private DataSource slave;

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDatasourceLocalUtil.getLocalCache();
    }

    @Override
    public void afterPropertiesSet() {
        super.setDefaultTargetDataSource(master);
        Map<Object, Object> map = new HashMap<>();
        map.put(TypeEnum.W.name(), master);
        map.put(TypeEnum.R.name(), slave);
        super.setTargetDataSources(map);
        super.afterPropertiesSet();
    }
}
