<%@ page import="com.team2.database.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
<title>Team 2 : Wiki Project</title>
</head>

<body>
	<jsp:include page="header.jsp" flush="true" />
	<form id="ModifyForm" name="modifyform" method="post" action="updateContent.do">
		<table class="board_view">
			<colgroup>
				<col width="10%"/>
				<col width="90%"/>
			</colgroup>
			<tbody>
				<tr>
					<td style="text-align:center">제목</td>
					<td>
					<input id="title" name="title" maxlength="100" required="required" type="text" class="wdp_90" style="width:600px" value="${content.title}"></input>
					</td>
				</tr>
				<tr>
					<td colspan="2" class="view_text">
					<textarea rows="20"	cols="100" title="내용" id="desc" name="desc" required="required">${content.desc}</textarea>
					</td>
				</tr>
				<tr><td colspan="2">
				<input type="hidden" id="idx" name="idx" value="${content.idx}"></input>
				<input class="btn" type="submit" value="Modify(수정)"/>
				<a href="/wiki/contentsListView.do" class="btn" id="list"><span>&nbsp;&nbsp;&nbsp;List(목록)&nbsp;&nbsp;&nbsp;</span></a>
				</td>
				</tr>
			</tbody>
		</table>
	
	</form>
</body>

</html>
