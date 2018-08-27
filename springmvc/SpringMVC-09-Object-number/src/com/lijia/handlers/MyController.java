package com.lijia.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{
	//返回number
	/**
	@RequestMapping("/Myajax.do")
	@ResponseBody //将返回的数据放入到响应体中
	public Object doObject(){
		return 123.56;
	}
	*/
	
	@RequestMapping(value="/Myajax.do",produces="text/html;charset=utf-8")
	@ResponseBody //将返回的数据放入到响应体中
	public Object doObject(){
		return "lijia李嘉";//返回中文会乱码
	}
	
	
}