package com.dafeng.sec.user.domain.role.service;

import java.util.List;

import com.dafeng.sec.user.domain.role.entity.Role;

public interface RoleService {
	
	List<Role> getAll();
	
	boolean insert(Role role);
	
	boolean update(Role role);
	
	boolean delete(int id);
}
