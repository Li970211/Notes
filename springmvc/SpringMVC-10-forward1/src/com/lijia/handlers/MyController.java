package com.lijia.handlers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lijia.beans.Student;

@Controller  //表示当前类是一个处理类
@RequestMapping("/lijia") //命名空间
public class MyController{

	/*请求转发
	@RequestMapping(value="/register")
	public ModelAndView doFirst(Student student) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("student",student);
		//mv.setViewName("forward:/WEB-INF/jsp/welcome.jsp");
		mv.setViewName("forward:third.do");
		return mv;
	}
	
	@RequestMapping("/third.do")
	public ModelAndView  doThird(Student student){
		System.out.println(student);
		return new ModelAndView("forward:/WEB-INF/jsp/welcome.jsp");
	}
	*/
	/*重定向
	@RequestMapping(value="/register")
	public ModelAndView doFirst(Student student) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", student.getName());
		mv.addObject("age", student.getAge());
		mv.setViewName("redirect:/redirect.jsp");
		return mv;
	}
	*/
	/*
	@RequestMapping(value="/register")
	public ModelAndView doFirst(Student student,HttpSession session) {
		session.setAttribute("myStudent", student);
		return new ModelAndView("redirect:/redirect.jsp");
	}
	*/
	/*
	@RequestMapping(value="/register")
	public ModelAndView doFirst(Student student) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", student.getName());
		mv.addObject("age", student.getAge());
		mv.setViewName("redirect:third.do");
		return mv;
	}
	逐个传参数
	@RequestMapping("/third.do")
	public ModelAndView  doThird(String name,int age){
		ModelAndView mv = new ModelAndView();
		mv.addObject("studnet", new Student(name,age));
		return new ModelAndView("forward:/WEB-INF/jsp/welcome.jsp");
	}
	//整体传参数
	@RequestMapping("/third.do")
	public ModelAndView  doThird(Student student){
		ModelAndView mv = new ModelAndView();
		mv.addObject("studnet", student);
		mv.setViewName("forward:/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	*/
	/*
	@RequestMapping(value="/register")
	public ModelAndView doFirst(Student student,HttpSession session) {
		session.setAttribute("myStudent", student);
		return new ModelAndView("redirect:third.do");
	}
	@RequestMapping("/third.do")
	public ModelAndView  doThird(HttpSession session){
		Student studnet = (Student) session.getAttribute("myStudent");
		System.out.println("这里可以适使用studnet的数据:"+studnet);
		return new ModelAndView("forward:/WEB-INF/jsp/welcome.jsp");
	}*/
	
	/*
	@RequestMapping(value="/register")
	public String doFirst(Student student) {
		return "forward:/WEB-INF/jsp/welcome.jsp";
	}
	*/
	
	/*@RequestMapping(value="/register")
	public String doFirst(Student student,Model model) {
		model.addAttribute("pname",student.getName());
		model.addAttribute("page",student.getAge());
		return "redirect:/redirect.jsp";
	}*/
	
	@RequestMapping(value="/register")
	public String doFirst(Student student,RedirectAttributes ra) {
		ra.addAttribute("pname",student.getName());
		ra.addAttribute("page",student.getAge());
		return "redirect:/redirect.jsp";
	}
	
}