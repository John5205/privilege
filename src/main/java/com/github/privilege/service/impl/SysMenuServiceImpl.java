package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysMenu;
import com.github.privilege.dao.ISysMenuDao;
import com.github.privilege.service.ISysMenuService;

import java.util.List;

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
