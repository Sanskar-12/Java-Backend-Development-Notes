package com.ServletContextandConfig;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ctx") // --> This defines that if someone request on ctx url then it should got to this Servlet
public class ServletContextJava extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		// In Servlet Context the information is shared with all the Servlets
		ServletContext ctx = getServletContext();
		
		String str = ctx.getInitParameter("name");
		out.println(str);
	}
}
