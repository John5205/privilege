package com.github.privilege.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.privilege.bean.SysUser;
import com.github.privilege.bean.bo.SysUserBO;

import java.util.List;

public interface ISysUserService extends IService<SysUser> {
    /**
     * 查询用户的分页集合
     * @param userBO
     * @return
     */
    List<SysUser> getListPage(SysUserBO userBO);

    /**
     * 查询用户的集合
     * @return
     */
    List<SysUser> getList();
    /**
     * 根据用户id查询用户的信息
     * @param id
     * @return
     */
    SysUser getByID(String id);

    /**
     * 根据id物理删除用户信息
     * @param id
     * @return
     */
    int deleteById(String id);

    /**
     * 根据id批量删除用户信息
     * @param ids
     * @return
     */
    int deleteBacthById(String[] ids);

    /**
     * 根据用户id修改用户信息
     * @param user
     * @return
     */
    int updateByID(SysUser user);

}
