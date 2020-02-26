package com.github.privilege.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.privilege.bean.SysRoleMenu;

import java.util.List;

/**
 * @ClassName ISysRoleMenuDao
 * @Description TODO
 * @Author JOHN
 * @Date 2020/2/26 9:37
 * @Version 1.0
 **/
public interface ISysRoleMenuDao extends BaseMapper<SysRoleMenu> {

    int batchInsertRoleMenu(List<SysRoleMenu> list);
}
