<%@ page import="com.team2.database.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Wiki Project" />
<meta name="keywords" content="menu, navigation, animation, transition, transform, rotate, css3, web design, component, icon, slide" />
<meta name="author" content="Codrops" />
<link rel="stylesheet" type="text/css" href="resources/css/yeonheestyle.css" />
<title>Team 2 : Wiki Project</title>

</head>
<body>
<jsp:include page="header.jsp" flush="true" />
<table class="board_view" width="70%">
		<colgroup>
			<col width="75%" />
			<col width="25%" />
		</colgroup>
		<tbody>
			<tr>
				<td>${content.title}</td>
				<td>등록일 : ${content.reg_date} <br> 수정일 : ${content.upd_date} <br> 작성자 : ${content.reg_email}</td>
			</tr>
			<tr>
				<td colspan="2">${content.desc}</td>
			</tr>
			<tr>
			<td colspan="2">
			<form class="form-horizontal" method="post" action="openContentDetail.do" id="contentDetail">
			<input type="hidden" name="idx" id="idx" value="" />
			</form>
	
			<a href="/wiki/contentsListView.do" class="btn" id="list"><span>List(목록)</span></a>
			<a href="modifyContentView.do?idx=${content.idx}" class="btn" id="modify"><span>Modify(수정)</span></a>
			<!-- <a href="modifyContentView.do?idx=${content.idx}" class="btn" id="modify">수정하기</a>-->
			<a href="deleteContent.do?idx=${content.idx}" class="btn" id="delete"><span>Delete(삭제)</span></a>
			<!-- <a href="deleteContent.do?idx=${content.idx}" class="btn" id="delete">삭제하기</a> --></td>
		</tbody>
	</table>
	
</body>
</html>
