package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("add") // here the request is mapped to add then it will call result.jsp
	public String add(@RequestParam("num1") int i,@RequestParam("num2") int j, HttpSession session) {
		int num3 = i+j;
		
		session.setAttribute("num3", num3);
		
		return "result.jsp";
	}
}
