<%@ page import="com.team2.database.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
	<title>Team 2 : Wiki Project</title>
</head>

<body>
<jsp:include page="header.jsp" flush="true"/>
    <form id="ModifyForm" name="modifyform" method="post" action="updateContent.do" >
        <table class="board_view">
            <colgroup>
                <col width="15%">
                <col width="*"/>
            </colgroup>
            <caption>게시글 수정</caption>
            <tbody>
                <tr>
                    <th scope="row">제목</th>
                    <td>
                    <input id="title" name="title" maxlength="100" required="required" type="text" class="wdp_90" value="${content.title}"></input></td>
                </tr>
                <tr>
                    <td colspan="2" class="view_text">
                        <textarea rows="20" cols="100" title="내용" id="desc" name="desc" required="required" >${content.desc}</textarea>
                    </td>
                </tr>
            </tbody>
        </table>  
        <input type="hidden" id="idx" name="idx" value="${content.idx}"></input>
		<input class="submit" type="submit" value="Modify" />
        <a href="/wiki/contentsListView.do" class="btn" id="list" >List</a>

</form>

</body>

</html>
