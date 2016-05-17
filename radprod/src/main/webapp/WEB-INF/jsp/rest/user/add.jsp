<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add User</title>
</head>
<body>
    <!-- no action defined here, the form will submit to /add as default -->
    <form:form method="post" modelAttribute="user">
          Userid:<form:input path="id"/><form:errors path="id"/><br/>
          Username:<form:input path="name"/><form:errors path="name"/><br/>
          nickname:<form:input path="nickName"/><form:errors path="nickName"/><br/>
          email:<form:input path="email"/><form:errors path="email"/><br/>
          <input type="submit" value="Add User"/>
    </form:form>

</body>
</html>

