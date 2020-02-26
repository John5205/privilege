package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.privilege.bean.SysUserRole;

import java.util.List;

/**
 * @ClassName ISysUserRoleDao
 * @Description TODO
 * @Author JOHN
 * @Date 2020/2/26 10:44
 * @Version 1.0
 **/
public interface ISysUserRoleDao extends BaseMapper<SysUserRole> {
    /**
     * 添加用户时添加角色
     * @param list
     */
    int batchInsertUserRole(List<SysUserRole> list);
}
