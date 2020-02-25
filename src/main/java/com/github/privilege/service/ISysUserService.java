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
     * @param id
     * @return
     */
    int getUserById(Long id);

    /**
     * 通过手机号查询用户信息
     * @param phone
     * @return
     */
    int getPhone(String phone);
    /**
     * 通过邮箱查询用户信息
     * @param email
     * @return
     */
    int getEmail(String email);
    /**
     * 通过用户查询用户信息
     * @param username
     * @return
     */
    int getUserName(String username);
    /**
     * 通过账号查询用户信息
     * @param loginName
     * @return
     */
    int getLoginName(String loginName);

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
     * @param id
     * @return
     */
    int deleteUserById(Long id);

    /**
     * 批量删除用户信息
     * @param ids
     * @return
     */
    int deleteUserBatch(Long ids);
}
