<%@ page import="com.team2.database.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
	<title>Team 2 : Wiki Project</title>
</head>

<body>
	<jsp:include page="header.jsp" flush="true" />
	
	<form id="writeform" name="writeform" method="post" action="registerContent.do">

		<div id="registerSection">
		<table class="board_view">
			<colgroup>
				<col width="15%">
				<col width="*" />
			</colgroup>
			<tbody>
				<tr>
					<th scope="row">제목</th>
					<td><input id="title" name="title" maxlength="100" required="required" style="width:600px" type="text" class="wdp_90"></input></td>
				</tr>
				<tr>
					<td colspan="2" class="view_text"><textarea rows="15"
							cols="100" title="내용" id="desc" name="desc" required="required"></textarea>
					</td>
				</tr>
				<tr>
				<td colspan="2"><input type="file" name="file" id="file" style="width:400px"></td>
				</tr>
				<tr><td colspan="2">
				<input type="submit" id="registerSubmit" class="submit" value="Write(작성)" />
				<a href="/wiki/contentsListView.do" class="btn" id="list"><span>&nbsp;&nbsp;&nbsp;List(목록)&nbsp;&nbsp;&nbsp;</span></a>
				</td></tr>
			</tbody>
		</table>
		</div>
	</form>

</body>

</html>
