package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.privilege.bean.SysUser;
import com.github.privilege.bean.bo.SysUserBO;

import java.util.List;

public interface ISysUserDao extends BaseMapper<SysUser> {

    List<SysUser> getListPage(Page page, SysUserBO userBO);

    List<SysUser> getList();

    int deleteBacthById(String[] ids);
}
