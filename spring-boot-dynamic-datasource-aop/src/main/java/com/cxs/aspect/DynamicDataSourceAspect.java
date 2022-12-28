package com.cxs.aspect;

import com.cxs.utils.DynamicDatasourceLocalUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
@Aspect
@Component
public class DynamicDataSourceAspect {

    @Pointcut(value = "within(com.cxs.service.impl.*)")
    public void pointCut(){}

    @Around(value = "pointCut() && @annotation(dataSourceType)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint, DataSourceType dataSourceType){
        Object result = null;
        try {
            // 设置当前处理线程的数据源标识
            DynamicDatasourceLocalUtil.setLocalCache(dataSourceType.value());
            result = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            // 清除ThreadLocal，防止内存泄漏
            DynamicDatasourceLocalUtil.removeLocalCache();
        }
        return result;
    }
}
