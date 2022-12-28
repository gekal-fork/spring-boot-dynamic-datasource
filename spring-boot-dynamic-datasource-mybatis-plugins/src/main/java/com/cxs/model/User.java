package com.cxs.model;

import java.io.Serializable;
import lombok.Data;

import javax.persistence.Table;

/**
 * 用户表
 * @TableName t_user
 */
@Data
@Table(name = "t_user")
public class User implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    private static final long serialVersionUID = 1L;
}