<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test doGet and doPost</title>
</head>
<body>
	<form action="/TestServlet1/MyServlet2" method="post">
	Username:<input type="text" name="username"/>
	Password:<input type="text" name="password"/>
	<input type="submit" value="login"/>
	</form>
</body>
</html>