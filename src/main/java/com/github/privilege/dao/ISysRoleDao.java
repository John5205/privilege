package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.privilege.bean.SysRole;
import com.github.privilege.bean.SysUser;
import com.github.privilege.bean.vo.SysUserVO;
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

    /**
     * 根据角色id该角色有哪些用户
     * @param userVO
     * @return
     */
    List<SysUser> getUserRoleById(SysUserVO userVO);

    /**
     * 通过角色id查询该角色未拥有的用户
     * @param userVO
     * @return
     */
    List<SysUser> getUserUNRoleById(SysUserVO userVO);

    /**
     * 取消授权
     * @param roleId
     * @return
     */
    int cancelAuthorization(Long roleId);

    /**
     * 批量取消授权
     * @param roleIds
     * @return
     */
    int cancelAuthorizationAll(Long roleIds);
}
