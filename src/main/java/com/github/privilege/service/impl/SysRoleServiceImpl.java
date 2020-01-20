package com.github.privilege.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.privilege.bean.SysRole;
import com.github.privilege.bean.SysUser;
import com.github.privilege.bean.bo.SysRoleBO;
import com.github.privilege.dao.ISysRoleDao;
import com.github.privilege.dao.ISysUserDao;
import com.github.privilege.service.ISysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRoleServiceImpl  extends ServiceImpl<ISysRoleDao, SysRole> implements ISysRoleService {

    @Resource
    private ISysUserDao userDao;

    /**
     * 查询角色分页集合
     * @param roleBO
     * @return
     */
    public List<SysRole> getListPage(SysRoleBO roleBO) {
        Page page = new Page(roleBO.getPageNum(), roleBO.getPageSize());
        return baseMapper.getListPage(page,roleBO);
    }

    /**
     * 查询角色集合
     * @return
     */
    public List<SysRole> getList() {
        return baseMapper.getList();
    }

    /**
     * 根据角色的id查询角色信息
     * @param id
     * @return
     */
    public SysRole getByID(String id) {
        return baseMapper.getByID(id);
    }

    /**
     * 根据角色的id删除角色的信息
     * @param id
     * @return
     */
    public int deleteByID(String id) {
        SysUser sysUser = userDao.selectOne(Wrappers.<SysUser>lambdaQuery().eq(SysUser::getRoleId, id));
        if(sysUser != null){
            throw new RuntimeException("该角色已有用户使用不能移除");
        }
        return baseMapper.deleteById(id);
    }

    /**
     * 根据角色的id修改角色的信息
     * @param role
     * @return
     */
    public int updateByID(SysRole role) {
        return baseMapper.updateById(role);
    }
}
