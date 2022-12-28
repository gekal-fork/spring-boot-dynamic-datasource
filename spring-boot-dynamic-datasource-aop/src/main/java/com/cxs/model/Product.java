package com.cxs.model;

import java.io.Serializable;
import lombok.Data;

import javax.persistence.Table;

/**
 * 商品表
 * @TableName t_product
 */
@Data
@Table(name = "t_product")
public class Product implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String productName;

    /**
     * 
     */
    private Integer price;

    private static final long serialVersionUID = 1L;
}