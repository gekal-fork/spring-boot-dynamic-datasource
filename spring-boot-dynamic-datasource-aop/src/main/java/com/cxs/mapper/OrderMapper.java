package com.cxs.mapper;

import com.cxs.model.Order;
import org.apache.ibatis.annotations.Insert;

/**
* @author DELL
* @description 针对表【t_order(订单表)】的数据库操作Mapper
* @createDate 2022-12-27 16:28:17
* @Entity com.cxs.model.Order
*/
public interface OrderMapper {

    @Insert("insert into t_order values (null, #{productId}, #{createTime})")
    Integer addOrder(Order order);
}




