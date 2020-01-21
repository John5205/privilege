package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysUserRole;
import com.github.privilege.dao.ISysUserRoleDao;
import com.github.privilege.service.ISysUserRoleService;
import org.springframework.stereotype.Service;

@Service
public class SysUserRoleServiceImpl extends ServiceImpl<ISysUserRoleDao,SysUserRole> implements ISysUserRoleService {
}
