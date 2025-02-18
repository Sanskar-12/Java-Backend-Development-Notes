package com.ServletContextandConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/config") // --> This defines that if someone request on config url then it should got to this Servlet
public class ServletConfigJava extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		// In Servlet Config the information is shared with the specific Servlet
		ServletConfig config = getServletConfig();
		String str = config.getInitParameter("name");
		out.println(str);
	}
}
