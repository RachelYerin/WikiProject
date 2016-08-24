<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DB Test : Result</title>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Wiki Project" />
<meta name="author" content="Codrops" />
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css" href="resources/css/demo.css" />
<link rel="stylesheet" type="text/css" href="resources/css/style10.css" />
<link href='http://fonts.googleapis.com/css?family=Terminal+Dosis' rel='stylesheet' type='text/css' />
<link href='resources/css/design.css' rel='stylesheet' type='text/css' />
<script type="text/javascript" src="resources/js/jquery-1.10.2.min.js"></script>
<style type="text/css">
	.failed {
		color: red;
		font-style: bold;
		font-size:18pt;
	}
</style>

</head>
<body>
<jsp:include page="header.jsp" flush="true"/>
<c:choose>
		<c:when test="${imageFile != null }">
		파일 업로드 완료
		<ul>
			<li>파일 ID : ${imageFile.id }</li>
			<li>저장된 파일 이름 : ${imageFile.fileName }</li>
			<li>파일 길이 : ${imageFile.contentLength }</li>
			<li>MIME 타입 : ${imageFile.contentType }</li>
		</ul>
		
		<img src="${pageContext.request.contextPath}/image/${imageFile.id}">
		</c:when>
		<c:otherwise>
		<span class="failed">파일 업로드 실패</span>		
		</c:otherwise>
	</c:choose>
 </body>
</html>