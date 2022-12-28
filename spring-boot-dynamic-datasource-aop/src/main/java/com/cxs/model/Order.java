package com.cxs.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

import javax.persistence.Table;

/**
 * 订单表
 * @TableName t_order
 */
@Data
@Table(name = "t_order")
public class Order implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer productId;

    /**
     * 
     */
    private LocalDateTime createTime;

    private static final long serialVersionUID = 1L;
}