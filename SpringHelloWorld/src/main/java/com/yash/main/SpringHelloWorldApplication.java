package com.yash.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.yash.*")
public class SpringHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloWorldApplication.class, args);
	}

}
