package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.privilege.bean.SysMenu;

import java.util.List;

public interface ISysMenuDao extends BaseMapper<SysMenu> {
    /**
     * 查询菜单集合
     * @param page
     * @param sysMenu
     * @return
     */
    List<SysMenu> getMenuPage(Page page, SysMenu sysMenu);

    /**
     * 查询菜单集合
     * @return
     */
    List<SysMenu> getMenuListAll();
}
