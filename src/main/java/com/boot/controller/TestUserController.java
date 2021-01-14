package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.bean.Result;
import com.boot.bean.TestUser;
import com.boot.service.TestUserService;

@RestController
@RequestMapping("/test/user")
public class TestUserController {

	@Autowired
	private TestUserService testUserService;
	
	@RequestMapping("/save")
	public String saveUser(@RequestBody TestUser testUser) {
		Result result = testUserService.saveUser(testUser);
		return result.getMsg();
	}
	
	@RequestMapping("/users")
	@Cacheable(value = "users-key")
	public Result getUsers() {
		Result result = testUserService.getUsers();
		return result;
	}
	
}
