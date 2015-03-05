<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<script type="text/javascript">

function hello(){
    var name = document.getElementById("name").value;
   	if( name == "") {
   	    alert("请输入你的姓名！");
   	    return false;
   	} else {
	     alert(name + "，你好！");
	}
}

function JumpToLoginPage(){
	var formObj = document.forms["form1"];
	formObj.submit();
	return;
}

</script>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First page</title>
	

</head>
<body>
	<form name="form1" id="form1" action="/TestServlet4/login" method="post">
	</form>

	<br/>
	<p>It's a landing page<p>
	<input type="button" onclick="JumpToLoginPage()" value="login" />
	
	
	
	
</body>
</html>