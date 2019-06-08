package com.dafeng.sec.user.domain.user.service;

import java.util.List;

import com.dafeng.sec.user.domain.user.entity.User;
import com.dafeng.sec.user.domain.user.entity.BO.UserPermissionBo;

public interface UserService {
	
	List<User> get();
	
	long insert(User user);
	
	boolean update(User user);
	
	boolean delete(int id);
	
	List<UserPermissionBo> userGetPermission();

	List<UserPermissionBo> getself(int id);
}
