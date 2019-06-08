package com.dafeng.sec.user.interfaces.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.dafeng.sec.user.domain.user.entity.User;
import com.dafeng.sec.user.facese.response.UserAndValobj;
import com.dafeng.sec.user.facese.response.UserValobj;

@RestController
@RequestMapping("/user")
public class LoginController {
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST,RequestMethod.GET})
	public UserAndValobj login(@RequestBody UserValobj userValobj) {

		System.out.println(JSON.toJSONString(userValobj));
	
		User user=	new User();

		return new UserAndValobj(user);
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		return "{\"code\":200}";
	}
}
