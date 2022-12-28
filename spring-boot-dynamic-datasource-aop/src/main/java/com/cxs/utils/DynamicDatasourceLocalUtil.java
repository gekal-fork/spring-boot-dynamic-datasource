package com.cxs.utils;

import com.cxs.constant.TypeEnum;

/*
 * @Project:spring-boot-dynamic-datasource-demo
 * @Author:cxs
 * @Motto:放下杂念,只为迎接明天更好的自己
 * */
public class DynamicDatasourceLocalUtil {
    private static final ThreadLocal<TypeEnum> localCache = new ThreadLocal<>();

    public static void setLocalCache(TypeEnum typeEnum) {
        localCache.set(typeEnum);
    }

    public static TypeEnum getLocalCache() {
        return localCache.get();
    }

    public static void removeLocalCache() {
        localCache.remove();
    }
}
