package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysMenu;
import com.github.privilege.bean.bo.SysMenuBO;
import com.github.privilege.dao.ISysMenuDao;
import com.github.privilege.service.ISysMenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl extends ServiceImpl<ISysMenuDao, SysMenu> implements ISysMenuService {
    /**
     * 查询菜单的分页集合
     * @param menuBO
     * @return
     */
    public List<SysMenu> getListPage(SysMenuBO menuBO) {
        Page page = new Page(menuBO.getPageNum(), menuBO.getPageSize());
        return baseMapper.getListPage(page,menuBO);
    }
}
