package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysMenu;
import com.github.privilege.bean.SysUser;
import com.github.privilege.bean.vo.MenuVO;
import com.github.privilege.dao.ISysMenuDao;
import com.github.privilege.service.ISysMenuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SysMenuServiceImpl extends ServiceImpl<ISysMenuDao, SysMenu> implements ISysMenuService {
    /**
     * 分页查询
     */
    @Override
    public List<SysMenu> getMenuPage(MenuVO menuVO) {
        Page page = new Page(menuVO.getPageNum(), menuVO.getPageSize());
        return baseMapper.getMenuPage(page,menuVO);
    }

    /**
     * 查询查单集合
     */
    @Override
    public List<SysMenu> getMenuListAll() {
        return baseMapper.getMenuListAll();
    }

    /**
     * 通过id查询菜单详情
     */
    @Override
    public SysMenu getMenuById(Long menuId) {
        return baseMapper.getMenuById(menuId);
    }

    /**
     * 通过用户id查询权限
     */
    @Override
    public Set<String> getUserPermsById(Long userId) {
        List<String> perms = baseMapper.getUserPermsById(userId);
        HashSet<String> set = new HashSet<>();
        for (String str:perms){
            if(StringUtils.isNotEmpty(str)){
                set.addAll(Arrays.asList(str.trim().split(",")));
            }
        }
        return set;
    }

    /**
     * 通过用户id查询所有菜单
     */
    @Override
    public List<SysMenu> getMenuAll(Long userId) {
        List<SysMenu> menuList ;
        if(SysUser.isAdmin(userId)){
            menuList = baseMapper.getMenuListAll();
        }else {
            menuList = baseMapper.getMenuAllByUserId(userId);
        }
        return menuList;
    }

    /**
     * 新增菜单
     */
    @Override
    @Transactional
    public int insertMenu(SysMenu sysMenu) {
        return baseMapper.insert(sysMenu);
    }

    /**
     * 修改菜单
     */
    @Override
    public int updateMenu(SysMenu sysMenu) {
        return baseMapper.updateById(sysMenu);
    }

    /**
     * 通过id删除菜单
     */
    @Override
    public int deleteMenuById(Long menuId) {
        return baseMapper.deleteMenuById(menuId);
    }

    /**
     * 批量删除
     */
    @Override
    public int deleteMenuAll(Long menuIds) {
        return baseMapper.deleteMenuAll(menuIds);
    }
}
