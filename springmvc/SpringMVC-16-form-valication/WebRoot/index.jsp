<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/lijia/register.do" method="post">
    	姓名：<input type="text" name="name"/>${nameError }<br>
    	 分数:<input type="text" name="score"/>${scoreError }<br>
    	 电话：<input type="text" name="moblie">${moblieError }<br>
    	<input type="submit" value="提交"/>
    </form>
  </body>
</html>
