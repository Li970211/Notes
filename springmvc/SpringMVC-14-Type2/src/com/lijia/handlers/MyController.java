package com.lijia.handlers;

import java.util.Date;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	/**
	 * 由于用户输错信息的话，我们需要进行处理，让其回到原始页面
	 * 就是要在异常前进行处理，但是我们之前学的三种处理异常方法，只能用
	 * 注解异常处理的方法，因为另外两种都是处理处理器方法在执行过程的异常，
	 * 而输错的信息是在方法进来之前类型错误就报错了。
	 */
	//写法1
/*	@ExceptionHandler(TypeMismatchException.class)
	public String exceptionResovler(Exception ex){
		return "/index.jsp";
	}*/
	
	//写法2
	@ExceptionHandler(TypeMismatchException.class)
	public ModelAndView exceptionResovler(Exception ex){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/index.jsp");
		return mv;
	}
	/**
	 * 但是如果日期格式输错误，这里就不可能用@ExceptionHandler(ParseException.class)
	 * 因为MyDateConverter中日期哪里的异常我们是捕获的，不会抛出去，外界不知道，直接内部处理了。
	 * 因为我们不能convert()里面抛异常，所以我们在判断输入日期类型的时候。如果都没有匹配到就抛出异常，
	 * 这样就可以用上面的方法捕获到
	 */
	
	
}