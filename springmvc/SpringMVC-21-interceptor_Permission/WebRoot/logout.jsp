<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'logout.jsp' starting page</title>
  </head>
  
  <body>
    <%
    	session.removeAttribute("user");
    %>
    退出
  </body>
</html>
