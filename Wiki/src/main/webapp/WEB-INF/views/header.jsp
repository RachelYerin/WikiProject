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
	
	<title>Team 2 : Wiki Project</title>
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
			document.loginForm.action = "viewContents.do";
		}else if(pagenum == 4){
			document.loginForm.action = "openContentWrite.do";
		}else{
			document.loginForm.action = "fileuploadview.do";
		}
		
		document.loginForm.submit();
	}
	</script>
	<style>
	.loginbutton {float:right;}
	#container  { margin:auto; padding:10px; }
	#header   {height:100px; }
	#content  {float:left; width:660px; height:400px; }
	#sideinfo  {float:right; width:300px; height:400px; }
	#footer   {clear:both; height:50px; }
	h1 {font-size:50pt; text-align:center;}
	</style>
</head>

<body id="body">
<div id="container">

<div id="header">
			<h1> Wiki Project </h1>
			<form name="loginForm" >
				<input class="loginbutton" type="button" value="Login" onclick="javascript:sendForm(1)"/>&nbsp;&nbsp;
				<input class="loginbutton" type="button" value="Join" onclick="javascript:sendForm(2)"/>
			</form>
</div>
<hr>
	
</body>
</html>