<%@ page import="com.team2.database.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Wiki Project" />
<meta name="keywords"
	content="menu, navigation, animation, transition, transform, rotate, css3, web design, component, icon, slide" />
<meta name="author" content="Codrops" />
<link rel="stylesheet" type="text/css"
	href="resources/css/yeonheestyle.css" />
<title>Team 2 : Wiki Project</title>
<script>

</script>
</head>
<body>
	<jsp:include page="header.jsp" flush="true" />
	<div id="sideinfo">
		<input type="button" value="ListView" onclick="javascript:sendForm(3)"> <br>
		<input type="button" value="ContentWrite" onclick="javascript:sendForm(4)"> <br> 
		<input type="button" value="Test" onclick="javascript:sendForm(5)"> <br> 
		<form class="form-horizontal" method="post" action="searchContents.do" id="searchForm">
			<input type="text" maxlength="20" size="10" name="keyword"> 
			<!-- <input type="button" value="Search" onClick="javascript:check()">  -->
			<input class="submit" type="submit" value="Search" />
		</form>
	</div>
</body>
</html>
