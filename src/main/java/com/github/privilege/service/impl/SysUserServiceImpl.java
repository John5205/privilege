package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysUser;
import com.github.privilege.bean.bo.SysUserBO;
import com.github.privilege.dao.ISysUserDao;
import com.github.privilege.service.ISysUserService;

import java.util.List;

public class SysUserServiceImpl extends ServiceImpl<ISysUserDao,SysUser> implements ISysUserService {
    /**
     * 查询用户的分页集合
     * @param userBO
     * @return
     */
    public List<SysUser> getListPage(SysUserBO userBO) {
        Page page = new Page(userBO.getPageNum(), userBO.getPageSize());
        return baseMapper.getListPage(page,userBO);
    }

    /**
     * 查询用户的集合
     * @return
     */
    public List<SysUser> getList() {
        return baseMapper.getList();
    }

    /**
     * 根据id用户的信息
     * @param id
     * @return
     */
    public SysUser getByID(String id) {
        return baseMapper.getByID(id);
    }

    /**
     * 根据id物理删除用户信息
     * @param id
     * @return
     */
    public int deleteById(String id) {
        return baseMapper.deleteById(id);
    }


}
