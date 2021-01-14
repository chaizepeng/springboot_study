package com.boot.FirstBoot;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.boot.controller.HelloController;

@SpringBootTest
public class HelloControllerTest {

	private static MockMvc mvc;
	
	static {
		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}
//	@BeforeAll
//	public void setUp() throws Exception{
//		
//	}
	
	@Test
	public void getHello() throws Exception{
		 mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andDo(MockMvcResultHandlers.print())
					.andReturn();
	}
}
