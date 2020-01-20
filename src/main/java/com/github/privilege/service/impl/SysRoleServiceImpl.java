package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysRole;
import com.github.privilege.dao.ISysRoleDao;
import com.github.privilege.service.ISysRoleService;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl extends ServiceImpl<ISysRoleDao, SysRole> implements ISysRoleService {

}
