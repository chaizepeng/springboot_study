package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.bean.TestUser;

public interface TestUserDao extends JpaRepository<TestUser, Long>{

}
