<%@ page import="com.team2.database.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Wiki Project" />
<meta name="keywords" content="menu, navigation, animation, transition, transform, rotate, css3, web design, component, icon, slide" />
<meta name="author" content="Codrops" />
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css" href="resources/css/demo.css" />
<link rel="stylesheet" type="text/css" href="resources/css/style10.css" />
<link rel="stylesheet" type="text/css" href="resources/css/animate-custom.css" />
<link href='http://fonts.googleapis.com/css?family=Terminal+Dosis' rel='stylesheet' type='text/css' />
<link href='resources/css/design.css' rel='stylesheet' type='text/css' />
<script type="text/javascript" src="resources/js/jquery-1.10.2.min.js"></script>


<script type="text/javascript">
function sendForm(pagenum){
	if(pagenum == 1){
		document.loginForm.action = "loginForm.do";	
	}else if(pagenum == 2){
		document.loginForm.action = "joinForm.do";
	}else if(pagenum == 3){
		document.loginForm.action = "contentsListView.do";
	}else if(pagenum == 4){
		document.loginForm.action = "openContentWrite.do";
	}else {}
	document.loginForm.submit();
}
</script>

	<title>Team 2 : Wiki Project</title>
</head>
<body id="body">
<form name="loginForm" >
	<div>
		<header>
			<h1> Wiki Project </h1>
			<div align="right">
				<input type="button" value="Login" onclick="javascript:sendForm(1)"/>
				<input type="button" value="Join" onclick="javascript:sendForm(2)"/>
			</div>
		</header>
		
		<div>
			<input type="button" value="ListView" onclick="javascript:sendForm(3)">
			<input type="button" value="ContentWrite" onclick="javascript:sendForm(4)">
		</div>
	</div>
</form>

	
</body>
</html>


