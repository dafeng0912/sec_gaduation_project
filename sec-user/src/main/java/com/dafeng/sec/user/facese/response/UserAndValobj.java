package com.dafeng.sec.user.facese.response;

import com.dafeng.sec.user.domain.user.entity.User;
import com.dafeng.sec.user.infrastructure.util.AbstractResponse;

public class UserAndValobj extends AbstractResponse{
	public UserAndValobj(User user) {
		this.user=user;
	}
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
