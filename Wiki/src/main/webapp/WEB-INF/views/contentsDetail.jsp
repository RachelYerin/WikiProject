<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Team 2 : Wiki Project</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
</head>
<body>
<jsp:include page="header.jsp" flush="true"/>
    <table class="board_view" border="1" width="70%">
        <colgroup>
            <col width="15%"/>
            <col width="35%"/>
            <col width="15%"/>
            <col width="35%"/>
        </colgroup>
        <tbody>
            <tr>
            <td rowspan="3">${content.title}</td>
            <td>등록일</td>
            <td>${content.reg_date}</td>
            </tr>
            <tr>
            <td>수정일</td>
            <td>${content.upd_date}</td>
            </tr>
            <tr>
            <td>작성자</td>
            <td>${content.reg_email}</td>
            </tr>
            <tr>
                <td colspan="3">${content.desc}</td>
            </tr>
        </tbody>
    </table>
    <br></br><br></br><br></br>
    <div>
    <a href="/wiki/contentsListView.do" class="btn" id="list"><span>&nbsp;&nbsp;&nbsp;List(목록)&nbsp;&nbsp;&nbsp;</span></a>
    <a href="modifyContentView.do?idx=${content.idx}" class="btn" id="modify"><span>&nbsp;&nbsp;&nbsp;Modify(수정)&nbsp;&nbsp;&nbsp;</span></a>
    <a href="deleteContent.do?idx=${content.idx}" class="btn" id="delete"><span>&nbsp;&nbsp;&nbsp;Delete(삭제)&nbsp;&nbsp;&nbsp;</span></a>

	</div>
    </body>
</html>
