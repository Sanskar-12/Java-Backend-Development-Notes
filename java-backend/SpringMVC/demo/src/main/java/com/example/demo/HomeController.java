package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("add") // here the request is mapped to add then it will call result.jsp
	public String add(HttpServletRequest req) {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int num3 = i+j;
		
		HttpSession session = req.getSession();
		
		session.setAttribute("num3", num3);
		
		return "result.jsp";
	}
}
