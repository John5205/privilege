package com.github.privilege.bean.vo;

import com.github.privilege.bean.base.BaseEntity;

public class UserVO extends BaseEntity {
    /**
     * 用户名
     */
    private String loginName;
    /**
     * 昵称
     */
    private String userName;
    /**
     * 邮件
     */
    private String email;
    /**
     * 手机
     */
    private String phone;

    /**
     * 角色id或者角色名
     */
    private String roleId;

}
