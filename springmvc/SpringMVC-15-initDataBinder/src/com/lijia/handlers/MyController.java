package com.lijia.handlers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{

	@RequestMapping("/register")
	public ModelAndView doFirst(int age,Date birthday) {
		System.out.println(birthday);
		System.out.println(age);
		ModelAndView mv = new ModelAndView();
		mv.addObject("age",age);
		mv.addObject("birthday",birthday);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	//初始化参数的绑定：一种日期格式
	@InitBinder//在上面数据传入的时候首先要执行这里
	public void initBinder(WebDataBinder binder){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(df, true));
	}
}