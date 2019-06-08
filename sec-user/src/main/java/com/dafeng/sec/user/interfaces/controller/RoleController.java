package com.dafeng.sec.user.interfaces.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.dafeng.sec.user.domain.role.entity.Role;
import com.dafeng.sec.user.domain.role.service.RoleService;
import com.dafeng.sec.user.facese.response.UserResponse;
import com.dafeng.sec.user.interfaces.controller.api.RoleRemoteApi;

@Controller
public class RoleController implements RoleRemoteApi {
	
	@Autowired
	private RoleService roleservice;
	
	@Override
	public UserResponse<Role> getAll() {
		return new UserResponse<Role>(roleservice.getAll());
	}

	@Override
	public UserResponse<Role> insert(@RequestBody Role role) {
		// TODO Auto-generated method stub
		return new UserResponse<Role>(roleservice.insert(role)?1:0);
	}

	@Override
	public UserResponse<Role> delete(@RequestParam int id) {
		return new UserResponse<Role>(roleservice.delete(id)?1:0);
	}

	@Override
	public UserResponse<Role> update(@RequestBody Role role) {
		return new UserResponse<Role>(roleservice.update(role)?0:1);
	}

}
