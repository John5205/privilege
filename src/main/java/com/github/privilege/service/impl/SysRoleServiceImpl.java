package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysRole;
import com.github.privilege.dao.ISysRoleDao;
import com.github.privilege.service.ISysRoleService;

import java.util.List;

public class SysRoleServiceImpl extends ServiceImpl<ISysRoleDao, SysRole> implements ISysRoleService {
    @Override
    public List<SysRole> getRolePage(SysRole sysRole) {
        Page page = new Page(sysRole.getPageNum(), sysRole.getPageSize());
        return baseMapper.getRolePage(page,sysRole);
    }

    @Override
    public List<SysRole> getRoleListAll() {
        return baseMapper.getRoleListAll();
    }

    @Override
    public List<SysRole> getRolesByUserId(Long userId) {
        List<SysRole> roles = baseMapper.getRolesByUserId(userId);
        List<SysRole> roleList = getRoleListAll();
        for (SysRole role: roles) {
            for (SysRole sysRole:roleList) {
                if(role.getRoleId().longValue()==sysRole.getRoleId().longValue()){
                    role.setFlag(true);
                    break;
                }
            }
        }
        return roles;
    }

    @Override
    public SysRole getRoleById(Long roleId) {
        return baseMapper.getRoleById(roleId);
    }

    @Override
    public int deleteRoleById(Long roleId) {
        return baseMapper.deleteById(roleId);
    }

    @Override
    public int deleteRoleBatch(Long[] roleIds) {
        return baseMapper.deleteRoleBatch(roleIds);
    }

    @Override
    public int updateRoleById(Long roleId) {
        return 0;
    }
}
