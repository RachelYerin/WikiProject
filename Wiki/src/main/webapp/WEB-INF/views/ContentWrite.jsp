<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Team 2 : Wiki Project</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<link rel="stylesheet" type="text/css" href="<c:url value='/css/ui.css'/>" />
<script src="<c:url value='/js/common.js'/>" charset="utf-8"></script>

</head>
<body>
    <form id="frm" >
        <table class="board_view">
            <colgroup>
                <col width="15%">
                <col width="*"/>
            </colgroup>
            <caption>게시글 작성</caption>
            <tbody>
                <tr>
                    <th scope="row">제목</th>
                    <td><input type="text" id="TITLE" name="TITLE" class="wdp_90"></input></td>
                </tr>
                <tr>
                    <td colspan="2" class="view_text">
                        <textarea rows="20" cols="100" title="내용" id="CONTENTS" name="CONTENTS"></textarea>
                    </td>
                </tr>
            </tbody>
        </table>
        
        <!-- <div class="form-group" align="center"> 
			<button type="button" class="btn btn-test btn-lg" style="margin:30px 5px 0 0; font-weight:bold;" id="btnWrite" >
			<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>&nbsp;&nbsp;작성</button>
			<button type="button" class="btn btn-test btn-lg" style="margin:30px 0 0 5px; font-weight:bold;" id="btnList">
			<span class="glyphicon glyphicon-th-list" aria-hidden="true"></span>&nbsp;&nbsp;목록</button>
		</div>
		<script type="text/javascript">
		$("#btnWrite").click(function(){
			document.frm.action = "viewContents.do";
			document.frm.submit();
        });
		
		$("#btnList").click(function(){
			var urlParam = "viewContents.do";
			window.location = urlParam;
        });
   		</script>	 -->	
				
        <form class="form-horizontal" method="post" action="viewContents.do" >
        	<input type="submit" value="작성하기" />
        	
        </form>
        <form class="form-horizontal" method="post" action="viewContents.do" >
        	<button type="button" class="btn" id="list" >목록으로</button>
        </form>

    </form>

</body>

</html>
