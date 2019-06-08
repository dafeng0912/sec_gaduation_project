package com.dafeng.sec.user.domain.permission.service.impo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dafeng.sec.user.domain.permission.entity.Permission;
import com.dafeng.sec.user.domain.permission.entity.example.PermissionExample;
import com.dafeng.sec.user.domain.permission.repo.dao.PermissionDao;
import com.dafeng.sec.user.domain.permission.service.PermissionService;
import com.dafeng.sec.user.domain.perssionuserref.entity.PerssionUserRef;
import com.dafeng.sec.user.domain.perssionuserref.entity.example.PerssionUserRefExample;
import com.dafeng.sec.user.domain.perssionuserref.repo.dao.PerssionUserRefDao;
import com.dafeng.sec.user.domain.user.entity.BO.PerGetUserBo;
import com.dafeng.sec.user.domain.user.repo.dao.UserDao;

@Service
public class PermissionServiceImpo implements PermissionService {
	
	@Autowired
	private PermissionDao pd;
	@Autowired
	private PerssionUserRefDao purd;
	@Autowired
	private UserDao userdao;
	
	private PermissionExample example;
	
	private PerssionUserRefExample pure;

	@Override
	public List<Permission> get() {
		example = new PermissionExample();
		return pd.selectByExample(example);
	}

	@Override
	public int userdelete(PerssionUserRef permission) {
		pure.createCriteria().andUserIdEqualTo(permission.getUserId()).andPermisssionIdEqualTo(permission.getPermisssionId());
		return purd.deleteByExample(pure);
	}

	@Override
	public List<PerGetUserBo> pergetuser(int id) {
		List<PerGetUserBo> perGetUser = userdao.perGetUser(id);
		return perGetUser;
	}
	
}
