package com.github.privilege.bean.vo;

import com.github.privilege.bean.base.BaseEntity;
import lombok.Data;


@Data
public class RoleVO extends BaseEntity {
    /**
     * 角色名称
     */
    private String roleName;
}
