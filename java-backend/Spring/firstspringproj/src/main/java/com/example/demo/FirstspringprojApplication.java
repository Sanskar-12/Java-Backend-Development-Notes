package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstspringprojApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstspringprojApplication.class, args);
		Alien obj = context.getBean(Alien.class);
		
		obj.code();
	}

}
