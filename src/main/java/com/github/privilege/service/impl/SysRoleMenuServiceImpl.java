package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysRoleMenu;
import com.github.privilege.dao.ISysRoleMenuDao;
import com.github.privilege.service.ISysRoleMenuService;
import org.springframework.stereotype.Service;

@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<ISysRoleMenuDao, SysRoleMenu> implements ISysRoleMenuService {
}
