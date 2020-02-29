package com.github.privilege.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.privilege.bean.SysRole;
import com.github.privilege.bean.SysUser;
import com.github.privilege.bean.vo.RoleVO;
import com.github.privilege.bean.vo.SysUserVO;

import java.util.List;


public interface ISysRoleService extends IService<SysRole> {
    /**
     * 通过分页查询分页信息
     */
    List<SysRole> getRolePage(RoleVO roleVO);

    /**
     * 查询角色集合
     */
    List<SysRole> getRoleListAll();

    /**
     * 根据用户id查询角色集合
     */
    List<SysRole> getRolesByUserId(Long userId);

    /**
     * 通过角色id查询角色
     */
    SysRole getRoleById(Long roleId);

    /**
     * 根据角色id该角色拥有的用户
     */
    List<SysUser> getUserRoleById(SysUserVO userVO);

    /**
     * 通过该角色id查询该角色没有哪些用户
     */
    List<SysUser> getUserUNRoleById(SysUserVO userVO);

    /**
     * 添加角色
     */
    int insertRole(SysRole sysRole);

    /**
     * 通过id删除角色
     */
    int deleteRoleById(Long roleId);

    /**
     * 批量删除
     */
    int deleteRoleBatch(Long roleIds);

    /**
     * 修改角色
     */
    int updateRoleById(Long roleId);

    /**
     * 取消授权
     */
    int cancelAuthorization(Long roleId);

    /**
     * 批量取消授权
     */
    int cancelAuthorizationAll(Long roleIds);

}
