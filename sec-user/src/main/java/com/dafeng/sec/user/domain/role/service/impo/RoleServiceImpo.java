package com.dafeng.sec.user.domain.role.service.impo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dafeng.sec.user.domain.role.entity.Role;
import com.dafeng.sec.user.domain.role.entity.example.RoleExample;
import com.dafeng.sec.user.domain.role.repo.dao.RoleDao;
import com.dafeng.sec.user.domain.role.service.RoleService;

@Service
public class RoleServiceImpo implements RoleService{
	
	@Autowired
	private RoleDao roledao;
	
	private RoleExample example;
	
	@Override
	public List<Role> getAll() {
		example = new RoleExample();
		List<Role> selectByExample = roledao.selectByExample(example);
		return selectByExample;
	}

	@Override
	public boolean insert(Role role) {
		example = new RoleExample();
		return roledao.insertSelective(role)>0;
	}

	@Override
	public boolean update(Role role) {
		example = new RoleExample();
		example.createCriteria().andIdEqualTo(role.getId());
		return roledao.updateByExampleSelective(role, example)>0;
	}

	@Override
	public boolean delete(int id) {
		example = new RoleExample();
		example.createCriteria().andIdEqualTo(id);
		return roledao.deleteByExample(example)>0;
	}

}
