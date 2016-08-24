<%@ page import="com.team2.database.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
	<title>Team 2 : Wiki Project</title>
</head>

<body>
	<jsp:include page="index.jsp" flush="true" />
	<form id="writeform" name="writeform" method="post"
		action="registerContent.do">
		<h1 id="title">게시글 작성</h1>
		<br>
		<br>
		<table class="board_view">
			<colgroup>
				<col width="15%">
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th scope="row">제목</th>
					<td><input id="title" name="title" maxlength="100"
						required="required" type="text" class="wdp_90"></input></td>
				</tr>
				<tr>
					<td colspan="2" class="view_text"><textarea rows="15"
							cols="100" title="내용" id="desc" name="desc" required="required"></textarea>
					</td>
				</tr>
			</tbody>
		</table>
		<input type="file" name="file" id="file"> <br />
		<br /> <input type="submit" class="submit" value="Write" /> <a
			href="/wiki/contentsListView.do" class="btn" id="list"><span>&nbsp;&nbsp;&nbsp;List&nbsp;&nbsp;&nbsp;</span></a>

	</form>

</body>

</html>
