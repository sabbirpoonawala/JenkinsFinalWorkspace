package com.yash.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.yash.controller.HelloController;

class TestHelloController {
	
	private HelloController controller;
	//update

	@BeforeEach
	void setUp() throws Exception {
		controller=new HelloController();
	}

	@AfterEach
	void tearDown() throws Exception {
		controller=null;
	}

	@Test
	void testSayHello() {
       String actual=controller.sayHello();
       assertEquals("HelloWorld",actual);
	}

}
