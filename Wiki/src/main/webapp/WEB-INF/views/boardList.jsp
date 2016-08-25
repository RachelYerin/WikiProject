<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Team 2 : Wiki Project</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<link rel="stylesheet" type="text/css" href="resources/css/yeonheestyle.css" />
</head>
<body>
	<jsp:include page="header.jsp" flush="true" />
	<h1>게시판 목록</h1>
	<br><br>
	<table style="border: 1px solid #ccc">
		<colgroup>
			<col width="10%" />
			<col width="*" />
			<col width="15%" />
			<col width="20%" />
		</colgroup>
		<thead>
			<tr>
				<th scope="col">글번호</th>
				<th scope="col">제목</th>
				<th scope="col">첨부파일이름</th>
				<th scope="col">등록자EMAIL</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${fn:length(list) > 0}">
					<c:forEach items="${list}" var="contents">
						<tr>
							<td>${contents.idx }</td>
							<td><a href="openContentDetail.do?idx=${contents.idx}">${contents.title}</a></td>
							<td>${contents.filename }</td>
							<td>${contents.reg_email }</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan="4">조회된 결과가 없습니다.</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>

	<form class="form-horizontal" method="post"
		action="openContentDetail.do" id="contentDetail">
		<input type="hidden" name="idx" id="idx" value="" />
	</form>

	<br></br>
	<a href="/wiki/openContentWrite.do" class="btn" id="write"><span>&nbsp;&nbsp;&nbsp;Write&nbsp;&nbsp;&nbsp;</span></a>
	<!-- <a href="/wiki/openContentWrite.do" class="btn" id="write"><button>Write</button></a> -->
</body>
</html>
