package com.dafeng.sec.user.domain.perssionuserref.repo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dafeng.sec.user.domain.perssionuserref.entity.PerssionUserRef;
import com.dafeng.sec.user.domain.perssionuserref.entity.example.PerssionUserRefExample;
import com.dafeng.sec.user.domain.user.entity.User;

public interface PerssionUserRefDao {
    long countByExample(PerssionUserRefExample example);

    int deleteByExample(PerssionUserRefExample example);

    int insert(PerssionUserRef record);

    int insertSelective(PerssionUserRef record);

    List<PerssionUserRef> selectByExample(PerssionUserRefExample example);

    int updateByExampleSelective(@Param("record") PerssionUserRef record, @Param("example") PerssionUserRefExample example);

    int updateByExample(@Param("record") PerssionUserRef record, @Param("example") PerssionUserRefExample example);
}