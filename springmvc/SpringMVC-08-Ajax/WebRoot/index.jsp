<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
  <script type="text/javascript">
  	$(function(){
  		$("button").click(function(){
  			$.ajax({
  				url:"lijia/Myajax.do",
  				data:{
  					name:"李嘉",
  					age:21
  				},
  				success:function(data){
  					console.log(data);//字符串
  					var json = eval("("+data+")");
  					console.log(json);//json数据
  				}
  			});
  		});
  		
  	});
  </script>
  <body>
    <button>提交Ajax请求</button>
  </body>
</html>
