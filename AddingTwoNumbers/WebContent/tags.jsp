<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
    <%!
     String s = "Declarative tag";
    %>
	<h1>Tags in JSP</h1>
	<%
	 out.println("Sciptlet tag");
	 %><br>
	<%
	 List<String> list = new ArrayList<>();
	 list.add("Using");
	 list.add("List");
	 list.add("from");
	 list.add("java.util");
	 list.add("imported");
	 list.add("by");
	 list.add("Directive tag");
	 for(String str : list){
		 out.println(str + " ");
	 }
	%><br>
	Printing a <%=s %> with an Expression tag
</body>
</html>