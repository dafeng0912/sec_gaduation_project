package com.dafeng.sec.user.domain.permission.service;

import java.util.List;

import com.dafeng.sec.user.domain.permission.entity.Permission;
import com.dafeng.sec.user.domain.perssionuserref.entity.PerssionUserRef;
import com.dafeng.sec.user.domain.user.entity.BO.PerGetUserBo;



public interface PermissionService {
	
	List<Permission> get();

	int userdelete(PerssionUserRef permission);

	List<PerGetUserBo> pergetuser(int id);
}
