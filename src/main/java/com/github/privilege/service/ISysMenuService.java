package com.github.privilege.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.privilege.bean.SysMenu;
import com.github.privilege.bean.bo.SysMenuBO;

import java.util.List;

public interface ISysMenuService extends IService<SysMenu> {
    /**
     * 查询分页菜单集合
     * @return
     */
    List<SysMenu> getListPage(SysMenuBO menuBO);

    /**
     * 新增菜单
     * @return
     */
    int addMenu(SysMenu menu);




}
