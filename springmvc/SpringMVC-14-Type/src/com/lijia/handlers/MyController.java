package com.lijia.handlers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{

	@RequestMapping("/register")
	public ModelAndView doFirst(int age,Date birthday) {

		System.out.println(age);
		ModelAndView mv = new ModelAndView();
		mv.addObject("age",age);
		mv.addObject("birthday",birthday);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	
	
	
	
}