package com.dafeng.sec.user.domain.user.repo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dafeng.sec.user.domain.user.entity.User;
import com.dafeng.sec.user.domain.user.entity.BO.PerGetUserBo;
import com.dafeng.sec.user.domain.user.entity.BO.UserPermissionBo;
import com.dafeng.sec.user.domain.user.entity.example.UserExample;
import com.dafeng.sec.user.domain.user.entity.example.UserExample.Criteria;

public interface UserDao {
	
	List<UserPermissionBo> getUserPer();
	
	List<PerGetUserBo> perGetUser(int perid);
	
    long countByExample(UserExample example);

    int deleteByExample(Criteria criteria);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
    
    List<UserPermissionBo> getself(int id);
}