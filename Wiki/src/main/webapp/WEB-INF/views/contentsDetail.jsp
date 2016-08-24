<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Team 2 : Wiki Project</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
</head>
<body>
<jsp:include page="index.jsp" flush="true"/>
<h1 id="title">게시글 상세</h1> <br></br>
    <table class="board_view" border="1" width="70%">
        <colgroup>
            <col width="15%"/>
            <col width="35%"/>
            <col width="15%"/>
            <col width="35%"/>
        </colgroup>
        <tbody>
            <tr>
                <th scope="row">글 번호</th>
                <td>${content.idx}</td>
                <th scope="row">등록일</th>
                <td>${content.reg_date}</td>
            </tr>
            <tr>
                <th scope="row">작성자</th>
                <td>${content.reg_email}</td>
                <th scope="row">수정일</th>
                <td>${content.upd_date}</td>
            </tr>
            <tr>
                <th scope="row">제목</th>
                <td colspan="3">${content.title}</td>
            </tr>
            <tr>
                <td colspan="4">${content.desc}</td>
            </tr>
        </tbody>
    </table>
    <br></br><br></br><br></br>
    <div>
    <a href="/wiki/contentsListView.do" class="btn" id="list"><span>&nbsp;&nbsp;&nbsp;List(목록)&nbsp;&nbsp;&nbsp;</span></a>
    <!-- <a href="/wiki/contentsListView.do" class="btn" id="list">목록으로</a> -->
    <a href="modifyContentView.do?idx=${content.idx}" class="btn" id="modify"><span>&nbsp;&nbsp;&nbsp;Modify(수정)&nbsp;&nbsp;&nbsp;</span></a>
    <!-- <a href="modifyContentView.do?idx=${content.idx}" class="btn" id="modify">수정하기</a>-->
    <a href="deleteContent.do?idx=${content.idx}" class="btn" id="delete"><span>&nbsp;&nbsp;&nbsp;Delete(삭제)&nbsp;&nbsp;&nbsp;</span></a>
    <!-- <a href="deleteContent.do?idx=${content.idx}" class="btn" id="delete">삭제하기</a> -->
	</div>
    </body>
</html>
