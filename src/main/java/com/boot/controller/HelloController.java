package com.boot.controller;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.properties.TestProperties;

@RestController
public class HelloController {
	
	
	
	@Autowired
	private TestProperties properties;

	@RequestMapping("/hello")
	public String hello() {
//		ClassPathXmlApplicationContext
		System.out.println(properties.getTitle()+"---"+properties.getDescription());
		return "hello world boot";
	}
}
