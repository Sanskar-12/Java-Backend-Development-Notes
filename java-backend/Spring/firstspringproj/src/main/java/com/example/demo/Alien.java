package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Autowired // This object is created by springboot automatically by Autowired annotation
	Laptop lap;
	
	public void code() {
		System.out.println("Hello from alien");
		
		lap.lap();
	}
}
