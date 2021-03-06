<%@ page import="com.team2.database.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Wiki Project" />

<title>Team 2 : Wiki Project</title>
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css" href="resources/css/demo.css" />
<link rel="stylesheet" type="text/css" href="resources/css/style10.css" />
<link href='http://fonts.googleapis.com/css?family=Terminal+Dosis'
	rel='stylesheet' type='text/css' />
<link href='resources/css/design.css' rel='stylesheet' type='text/css' />
<script type="text/javascript" src="resources/js/jquery-1.10.2.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="resources/css/yeonheestyle.css" />

<script type="text/javascript">
	function sendForm(pagenum) {
		if (pagenum == 1) {
			document.loginForm.action = "loginForm.do";
		} else if (pagenum == 2) {
			document.loginForm.action = "joinForm.do";
		} else if (pagenum == 3) {
			document.loginForm.action = "contentsListView.do";
		} else if (pagenum == 4) {
			document.loginForm.action = "openContentWrite.do";
		} else if (pagenum == 5) {
			document.loginForm.action = "fileUploadView.do";
		} else if (pagenum == 8) {
			document.loginForm.action = "logout.do";
		} else {
			document.loginForm.action = "searchContents.do";
		}
		document.loginForm.submit();
	}

	function check() {
		if (document.searchForm.keyword.value == "") {
			alert("검색어를 입력하세요.");
			document.search.keyword.focus();
			return;
		}
		document.searchForm.submit();
	}
</script>
</head>

<body id="body">
	<div id="header">
		<form name="loginForm">
			<div align="right">
				<input class="loginbutton" type="button" value="LOGIN"
					onclick="javascript:sendForm(1)"> </input> 
				<input 	class="joinbutton" type="button" value="JOIN"
					onclick="javascript:sendForm(2)"> </input> 
				<input	class="logoutbutton" type="button" value="LOGOUT"
					onclick="javascript:sendForm(8)" />
			</div>
			<div class="container">
				<a href="main.do"><h1>Wiki Project</h1></a>
			</div>
		</form>
	</div>
	<hr>
	<div id="sideinfo">
		<table>
			<tr>
				<td><br> <input type="button" value="ListView"
					onclick="javascript:sendForm(3)"><br></td>
			</tr>
			<tr>
				<td><br> <input type="button" value="ContentWrite"
					onclick="javascript:sendForm(4)"> <br></td>
			</tr>
			<!-- 파일 업로드 테스트 -->
<!-- 			<tr>
				<td><br> <input type="button" value="Test"
					onclick="javascript:sendForm(5)"> <br></td>
			</tr>
 -->			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><br>
					<form class="form-horizontal" method="post"
						action="searchContents.do" id="searchForm">
						<input type="text" maxlength="20" size="10" name="keyword" required="required"><br>
						<input class="submit" type="submit" value="Search" />
					</form></td>
			</tr>
		</table>
	</div>

</body>
</html>