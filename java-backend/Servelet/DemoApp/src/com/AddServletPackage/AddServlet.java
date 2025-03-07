package com.AddServletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		PrintWriter out = res.getWriter();
		
		out.println("result is " + k);
		
		System.out.println("The result is " + k);
		
		
		// Request Dispatcher
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("/sq"); // We can call another Servlet from this Servlet
//		rd.forward(req, res);
		
		// URL Rewriting
//		res.sendRedirect("sq?k="+k);
		
		// Session Storing
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
		// Cookie
		Cookie cookie = new Cookie("k", k+"");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
	}
}

// doPost method will handle only post request
// doGet method will handle only get request