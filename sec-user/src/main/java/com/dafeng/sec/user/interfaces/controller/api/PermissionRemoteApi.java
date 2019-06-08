package com.dafeng.sec.user.interfaces.controller.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dafeng.sec.user.domain.permission.entity.Permission;
import com.dafeng.sec.user.domain.perssionuserref.entity.PerssionUserRef;
import com.dafeng.sec.user.domain.user.entity.BO.PerGetUserBo;
import com.dafeng.sec.user.facese.response.UserResponse;

@RequestMapping("/permission")
public interface PermissionRemoteApi {
	 
	/**
	 * 	获得权限列表
	 * @return
	 */
	@RequestMapping(value = "/get",method = RequestMethod.GET)
	@ResponseBody
	UserResponse<Permission> get();
	
	/**
	 * 删除用户的权限
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	@ResponseBody
	public UserResponse<PerssionUserRef> delete(@RequestParam("perId")String perId);
	
	/**
	 * 	增加用户的权限
	 * @param str
	 * @return
	 */
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	@ResponseBody
	UserResponse<Permission> insert(String str);
	
	/**
	 * 	修改用户的权限
	 * @param str
	 * @return
	 */
	@RequestMapping(value = "/update",method = RequestMethod.GET)
	@ResponseBody
	UserResponse<Permission> update(String str);
	
	/**
	 * 	根据权限找用户
	 * @param str
	 * @return
	 */
	@RequestMapping(value = "/pergetuser",method = RequestMethod.GET)
	@ResponseBody
	UserResponse<PerGetUserBo> permissiongetuser(int id);
	
}
