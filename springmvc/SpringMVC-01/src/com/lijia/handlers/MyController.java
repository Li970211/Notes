package com.lijia.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		//其底层执行的是request.setAttribute()方法
		mv.addObject("message","Hello SpringMVC World" );
		//mv.setViewName("/WEB-INF/jsp/welcome.jsp");在配置里面配置了视图解析器就可以按照下面这种写法
		mv.setViewName("welcome");//welcome叫逻辑视图名
		return mv;
	}


}
/**
 * 在web-inf目录下放的资源是不能通过浏览器直接访问的，比较安全，重定向不能到web-inf下
 * 
 */
