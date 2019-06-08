package com.dafeng.sec.user.interfaces.controller.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dafeng.sec.user.domain.role.entity.Role;
import com.dafeng.sec.user.facese.response.UserResponse;

@RequestMapping("/role")
public interface RoleRemoteApi {
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	UserResponse<Role> getAll();
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	UserResponse<Role> insert(@RequestBody Role role);
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@ResponseBody
	UserResponse<Role> delete(int id);
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	UserResponse<Role> update(@RequestBody Role role);
}
