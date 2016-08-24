<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Team 2 : Wiki Project</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<style>
#title {
	text-align: center;
	font-size: 30pt;
}

table {
	margin: auto;
	border: 2px black solid;
	border-collapse: collapse;
}

table td,th {
	font-size: 13pt;
	padding: 10px;
}

table th {
	text-align: center;
}

span {
	background-color: Black;
	color: white;
	font-size: 17pt;
}

body {
	margin: auto;
}
</style>
</head>

<body>
	<jsp:include page="index.jsp" flush="true" />
	<h1 id="title">오늘의 글귀</h1>
	<table class="board_view" border="1" width="70%">
		<colgroup>
			<col width="10%" />
			<col width="65%" />
			<col width="25%" />
		</colgroup>
		<tbody>
			<tr>
				<th scope="row">제목</th>
				<td>${content.title}</td>
				<td>글 번호 : ${content.idx} <br> 등록일 : ${content.reg_date} <br>
					수정일 : ${content.upd_date} <br> 작성자 : ${content.reg_email}
				</td>
			</tr>
			<tr>
				<td colspan="3">${content.desc}</td>
			</tr>
		</tbody>
	</table>
	<br></br>
	<br></br>
	<br></br>

	<form class="form-horizontal" method="post"
		action="openContentDetail.do" id="contentDetail">
		<input type="hidden" name="idx" id="idx" value="" />
	</form>
	<br>
	<br>
	<hr>
	<br></br>
	<a href="modifyContentView.do?idx=${content.idx}" class="btn"
		id="modify"><span>&nbsp;&nbsp;&nbsp;Modify(수정)&nbsp;&nbsp;&nbsp;</span></a>
	<!-- <a href="modifyContentView.do?idx=${content.idx}" class="btn" id="modify">수정하기</a>-->
	<a href="deleteContent.do?idx=${content.idx}" class="btn" id="delete"><span>&nbsp;&nbsp;&nbsp;Delete(삭제)&nbsp;&nbsp;&nbsp;</span></a>
	<!-- <a href="deleteContent.do?idx=${content.idx}" class="btn" id="delete">삭제하기</a> -->
</body>
</html>