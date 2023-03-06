<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>
    Hello world!
</h1>

<p>  The time on the server is ${serverTime}. </p>
<h3>home.jsp</h3>
<ul>
    <li><a href="saram/list">목록</a></li>
    <li><a href="saram/insert">입력</a></li>
    <li><a href="saram/detail">상세보기</a></li>
    <li><a href="saram/modify">수정</a></li>
    <li><a href="saram/delete">삭제</a></li>
</ul>
</body>
</html>