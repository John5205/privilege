package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.privilege.bean.SysUser;
import com.github.privilege.bean.bo.SysUserBO;

import java.util.List;

public interface ISysUserDao extends BaseMapper<SysUser> {
    /**
     * 查询用户的分页集合
     * @param page
     * @param userBO
     * @return
     */
    List<SysUser> getListPage(Page page, SysUserBO userBO);

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    SysUser getByID(String id);

    /**
     * 查询用户的集合
     * @return
     */
    List<SysUser> getList();


    /**
     * 根据id删除用户信息
     * @param id
     * @return
     */
    int deleteById(String id);
}
