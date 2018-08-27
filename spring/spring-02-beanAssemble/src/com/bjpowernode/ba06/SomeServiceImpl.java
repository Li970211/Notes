package com.bjpowernode.ba06;

public class SomeServiceImpl implements ISomeService {
	
	public SomeServiceImpl() {
		System.out.println("执行无参构造器");
	}
	
	@Override
	public void doSome() {
		System.out.println("执行doSome()方法");
	}

	public void setUp() {
		System.out.println("生命起始");
	}
	
	public void tearDown() {
		System.out.println("销毁之前");
	}

}








