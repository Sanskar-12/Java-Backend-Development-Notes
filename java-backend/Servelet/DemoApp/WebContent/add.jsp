<%@page import="java.util.Scanner"%> <!-- This is Directive tag where there are all the imports of file -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan"> 
<%! // --> This is Declaration tag this will be outside the service method
int c = 3;

%>

	<% // --> this is Scriptlet tag
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	
	int k = i+j;
	
	out.println("Output : "+k);
	%>
	
	<%= // This is Expression tag this will convert all the expression to out.println
	c
	%>
</body>
</html>

<!-- 
In Jsp we can write Java code inside html code
 -->