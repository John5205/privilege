package com.github.privilege.bean.base;

import lombok.Data;

@Data
public class BaseEntity {
    /**
     * 当前页数
     */
    private Integer pageNum =1;
    /**
     * 当前页多少条数
     */
    private Integer pageSize = 10;
}
