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

</head>
<body>
<jsp:include page="header.jsp" flush="true"/>


	<input type="button" value="ListView" onclick="javascript:sendForm(3)">
	<br>

	<input type="button" value="ContentWrite" onclick="javascript:sendForm(4)">
	<br>

	<input type="button" value="Test" onclick="javascript:sendForm(5)">
	<br>
	<input type="text" maxlength="20" size="10" name="keyword"><br>
	<input type="button" value="search" onclick="javascript:sendForm(6)">
</div>

<div id="content">


</div>

<div id="footer"><jsp:include page="footer.jsp" flush="true"/></div>
</div>
</body>
</html>

