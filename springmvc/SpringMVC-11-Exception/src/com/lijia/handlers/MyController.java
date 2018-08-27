package com.lijia.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lijia.execption.AgeException;
import com.lijia.execption.NameException;
import com.lijia.execption.StudentException;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{

	@RequestMapping("/register")
	public ModelAndView doFirst(String name,int age) throws StudentException{
		System.out.println(name);
		if(!"李嘉".equals(name)){
			throw new NameException("姓名不正确");
		}
		if(age>25){
			throw new AgeException("年龄太大");
		}
		return new ModelAndView("/WEB-INF/jsp/welcome.jsp");
	}
	
	
	
	
	
}