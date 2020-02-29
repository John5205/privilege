package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.privilege.bean.SysUserRole;
import java.util.List;
public interface ISysUserRoleDao extends BaseMapper<SysUserRole> {
    /**
     * 添加用户时添加角色
     */
    int batchInsertUserRole(List<SysUserRole> list);
}
