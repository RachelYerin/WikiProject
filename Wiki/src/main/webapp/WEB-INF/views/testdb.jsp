<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>DB test</title>
</head>

<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Wiki Project" />
<meta name="keywords"
	content="menu, navigation, animation, transition, transform, rotate, css3, web design, component, icon, slide" />
<meta name="author" content="Codrops" />
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css" href="resources/css/demo.css" />
<link rel="stylesheet" type="text/css" href="resources/css/style10.css" />
<link rel="stylesheet" type="text/css" href="resources/css/animate-custom.css" />
<link href='http://fonts.googleapis.com/css?family=Terminal+Dosis' rel='stylesheet' type='text/css' />
<script type="text/javascript" src="resources/js/jquery-1.10.2.min.js"></script>


<script type="text/javascript">
function testProcess(){
	document.dbtest.action = "loginForm.do";	
	document.dbtest.submit();
}

</script>
<body>

<form name="dbtest" action="testProcess" method="post">
	<input type="submit" value ="Test">
</form>
</body>
</html>