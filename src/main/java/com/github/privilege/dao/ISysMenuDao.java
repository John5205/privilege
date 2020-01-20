package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.privilege.bean.SysMenu;
import com.github.privilege.bean.bo.SysMenuBO;

import java.util.List;

public interface ISysMenuDao extends BaseMapper<SysMenu> {
    /**
     * 查询菜单的分页集合
     * @param page
     * @param menuBO
     * @return
     */
    List<SysMenu> getListPage(Page page, SysMenuBO menuBO);
}
