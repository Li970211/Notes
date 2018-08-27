package com.lijia.execption;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		ModelAndView mv = new ModelAndView();
		//将异常对象加入数据模型中
		mv.addObject("ex", ex);
		//设置默认错误响应页面
		mv.setViewName("/errors/error.jsp");
		//设置相关响应的页面
		if(ex instanceof NameException){
			mv.setViewName("/errors/nameError.jsp");
		}
		if(ex instanceof AgeException){
			mv.setViewName("/errors/ageError.jsp");
		}
		return mv;
	}

	

}
