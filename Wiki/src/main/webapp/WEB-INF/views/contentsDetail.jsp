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
            <col width="70%"/>
            <col width="15%"/>
            <col width="15%"/>
        </colgroup>
        <tbody>
            <tr>
            <td rowspan="3"><b><h1>${content.title}</h1></b></td>
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
                <td colspan="3" height="300px">${content.desc}</td>
            </tr>
        </tbody>
    </table>
    <table><tr><td>
            <a href="/wiki/contentsListView.do" class="btn" id="list"><span>&nbsp;&nbsp;&nbsp;List(목록)&nbsp;&nbsp;&nbsp;</span></a></td>
            <td>
    		<a href="modifyContentView.do?idx=${content.idx}" class="btn" id="modify"><span>&nbsp;&nbsp;&nbsp;Modify(수정)&nbsp;&nbsp;&nbsp;</span></a>
    		</td>
    		<td>
    		<a href="deleteContent.do?idx=${content.idx}" class="btn" id="delete"><span>&nbsp;&nbsp;&nbsp;Delete(삭제)&nbsp;&nbsp;&nbsp;</span></a>
            </td>
    </tr></table>
    </body>
</html>
