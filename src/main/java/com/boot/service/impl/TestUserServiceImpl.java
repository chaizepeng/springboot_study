package com.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.bean.Result;
import com.boot.bean.TestUser;
import com.boot.dao.TestUserDao;
import com.boot.service.TestUserService;

@Service
public class TestUserServiceImpl implements TestUserService{

	@Autowired
	private TestUserDao testUserDao;

	@Override
	public Result saveUser(TestUser testUser) {
		TestUser save = testUserDao.save(testUser);
		if (save != null) {
			return Result.ok(save);
		}
		return Result.error();
	}

	@Override
	public Result getUsers() {
		List<TestUser> findAll = testUserDao.findAll();
		if (findAll != null) {
			return Result.ok(findAll);
		}
		return Result.error();
	}
	
	
}
