package com.github.privilege.bean.vo;

import com.github.privilege.bean.base.BaseEntity;
import lombok.Data;

/**
 * @ClassName MenuVO
 * @Description TODO
 * @Author JOHN
 * @Date 2020/2/26 10:26
 * @Version 1.0
 **/
@Data
public class MenuVO extends BaseEntity {

    /**
     * 菜单名称
     */
    private String menuName;
}
