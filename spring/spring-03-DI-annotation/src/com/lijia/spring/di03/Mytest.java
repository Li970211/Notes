package com.lijia.spring.di03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:com/lijia/spring/di03/applicationContext.xml")//要指定在类路径下，加classpath，不然默认是在工程目录下
public class Mytest {
	
	@Autowired
	private Student student;
	
	@Test
	public void test1(){
		System.out.println(student);
	}
}
