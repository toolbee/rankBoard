<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ��¥�� �ð� ����ϱ�</title>
</head>
<body>
<%
	Date date = new Date();
	out.println(date);
	
%>
<br><br>
<!-- <form action="TestServlet" method="post">
	<input type="radio" name="gender" value="����">����
	<input type="radio" name="gender" value="����">����
	<br>
	<input type="text" name="phone" size=20>
	<br><br>
	<input type="submit" value="Ȯ��">

</form> -->

</body>
</html>