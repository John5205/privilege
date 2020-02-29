package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.privilege.bean.SysMenu;
import com.github.privilege.bean.vo.MenuVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISysMenuDao extends BaseMapper<SysMenu> {
    /**
     * 查询菜单集合
     */
    List<SysMenu> getMenuPage(Page page, @Param("ew") MenuVO menuVO);

    /**
     * 查询菜单集合
     */
    List<SysMenu> getMenuListAll();

    /**
     * 通过id删除菜单
     */
    int deleteMenuById(Long menuId);

    /**
     * 批量删除
     */
    int deleteMenuAll(Long menuIds);

    /**
     * 通过id查询菜单信息
     */
    SysMenu getMenuById(Long menuId);

    /**
     * 根据用户id查询权限集合
     */
    List<String> getUserPermsById(Long userId);

    /**
     * 通过用户id查询所有菜单
     */
    List<SysMenu> getMenuAllByUserId(Long userId);
}
