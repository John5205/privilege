package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysMenu;
import com.github.privilege.bean.SysUser;
import com.github.privilege.dao.ISysMenuDao;
import com.github.privilege.service.ISysMenuService;
import com.github.privilege.utils.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SysMenuServiceImpl extends ServiceImpl<ISysMenuDao, SysMenu> implements ISysMenuService {
    @Override
    public List<SysMenu> getMenuPage(SysMenu sysMenu) {
        Page page = new Page(sysMenu.getPageNum(), sysMenu.getPageSize());
        return baseMapper.getMenuPage(page,sysMenu);
    }

    /**
     * 查询查单集合
     * @return
     */
    @Override
    public List<SysMenu> getMenuListAll() {
        return baseMapper.getMenuListAll();
    }

    @Override
    public SysMenu getMenuById(Long menuId) {
        return baseMapper.getMenuById(menuId);
    }

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

    @Override
    public int insertMenu(SysMenu sysMenu) {
        return baseMapper.insert(sysMenu);
    }

    @Override
    public int updateMenu(SysMenu sysMenu) {
        return baseMapper.updateById(sysMenu);
    }

    @Override
    public int deleteMenuById(Long menuId) {
        return baseMapper.deleteMenuById(menuId);
    }

    @Override
    public int deleteMenuAll(Long menuIds) {
        return baseMapper.deleteMenuAll(menuIds);
    }
}
