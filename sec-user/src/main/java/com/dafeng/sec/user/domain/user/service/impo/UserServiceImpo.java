package com.dafeng.sec.user.domain.user.service.impo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dafeng.sec.user.domain.user.entity.User;
import com.dafeng.sec.user.domain.user.entity.BO.UserPermissionBo;
import com.dafeng.sec.user.domain.user.entity.example.UserExample;
import com.dafeng.sec.user.domain.user.repo.dao.UserDao;
import com.dafeng.sec.user.domain.user.service.UserService;

@Service
public class UserServiceImpo implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	private UserExample example;

	@Override
	public List<User> get() {
		example = new UserExample();
		return userDao.selectByExample(example);
	}

	
	@Override
	public long insert(User user) {
		long l = System.currentTimeMillis();
		Date time=new Date(l);
		user.setAdmissionTime(time);
		example = new UserExample();userDao.insertSelective(user);return l;
	}

	@Override
	public boolean update(User user) {
		example = new UserExample();
		example.createCriteria().andIdEqualTo(user.getId());
		int updateByExampleSelective = userDao.updateByExampleSelective(user, example);
		return updateByExampleSelective>0;
	}

	@Override
	public boolean delete(int id) {
		example = new UserExample();
		int deleteByExample = userDao.deleteByExample(example.createCriteria().andIdEqualTo(id));
		return deleteByExample>0;
	}


	@Override
	public List<UserPermissionBo> userGetPermission() {
		return userDao.getUserPer();
	}


	@Override
	public List<UserPermissionBo> getself(int id) {
		return userDao.getself(id);
	}

}
