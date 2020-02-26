package com.github.privilege.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.privilege.bean.SysUser;

import java.util.List;

/**
 * 用户服务层
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 分页查询用户信息
     * @param sysUser
     * @return
     */
    List<SysUser> getListPage(SysUser sysUser);

    /**
     * 查询集合
     * @return
     */
    List<SysUser> getList();

    /**
     * 通过用户id查询
     * @param userId
     * @return
     */
    SysUser getUserById(Long userId);

    /**
     * 通过手机号查询用户信息
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
     * 通过用户查询用户信息
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
     * 通过用户id更改用户信息
     * @param sysUser
     * @return
     */
    int updateUserById(SysUser sysUser);

    /**
     * 新增用户信息
     * @param sysUser
     * @return
     */
    int insertUserById(SysUser sysUser);

    /**
     * 通过id删除用户信息
     * @param userId
     * @return
     */
    int deleteUserById(Long userId);

    /**
     * 批量删除用户信息
     * @param userIds
     * @return
     */
    int deleteUserBatch(Long userIds);
}
