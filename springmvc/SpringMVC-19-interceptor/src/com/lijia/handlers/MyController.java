package com.lijia.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lijia")
public class MyController{

	@RequestMapping("/some.do")
	public String doFirst() {
		System.out.println("执行处理器的方法");
		return "/WEB-INF/jsp/welcome.jsp";
	}
	
	
	
	
	
}