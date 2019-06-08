package com.dafeng.sec.user.domain.role.repo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dafeng.sec.user.domain.role.entity.Role;
import com.dafeng.sec.user.domain.role.entity.example.RoleExample;

public interface RoleDao {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);
}