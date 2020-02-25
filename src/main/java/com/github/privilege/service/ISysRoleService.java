package com.github.privilege.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.privilege.bean.SysRole;

import java.util.List;

/**
 * @author  JOHN
 */
public interface ISysRoleService extends IService<SysRole> {
    /**
     * 通过分页查询分页信息
     * @param sysRole
     * @return
     */
    List<SysRole> getRolePage(SysRole sysRole);

    /**
     * 查询角色集合
     * @param
     * @return
     */
    List<SysRole> getRoleListAll();

    /**
     * 根据用户id查询角色集合
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
     * 通过id删除角色
     * @param roleId
     * @return
     */
    int deleteRoleById(Long roleId);

    /**
     * 批量删除
     * @param roleIds
     * @return
     */
    int deleteRoleBatch(Long roleIds);

    /**
     * 修改角色
     * @param roleId
     * @return
     */
    int updateRoleById(Long roleId);

}
