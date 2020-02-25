package com.github.privilege.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.privilege.bean.SysMenu;

import java.util.List;
import java.util.Set;

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
     * 通过id查询查询菜单信息
     * @param menuId
     * @return
     */
    SysMenu getMenuById(Long menuId);

    /**
     * 通过用户id查询用户权限集合
     */
    Set<String> getUserPermsById(Long userId);

    /**
     * 通过用户的id查询所有菜单
     * @return
     */
    List<SysMenu> getMenuAll(Long userId);

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

    /**
     * 通过id删除菜单信息
     * @param menuId
     * @return
     */
    int deleteMenuById(Long menuId);

    /**
     * 批量删除
     * @param menuIds
     * @return
     */
    int deleteMenuAll(Long menuIds);

}
