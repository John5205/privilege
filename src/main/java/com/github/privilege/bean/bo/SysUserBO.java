package com.github.privilege.bean.bo;

import com.github.privilege.bean.base.BaseEntiy;
import lombok.Data;

@Data
public class SysUserBO extends BaseEntiy {

    /**
     * 用户名
     */
    private String username;

    /**
     * 账号
     */
    private String account;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 手机号
     */
    private String telPhone;

    /**
     * 起始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

}
