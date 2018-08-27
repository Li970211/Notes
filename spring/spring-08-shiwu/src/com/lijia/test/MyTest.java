package com.lijia.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lijia.service.BuyStockException;
import com.lijia.service.IBuyStockService;


public class MyTest {
	
	private IBuyStockService service;

	@Before
	public void before() {
		// 创建容器对象，加载Spring配置文件
		String resource = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		service = (IBuyStockService) ac.getBean("serviceProxy");
	}
	
	@Test
	public void test01() {
		service.openAccount("李嘉", 10000);
		service.openStock("北京", 0);
	}
	
	@Test
	public void test02() throws BuyStockException {
		service.buyStock("李嘉", 2000, "北京", 5);
	}
}



















