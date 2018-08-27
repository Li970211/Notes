package com.lijia.spring.di04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	@Test
	public void test1(){
		String resource = "com/lijia/spring/di04/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		Some some = (Some)ac.getBean("mySome");
		System.out.println(some);
	
	}
}
