<%@ page import="org.apache.tomcat.util.threads.TaskThread" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%
    String s = "sss";
    Object o = Thread.currentThread();
    System.out.println(o);
    System.out.println(s);

%>
</body>
</html>