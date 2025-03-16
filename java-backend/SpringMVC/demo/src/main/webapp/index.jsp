<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Starter Page</title>
</head>
<body>
    Welcome to Calculator
	
	<form action="add"> <!-- when form will get submitted it will call add page request -->
		Enter num1 : <input type="text" name="num1"/> <br/>
		Enter num2 : <input type="text" name="num2"/> <br/>
		<input type="submit"/>
	</form>
</body>
</html>
