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

</head>
<body>
<jsp:include page="header.jsp" flush="true"/>
 

<table>
     <tr>
         <td width="50px" align="center">id</td>
         <td align="center">name</td>
         <td align="center">email</td>
     </tr>
     <!-- result는 contoller의 addObject로 부터 가져온다. -->

     <c:forEach items="${result}" var="member">
         <tr>
             <td>${member.userid}</td>
             <td>${member.username}</td>
             <td>${member.email}</td>    
         </tr> 
     </c:forEach>
 </table>
 </body>
</html>