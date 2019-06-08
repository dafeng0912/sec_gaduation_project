package com.dafeng.sec.user.domain.permission.repo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dafeng.sec.user.domain.permission.entity.Permission;
import com.dafeng.sec.user.domain.permission.entity.example.PermissionExample;

public interface PermissionDao {
    long countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);
}