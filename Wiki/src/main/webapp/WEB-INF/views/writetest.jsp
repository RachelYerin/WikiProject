<!-- 파일과 함께 올리기 테스트 구현 안됨 -->

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
    <form enctype="multipart/form-data" id="FileSendForm" name="FileSendForm" method="post" action="registerContentAndFile.do" >
        <table class="board_view">
            <colgroup>
                <col width="15%">
                <col width="*"/>
            </colgroup>
            <caption>게시글 작성</caption>
            <tbody>
                <tr>
                    <th scope="row">제목</th>
                    <td><input id="title" name="title" maxlength="100" required="required" type="text" class="wdp_90"></input></td>
                </tr>
                <tr>
                    <td colspan="2" class="view_text">
                        <textarea rows="20" cols="100" title="내용" id="desc" name="desc" required="required" ></textarea>
                    </td>
                </tr>
            </tbody>
        </table>
        <br/><br/>
        <input type="file" id="file" name="file">
        <br/><br/>
        <br/><br/>  
		<input class="submit" type="submit" value="Write" />
		<input class="button" type="button" value="List" href="/wiki/contentsListView.do" />
        <a href="/wiki/contentsListView.do" class="btn" id="list" >List</a>
       	
    </form>

</body>

</html>
