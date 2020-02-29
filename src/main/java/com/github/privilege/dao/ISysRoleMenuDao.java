package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.privilege.bean.SysRoleMenu;

import java.util.List;


public interface ISysRoleMenuDao extends BaseMapper<SysRoleMenu> {
    /**
     * 新增角色填加菜单
     */
    int batchInsertRoleMenu(List<SysRoleMenu> list);
}
