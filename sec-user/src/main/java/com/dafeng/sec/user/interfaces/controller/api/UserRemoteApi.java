package com.dafeng.sec.user.interfaces.controller.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dafeng.sec.user.domain.user.entity.User;
import com.dafeng.sec.user.domain.user.entity.BO.UserPermissionBo;
import com.dafeng.sec.user.facese.response.UserResponse;

@RequestMapping("/user")
public interface UserRemoteApi {
	
	@RequestMapping(value = "/getuserper", method = RequestMethod.GET)
	@ResponseBody
	UserResponse<UserPermissionBo> getUserPer();
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	UserResponse<User> get();
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	UserResponse<User> insert(@RequestBody User user);
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	UserResponse<User> update(@RequestBody User user);
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@ResponseBody
	UserResponse<User> delete(int id);
	
	@RequestMapping(value = "/getself", method = RequestMethod.GET)
	@ResponseBody
	UserResponse<UserPermissionBo> getSelf(@RequestParam int id);
}
