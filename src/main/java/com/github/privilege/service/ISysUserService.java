package com.github.privilege.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.privilege.bean.SysUser;
import com.github.privilege.bean.vo.UserVO;

import java.util.List;

/**
 * 用户服务层
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 分页查询用户信息
     */
    List<SysUser> getListPage(UserVO userVO);

    /**
     * 查询集合
     */
    List<SysUser> getList();

    /**
     * 通过用户id查询
     */
    SysUser getUserById(Long userId);

    /**
     * 通过手机号查询用户信息
     */
    SysUser getPhone(String phone);
    /**
     * 通过邮箱查询用户信息
     */
    SysUser getEmail(String email);
    /**
     * 通过用户查询用户信息
     */
    SysUser getUserName(String username);
    /**
     * 通过账号查询用户信息
     */
    SysUser getLoginName(String loginName);

    /**
     * 通过用户id更改用户信息
     */
    int updateUserById(SysUser sysUser);

    /**
     * 新增用户信息
     */
    int insertUser(SysUser sysUser);

    /**
     * 通过id删除用户信息
     */
    int deleteUserById(Long userId);

    /**
     * 批量删除用户信息
     */
    int deleteUserBatch(Long userIds);

    /**
     * 通过用户的id重置密码
     */
    int resetPassWord(Long userId,String password);


}
