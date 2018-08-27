package com.lijia.aop07;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
	
	@Test
	public void test01() {
		// 创建容器对象，加载Spring配置文件
		String resource = "com/bjpowernode/aop07/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		SomeService service = (SomeService) ac.getBean("serviceProxy");
		service.doFirst();
		System.out.println("==================");
		String result = service.doSecond();
		System.out.println(result);
	}
	
}



















