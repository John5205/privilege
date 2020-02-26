package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysUser;
import com.github.privilege.dao.ISysUserDao;
import com.github.privilege.service.ISysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SysUserServiceImpl extends ServiceImpl<ISysUserDao, SysUser> implements ISysUserService {
    /**
     * 分页查询用户信息
     * @param sysUser
     * @return
     */
    @Override
    public List<SysUser> getListPage(SysUser sysUser) {
        Page page = new Page(sysUser.getPageNum(), sysUser.getPageSize());
        return baseMapper.getListPage(page,sysUser);
    }

    /**
     * 查询用户所有信息
     * @return
     */
    @Override
    public List<SysUser> getList() {
        return baseMapper.getList();
    }

    /**
     * 通过用户id查询用户侧信息
     * @param id
     * @return
     */
    @Override
    public SysUser getUserById(Long id) {
        return baseMapper.getUserById(id);
    }
    /**
     * 通过用户手机查询用户侧信息
     * @param phone
     * @return
     */
    @Override
    public SysUser getPhone(String phone) {
        return baseMapper.getPhone(phone);
    }
    /**
     * 通过用户邮箱查询用户侧信息
     * @param email
     * @return
     */
    @Override
    public SysUser getEmail(String email) {
        return baseMapper.getEmail(email);
    }
    /**
     * 通过用户名查询用户侧信息
     * @param username
     * @return
     */
    @Override
    public SysUser getUserName(String username) {
        return baseMapper.getUserName(username);
    }
    /**
     * 通过账号查询用户侧信息
     * @param loginName
     * @return
     */
    @Override
    public SysUser getLoginName(String loginName) {
        return baseMapper.getLoginName(loginName);
    }

    /**
     * 通过id修改用户信息
     * @param sysUser
     * @return
     */
    @Override
    @Transactional
    public int updateUserById(SysUser sysUser) {
        return baseMapper.updateById(sysUser);
    }

    /**
     * 新增用户信息
     * @param sysUser
     * @return
     */
    @Override
    @Transactional
    public int insertUserById(SysUser sysUser) {
        return baseMapper.insert(sysUser);
    }

    /**
     * 通过id删除用户信息
     * @param id
     * @return
     */
    @Override
    @Transactional
    public int deleteUserById(Long id) {
        return baseMapper.deleteById(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @Override
    @Transactional
    public int deleteUserBatch(Long ids) {
        return baseMapper.deleteUserBatch(ids);
    }
}
