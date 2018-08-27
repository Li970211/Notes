package com.lijia.handlers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lijia")
public class MyController{

	@RequestMapping("/some.do")
	public String doFirst() {
	
		return "/welcome.jsp";
	}
	
	
	
	
	
}