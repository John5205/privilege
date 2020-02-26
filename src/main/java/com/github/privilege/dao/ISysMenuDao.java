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
     * @param page
     * @param menuVO
     * @return
     */
    List<SysMenu> getMenuPage(Page page, @Param("ew") MenuVO menuVO);

    /**
     * 查询菜单集合
     * @return
     */
    List<SysMenu> getMenuListAll();

    /**
     * 通过id删除菜单
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

    /**
     * 通过id查询菜单信息
     * @param menuId
     * @return
     */
    SysMenu getMenuById(Long menuId);

    /**
     * 根据用户id查询权限集合
     * @param userId
     * @return
     */
    List<String> getUserPermsById(Long userId);

    /**
     * 通过用户id查询所有菜单
     * @param userId
     * @return
     */
    List<SysMenu> getMenuAllByUserId(Long userId);
}
