package com.dafeng.sec.user.interfaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dafeng.sec.user.domain.permission.entity.Permission;
import com.dafeng.sec.user.domain.permission.service.PermissionService;
import com.dafeng.sec.user.domain.perssionuserref.entity.PerssionUserRef;
import com.dafeng.sec.user.domain.user.entity.BO.PerGetUserBo;
import com.dafeng.sec.user.facese.response.UserResponse;
import com.dafeng.sec.user.interfaces.controller.api.PermissionRemoteApi;

@Controller
public class PermissionController implements PermissionRemoteApi {
	@Autowired
	private PermissionService permissionservice;

	@Override
	public UserResponse<Permission> get() {
		return new UserResponse<Permission>(permissionservice.get());
	}

	@Override
	public UserResponse<PerssionUserRef> delete(@RequestParam("perId")String perId) {
		JSONObject pa=JSONObject.parseObject(perId);
		PerssionUserRef perssionUserRef = new PerssionUserRef();
		int userId = Integer.parseInt(pa.getString("userId"));
		int psermissionId = Integer.parseInt(pa.getString("permisssionId"));
		perssionUserRef.setUserId(userId);
		perssionUserRef.setPermisssionId(psermissionId);
		return new UserResponse<PerssionUserRef>(permissionservice.userdelete(perssionUserRef));
	}

	@Override
	public UserResponse<Permission> insert(String str) {
		System.out.println(str);
		return null;
	}

	@Override
	public UserResponse<Permission> update(String str) {
		return null;
	}


	@Override
	public UserResponse<PerGetUserBo> permissiongetuser(int id) {
		return new UserResponse<PerGetUserBo>(permissionservice.pergetuser(id));
	}

}
