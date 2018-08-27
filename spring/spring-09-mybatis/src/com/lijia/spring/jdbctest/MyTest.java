package com.lijia.spring.jdbctest;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lijia.spring.beans.Student;
import com.lijia.spring.service.StudentService;

public class MyTest {
	
	private StudentService service;

	@Before
	public void before(){
		//创建容器对象，加载Spring配置文件
		String resource = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		service = (StudentService)ac.getBean("myStudentService");
	}
	
	@Test
	public void test01(){
		Student student = new Student("王五2",23,90d);
		service.addStudent(student);
	}
	
	@Test
	public void test02(){
		service.removeById(17);
	}
	
	@Test
	public void test03(){
		Student student = new Student("高盼2", 21, 95d);
		student.setId(11);
		service.modifyStudent(student);
	}
	
	@Test
	public void test04(){
		List<String> names = service.findAllStudentsNames();
		System.out.println(names);
	}
	
	@Test
	public void test05(){
		String name = service.findStudentNameById(3);
		System.out.println(name);
	}
	
	@Test
	public void test06(){
		List<Student> students = service.findAllStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void test07(){
		Student student = service.findStudentById(1);
		System.out.println(student);
	}
}
