<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
   <%---- (Expression language is an easier way to get a value instead of lengthy Java code inside Scriptlets)
     String name = request.getAttribute("label").toString();
	 out.println(name); 
   --%>
   ${label}
</body>
</html>