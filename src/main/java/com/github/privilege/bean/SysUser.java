package com.github.privilege.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SysUser {

    /**
     * 用户id
     */
    @TableId
    private String id;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 用户名
     */
    private String username;
    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;

    /**
     * 状态（ 0 禁用 1 启用）
     */
    private String status;

    /**
     * 手机号码
     */
    private String telPhone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 修改时间
     */
    private String modifyTime;
    /**
     * 创建时间
     */
    private String createTime;

}
