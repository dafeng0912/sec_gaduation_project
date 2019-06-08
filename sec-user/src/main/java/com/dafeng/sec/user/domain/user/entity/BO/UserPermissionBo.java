package com.dafeng.sec.user.domain.user.entity.BO;

import java.util.List;

import com.dafeng.sec.user.domain.permission.entity.Permission;
import com.dafeng.sec.user.domain.user.entity.User;

public class UserPermissionBo extends User {
	
	private List<Permission> list;

	public List<Permission> getList() {
		return list;
	}

	public void setList(List<Permission> list) {
		this.list = list;
	}
	
}
