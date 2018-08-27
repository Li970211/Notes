package com.lijia.execption;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyExceptionResolver{
	//NameException异常处理
	@ExceptionHandler(NameException.class)
	public ModelAndView handleNameExpection(Exception ex){
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex", ex);
		mv.setViewName("/errors/nameError.jsp");
		return mv;
	}
	@ExceptionHandler(AgeException.class)
	public ModelAndView handleAgeExpection(Exception ex){
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex", ex);
		mv.setViewName("/errors/ageError.jsp");
		return mv;
	}
	//其他异常处理
	@ExceptionHandler
	public ModelAndView handleOtherExpection(Exception ex){
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex", ex);
		mv.setViewName("/errors/error.jsp");
		return mv;
	}
}
