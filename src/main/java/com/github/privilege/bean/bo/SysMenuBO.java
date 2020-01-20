package com.github.privilege.bean.bo;

import com.github.privilege.bean.base.BaseEntiy;
import lombok.Data;

@Data
public class SysMenuBO extends BaseEntiy {

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单等级
     */
    private String level;
}
