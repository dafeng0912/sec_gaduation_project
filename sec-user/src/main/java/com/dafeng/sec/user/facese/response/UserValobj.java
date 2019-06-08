package com.dafeng.sec.user.facese.response;

import com.dafeng.sec.user.infrastructure.util.AbstractResponse;

public class UserValobj extends AbstractResponse{
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String username;
	private String  password;
}
