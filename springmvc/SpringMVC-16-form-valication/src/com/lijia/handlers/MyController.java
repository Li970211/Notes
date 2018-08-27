package com.lijia.handlers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lijia.beans.Student;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{
	/**
	 * @Validated注解不能放在String类型与基本类型的形参前。
	 * 紧跟着@Validated所注解的形参后面，是一个BindingResult类型的形参
	 * 通过形参可获取到所有验证异常信息
	 * @param student
	 * @return
	 */
	@RequestMapping("/register")
	public ModelAndView doFirst(@Validated Student student,BindingResult br) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", student);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		
		List<ObjectError> errors = br.getAllErrors();
		if(errors.size()>0){
			FieldError nameError = br.getFieldError("name");
			FieldError scoreError = br.getFieldError("score");
			FieldError moblieError = br.getFieldError("moblie");
			if(nameError != null){
				mv.addObject("nameError", nameError.getDefaultMessage());
			}
			if(scoreError != null){
				mv.addObject("scoreError", scoreError.getDefaultMessage());
			}
			if(nameError != null){
				mv.addObject("moblieError", moblieError.getDefaultMessage());
			}
			mv.setViewName("/index.jsp");
		}
		return mv;
	}
	
	
	
	
}