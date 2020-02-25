package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.privilege.bean.SysRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISysRoleDao extends BaseMapper<SysRole> {

    /**
     * 查询角色分页
     * @param page
     * @param sysRole
     * @return
     */
    List<SysRole> getRolePage(Page page,@Param("ew") SysRole sysRole);

    /**
     * 查询角色信息
     * @return
     */
    List<SysRole> getRoleListAll();

    /**
     * 根据用户id查询角色
     * @param userId
     * @return
     */
    List<SysRole> getRolesByUserId(Long userId);

    /**
     * 通过角色id查询角色
     * @param roleId
     * @return
     */
    SysRole getRoleById(Long roleId);

    /**
     * 批量删除
     * @param roleIds
     * @return
     */
    int deleteRoleBatch(Long roleIds);
}
