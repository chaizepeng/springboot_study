package com.boot.service;

import com.boot.bean.Result;
import com.boot.bean.TestUser;

public interface TestUserService {

	Result saveUser(TestUser testUser);

	Result getUsers();

}
