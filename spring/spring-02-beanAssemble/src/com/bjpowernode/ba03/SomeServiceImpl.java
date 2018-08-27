package com.bjpowernode.ba03;

public class SomeServiceImpl implements ISomeService {
	private int a;
	
	public SomeServiceImpl() {
		System.out.println("执行无参构造器");
	}
	
	/*
	public SomeServiceImpl(int a) {
		this.a = a;
	}
	*/
	
	@Override
	public void doSome() {
		System.out.println("执行doSome()方法");
	}


}
