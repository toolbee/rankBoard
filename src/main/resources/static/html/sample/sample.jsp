<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>오늘 날짜와 시각 출력하기</title>
</head>
<body>
<%
	Date date = new Date();
	out.println(date);
	
%>
</body>
</html>