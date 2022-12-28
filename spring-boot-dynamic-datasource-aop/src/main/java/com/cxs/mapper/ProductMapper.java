package com.cxs.mapper;

import com.cxs.model.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author DELL
* @description 针对表【t_product(商品表)】的数据库操作Mapper
* @createDate 2022-12-27 16:28:35
* @Entity com.cxs.model.Product
*/
public interface ProductMapper {

    @Select("select * from t_product")
    List<Product> selectList();
}




