package com.github.privilege.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.privilege.bean.SysRole;
import com.github.privilege.bean.bo.SysRoleBO;

import java.util.List;

public interface ISysRoleService extends IService<SysRole> {

    /**
     * 查询用户的分页集合
     * @param roleBO
     * @return
     */
    List<SysRole> getListPage(SysRoleBO roleBO);

    /**
     * 查询用户的集合
     * @return
     */
    List<SysRole> getList();

    /**
     * 根据用户id查询用户的信息
     * @param id
     * @return
     */
    SysRole getByID(String id);

    /**
     * 根据id物理删除角色信息
     * @param id
     * @return
     */
    int deleteByID(String id);


    /**
     * 根据用户id修改角色信息
     * @param role
     * @return
     */
    int updateByID(SysRole role);

}
