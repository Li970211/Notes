package com.lijia.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lijia.bean.Student;
import com.lijia.spring.service.StudentService;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String agesString = request.getParameter("age");
		Integer age = Integer.valueOf(agesString);
		//int age = Integer.parseInt(agesString);
		String scores = request.getParameter("score");
		double score = Double.parseDouble(scores);
		Student student = new Student(name, age, score);
		
		//获取Spring容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(ac);//这样每次刷新都会创建一个容器，浪费资源
		//从Spring容器对象获取Service对象
		StudentService service = (StudentService) ac.getBean("myStudentService");
		
		//调用service的addStudent方法完成插入
		service.addStudent(student);
		request.getRequestDispatcher("/welcome.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
