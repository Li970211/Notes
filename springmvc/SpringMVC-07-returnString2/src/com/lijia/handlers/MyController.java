package com.lijia.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{

	@RequestMapping("/some.do")
	public String doSome() {
		//逻辑视图
		return "welcome";
	}
	
	
	
	
}