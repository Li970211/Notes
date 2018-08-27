package com.lijia.spring.di06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//域属性自动注入
public class Mytest {
	@Test
	public void test1(){
		String resource = "com/lijia/spring/di06/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		Student student = (Student)ac.getBean("myStudent");
		System.out.println(student);
	}
}
//org.springframework.beans.factory.UnsatisfiedDependencyException:
//bean but found 2: mySchool,myPrimarySchool;


