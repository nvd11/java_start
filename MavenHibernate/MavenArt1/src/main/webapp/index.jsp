<html>

<script type="text/javascript">

function jumpToLoginPage(){
	var formobj = document.forms["form1"];
	formobj.submit();	
	return;
}
</script>

<body>
<form name="form1" id="form1" action="/MavenArt1/Login" method="post">
</form>

<h2>Hello World!!</h2>
<input type="button" onclick="jumpToLoginPage()" value="login"/>

</body>

</html>
