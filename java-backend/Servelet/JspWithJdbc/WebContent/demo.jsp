<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		
		String url="jdbc:mysql://localhost:3306/Db1";
	    String uname="root";
	    String pass="Sanskar@123";
	    String query="select id,name from students where id=8";
		
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, uname, pass);
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    rs.next();
	%>
	
	<%= rs.getString(1) %>
	<%= rs.getString(2) %>
</body>
</html>