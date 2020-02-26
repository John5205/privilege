package com.github.privilege.bean.vo;

import com.github.privilege.bean.base.BaseEntity;

/**
 * @ClassName UserVO
 * @Description TODO
 * @Author JOHN
 * @Date 2020/2/26 10:10
 * @Version 1.0
 **/
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
