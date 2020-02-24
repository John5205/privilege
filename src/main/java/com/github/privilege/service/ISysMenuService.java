package com.github.privilege.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.privilege.bean.SysMenu;

import java.util.List;

/**
 * @author JOHN
 */
public interface ISysMenuService extends IService<SysMenu> {
    /**
     * 查询菜单集合
     * @param sysMenu
     * @return
     */
    List<SysMenu> getMenuPage(SysMenu sysMenu);

    /**
     * 查询菜单集合
     * @return
     */
    List<SysMenu> getMenuListAll();

    /**
     * 新增菜单
     * @param sysMenu
     * @return
     */
    int insertMenu(SysMenu sysMenu);

    /**
     * 修改菜单
     * @param sysMenu
     * @return
     */
    int updateMenu(SysMenu sysMenu);

}
