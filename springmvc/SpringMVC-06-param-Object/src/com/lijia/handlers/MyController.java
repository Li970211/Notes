package com.lijia.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lijia.beans.Student;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{

	@RequestMapping("/register")
	public ModelAndView doFirst(Student student) {
		//整体接收时，要求表单参数名与对象属性名相同
		System.out.println(student.getName());
		System.out.println(student.getAge());
		ModelAndView mv = new ModelAndView();
		mv.addObject("student",student);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	
	
	
}