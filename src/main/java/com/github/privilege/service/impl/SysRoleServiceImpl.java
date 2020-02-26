package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysRole;
import com.github.privilege.bean.SysRoleMenu;
import com.github.privilege.bean.SysUser;
import com.github.privilege.bean.vo.SysUserVO;
import com.github.privilege.dao.ISysRoleDao;
import com.github.privilege.dao.ISysRoleMenuDao;
import com.github.privilege.service.ISysRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SysRoleServiceImpl extends ServiceImpl<ISysRoleDao, SysRole> implements ISysRoleService {

    @Resource
    private ISysRoleMenuDao roleMenuDao;

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
    /**
     * 根据角色id该角色有哪些用户
     */
    @Override
    public List<SysUser> getUserRoleById(SysUserVO userVO) {
        return baseMapper.getUserRoleById(userVO);
    }

    /**
     * 通过角色id查询该未拥有的用户
     * @param userVO
     * @return
     */
    @Override
    public List<SysUser> getUserUNRoleById(SysUserVO userVO) {
        return baseMapper.getUserUNRoleById(userVO);
    }

    @Override
    @Transactional
    public int insertRole(SysRole sysRole) {
        baseMapper.insert(sysRole);
        return insertRoleMenu(sysRole);
    }

    /**
     * 批量添加新角色菜单
     * @param sysRole
     * @return
     */
    public int insertRoleMenu(SysRole sysRole){
        List<SysRoleMenu> list = new ArrayList<>();
        for (Long menu:sysRole.getMenuIds()) {
            SysRoleMenu roleMenu = new SysRoleMenu();
            roleMenu.setMenuId(menu);
            roleMenu.setRoleId(sysRole.getRoleId());
            list.add(roleMenu);
        }
        return  roleMenuDao.batchInsertRoleMenu(list);
    }


    @Override
    public int deleteRoleById(Long roleId) {
        return baseMapper.deleteById(roleId);
    }

    @Override
    public int deleteRoleBatch(Long roleIds) {
        return baseMapper.deleteRoleBatch(roleIds);
    }

    @Override
    public int updateRoleById(Long roleId) {
        return 0;
    }

    @Override
    public int cancelAuthorization(Long roleId) {
        return baseMapper.cancelAuthorization(roleId);
    }

    @Override
    public int cancelAuthorizationAll(Long roleIds) {
        return baseMapper.cancelAuthorizationAll(roleIds);
    }
}
