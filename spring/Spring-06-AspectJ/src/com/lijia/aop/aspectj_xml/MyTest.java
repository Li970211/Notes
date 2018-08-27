package com.lijia.aop.aspectj_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test01(){
		//创建容器对象，加载Spring配置文件
		String resource = "com/lijia/aop/aspectj_xml/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService)ac.getBean("myService");
		service.doFirst();
		System.out.println("---------------------");
		System.out.println(service.doSecond());
		System.out.println("---------------------");
		service.doThird();
	}
}
