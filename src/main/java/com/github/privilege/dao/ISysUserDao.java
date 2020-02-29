package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.privilege.bean.SysUser;
import com.github.privilege.bean.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISysUserDao extends BaseMapper<SysUser> {
    /**
     * 查询分页用户信息
     */
    List<SysUser> getListPage(Page page, @Param("ew") UserVO userVO);

    /**
     * 查询用户的所有信息
     */
    List<SysUser> getList();

    /**
     * 通过用户id查询用户侧信息
     */
    SysUser getUserById(Long id);

    /**
     * 通过手机号查询用户的信息
     */
    SysUser getPhone(String phone);

    /**
     * 通过邮箱查询用户信息
     */
    SysUser getEmail(String email);

    /**
     * 通过用户名查询用户的信息
     */
    SysUser getUserName(String username);

    /**
     * 通过账号查询用户信息
     */
    SysUser getLoginName(String loginName);

    /**
     * 批量删除
     */
    int deleteUserBatch(Long ids);

    /**
     * 重置密码
     */
    int resetPassWord(Long userId, String password);
}
