<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
List<String> flowerList = (List<String>)request.getAttribute("flowerList");

for(int i = 0; i < flowerList.size(); i++) {
	out.println(flowerList.get(i) + "<br>");
}
%>
</body>
</html>