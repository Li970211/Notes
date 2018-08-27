package com.lijia.handlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;



/**
public class MyController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		//其底层执行的是request.setAttribute()方法
		mv.addObject("message","Hello SpringMVC World" );
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}

}
*/


public class MyController extends MultiActionController {


	public  ModelAndView doFirst(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","执行dofirst方法" );
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	public  ModelAndView doSecond(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","执行doSecond方法" );
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}

}
