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

</script>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First page</title>
	

</head>
<body>
	Name:<input type="text" id="name" />
	<input type="button" onclick="hello()" value="确定" />
</body>
</html>