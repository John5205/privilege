package com.github.privilege.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.privilege.bean.SysMenu;
import com.github.privilege.bean.vo.MenuVO;

import java.util.List;
import java.util.Set;


public interface ISysMenuService extends IService<SysMenu> {
    /**
     * 查询菜单集合
     */
    List<SysMenu> getMenuPage(MenuVO menuVO);

    /**
     * 查询菜单集合
     */
    List<SysMenu> getMenuListAll();

    /**
     * 通过id查询查询菜单信息
     */
    SysMenu getMenuById(Long menuId);

    /**
     * 通过用户id查询用户权限集合
     */
    Set<String> getUserPermsById(Long userId);

    /**
     * 通过用户的id查询所有菜单
     */
    List<SysMenu> getMenuAll(Long userId);

    /**
     * 新增菜单
     */
    int insertMenu(SysMenu sysMenu);

    /**
     * 修改菜单
     */
    int updateMenu(SysMenu sysMenu);

    /**
     * 通过id删除菜单信息
     */
    int deleteMenuById(Long menuId);

    /**
     * 批量删除
     */
    int deleteMenuAll(Long menuIds);

}
