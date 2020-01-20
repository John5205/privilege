package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.privilege.bean.SysRole;
import com.github.privilege.bean.bo.SysRoleBO;

import java.util.List;

public interface ISysRoleDao extends BaseMapper<SysRole> {
    /**
     * 查询角色分页集合
     * @param page
     * @param roleBO
     * @return
     */
    List<SysRole> getListPage(Page page, SysRoleBO roleBO);

    /**
     * 查询角色集合
     * @return
     */
    List<SysRole> getList();

    /**
     * 根据角色查询角色的信息
     * @param id
     * @return
     */
    SysRole getByID(String id);
}
