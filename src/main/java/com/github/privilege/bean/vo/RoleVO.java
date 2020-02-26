package com.github.privilege.bean.vo;

import com.github.privilege.bean.base.BaseEntity;
import lombok.Data;

/**
 * @ClassName RoleVO
 * @Description TODO
 * @Author JOHN
 * @Date 2020/2/26 10:19
 * @Version 1.0
 **/
@Data
public class RoleVO extends BaseEntity {
    /**
     * 角色名称
     */
    private String roleName;
}
