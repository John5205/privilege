package com.github.privilege.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SysMenu {

    @TableId
    private String mid;

    /**
     * 父级id
     */
    private String parentId;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单等级(1 一级 2 二级 3 三级 等)
     */
    private String level;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 菜单链接
     */
    private String href;

    /**
     * 权限（M 菜单权限 B 按钮权限 ）
     */
    private String permission;

    /**
     *  排序
     */
    private Integer sort;

    /**
     * 类型（）
     */
    private String type;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;

    /**
     * 备注
     */
    private String remake;



}
