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
<br><br>
<!-- <form action="TestServlet" method="post">
	<input type="radio" name="gender" value="남자">남자
	<input type="radio" name="gender" value="여자">여자
	<br>
	<input type="text" name="phone" size=20>
	<br><br>
	<input type="submit" value="확인">

</form> -->

</body>
</html>