package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysUser;
import com.github.privilege.bean.SysUserRole;
import com.github.privilege.bean.vo.UserVO;
import com.github.privilege.dao.ISysUserDao;
import com.github.privilege.dao.ISysUserRoleDao;
import com.github.privilege.service.ISysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SysUserServiceImpl extends ServiceImpl<ISysUserDao, SysUser> implements ISysUserService {

    @Resource
    private ISysUserRoleDao userRoleDao;

    /**
     * 分页查询用户信息
     */
    @Override
    public List<SysUser> getListPage(UserVO userVO) {
        Page page = new Page(userVO.getPageNum(), userVO.getPageSize());
        return baseMapper.getListPage(page,userVO);
    }

    /**
     * 查询用户所有信息
     */
    @Override
    public List<SysUser> getList() {
        return baseMapper.getList();
    }

    /**
     * 通过用户id查询用户侧信息
     */
    @Override
    public SysUser getUserById(Long id) {
        return baseMapper.getUserById(id);
    }
    /**
     * 通过用户手机查询用户侧信息
     */
    @Override
    public SysUser getPhone(String phone) {
        return baseMapper.getPhone(phone);
    }
    /**
     * 通过用户邮箱查询用户侧信息
     */
    @Override
    public SysUser getEmail(String email) {
        return baseMapper.getEmail(email);
    }
    /**
     * 通过用户名查询用户侧信息
     */
    @Override
    public SysUser getUserName(String username) {
        return baseMapper.getUserName(username);
    }
    /**
     * 通过账号查询用户侧信息
     */
    @Override
    public SysUser getLoginName(String loginName) {
        return baseMapper.getLoginName(loginName);
    }

    /**
     * 通过id修改用户信息
     */
    @Override
    @Transactional
    public int updateUserById(SysUser sysUser) {
        return baseMapper.updateById(sysUser);
    }

    /**
     * 新增用户信息
     */
    @Override
    @Transactional
    public int insertUser(SysUser sysUser) {
        baseMapper.insert(sysUser);
        return insertUserRole(sysUser);
    }

    /**
     * 批量添加用户角色信息
     */
    @Transactional
    public int insertUserRole(SysUser user){
        List<SysUserRole> list = new ArrayList<>();
        for (Long role:user.getRoleIds()) {
            SysUserRole userRole = new SysUserRole();
            userRole.setRoleId(role);
            userRole.setUserId(user.getUserId());
            list.add(userRole);
        }
       return userRoleDao.batchInsertUserRole(list);
    }

    /**
     * 通过id删除用户信息
     */
    @Override
    @Transactional
    public int deleteUserById(Long id) {
        return baseMapper.deleteById(id);
    }

    /**
     * 批量删除
     */
    @Override
    @Transactional
    public int deleteUserBatch(Long ids) {
        return baseMapper.deleteUserBatch(ids);
    }

    /**
     * 重置密码
     */
    @Override
    public int resetPassWord(Long userId, String password) {
        return  baseMapper.resetPassWord(userId,password);
    }
}
