package com.lijia.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{

	@RequestMapping("/register")
	public ModelAndView doFirst(@RequestParam("pname") String name,int age) {
		System.out.println(name);
		System.out.println(age);
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",name);
		mv.addObject("age",age);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	
	
	
	
}