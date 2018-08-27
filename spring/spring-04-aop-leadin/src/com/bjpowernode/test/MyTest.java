package com.bjpowernode.test;

import com.bjpowernode.service.ISomeService;
import com.bjpowernode.service.SomeServiceImpl;

public class MyTest {

	public static void main(String[] args) {
		ISomeService service = new SomeServiceImpl();
		service.doFirst();
		System.out.println("==============");
		service.doSecond();
	}

}
