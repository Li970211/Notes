<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/lijia/upload.do" method="post" enctype="multipart/form-data">
    <!-- 注意这里的img不能加1，2，3 -->
    	文件1：<input type="file" name="imgs"/><br>
    	文件2：<input type="file" name="imgs"/><br>
    	文件3：<input type="file" name="imgs"/><br>
    	<input type="submit" value="上传"/>
    </form>
  </body>
</html>
