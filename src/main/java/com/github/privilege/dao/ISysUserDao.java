package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.privilege.bean.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISysUserDao extends BaseMapper<SysUser> {
    /**
     * 查询分页用户信息
     * @param page
     * @param sysUser
     * @return
     */
    List<SysUser> getListPage(Page page, @Param("ew") SysUser sysUser);

    /**
     * 查询用户的所有信息
     * @return
     */
    List<SysUser> getList();

    /**
     * 通过用户id查询用户侧信息
     * @param id
     * @return
     */
    SysUser getUserById(Long id);

    /**
     * 通过手机号查询用户的信息
     * @param phone
     * @return
     */
    SysUser getPhone(String phone);

    /**
     * 通过邮箱查询用户信息
     * @param email
     * @return
     */
    SysUser getEmail(String email);

    /**
     * 通过用户名查询用户的信息
     * @param username
     * @return
     */
    SysUser getUserName(String username);

    /**
     * 通过账号查询用户信息
     * @param loginName
     * @return
     */
    SysUser getLoginName(String loginName);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteUserBatch(Long ids);
}
