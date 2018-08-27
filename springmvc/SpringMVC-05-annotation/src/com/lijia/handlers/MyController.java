package com.lijia.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{

	@RequestMapping(value={"/my.do","/hello.do"},method=RequestMethod.POST)
	public ModelAndView doFirst(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		//其底层执行的是request.setAttribute()方法
		mv.addObject("message","Hello SpringMVC World doFirst" );
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	@RequestMapping("/second.do")
	public ModelAndView doSecond(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		//其底层执行的是request.setAttribute()方法
		mv.addObject("message","Hello SpringMVC World doSecond" );
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	//资源名称必须以third开头
	@RequestMapping("/third*.do")
	public ModelAndView doThird(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		//其底层执行的是request.setAttribute()方法
		mv.addObject("message","Hello SpringMVC World doThird" );
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	//资源名称必须以four结尾
	@RequestMapping("/*four.do") 
	public ModelAndView doFourth(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		//其底层执行的是request.setAttribute()方法
		mv.addObject("message","Hello SpringMVC World doFourth" );
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	//路径级数的绝对匹配，即要求在test与fifth.do之间必须要有一级路径
	@RequestMapping("/*/fifth.do") 
	public ModelAndView doFifth(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		//其底层执行的是request.setAttribute()方法
		mv.addObject("message","Hello SpringMVC World doFifth" );
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	//要求在test与sixth.do之间可以包含多级路径，也可以没有其他路径
	@RequestMapping("/**/sixth.do") 
	public ModelAndView doSixth(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		//其底层执行的是request.setAttribute()方法
		mv.addObject("message","Hello SpringMVC World doSixth" );
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
}