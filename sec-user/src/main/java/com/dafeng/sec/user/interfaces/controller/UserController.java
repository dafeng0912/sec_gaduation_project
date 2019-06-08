package com.dafeng.sec.user.interfaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.dafeng.sec.user.domain.user.entity.User;
import com.dafeng.sec.user.domain.user.entity.BO.UserPermissionBo;
import com.dafeng.sec.user.domain.user.service.UserService;
import com.dafeng.sec.user.facese.response.UserResponse;
import com.dafeng.sec.user.interfaces.controller.api.UserRemoteApi;

@Controller
public class UserController implements UserRemoteApi {
	
	@Autowired
	private UserService userSercice;

	@Override
	public UserResponse<User> get() {
		return new UserResponse<User>(userSercice.get());
	}
	
	/**
	 * 	返回添加的id值或者影响的行数
	 */
	@Override
	public UserResponse<User> insert(@RequestBody User user) {
		return new UserResponse<User>(userSercice.insert(user));
	}
	
	/**
	 * 成功返回1，失败返回0
	 */
	@Override
	public UserResponse<User> update(@RequestBody User user) {
		return new UserResponse<User>(userSercice.update(user) == true?1:0);
	}
	
	/**
	 * 成功返回1，失败返回0
	 */
	@Override
	public UserResponse<User> delete(int id) {
		return new UserResponse<User>(userSercice.delete(id) == true?1:0);
	}

	@Override
	public UserResponse<UserPermissionBo> getUserPer() {
		return new UserResponse<UserPermissionBo>(userSercice.userGetPermission());
	}

	@Override
	public UserResponse<UserPermissionBo> getSelf(@RequestParam int id) {
		return new UserResponse<UserPermissionBo>(userSercice.getself(id));
	}
}
