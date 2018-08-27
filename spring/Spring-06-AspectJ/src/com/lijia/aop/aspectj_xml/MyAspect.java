package com.lijia.aop.aspectj_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;

import org.aspectj.lang.annotation.Before;


 //切面
public class MyAspect {

	public void before(){
		System.out.println("执行前置通知方法");
	}
	
	public void before(JoinPoint jp){
		System.out.println("执行前置通知方法jp="+jp);
	}
	
	public void afterReturning(){
		System.out.println("执行后置通知方法");
	}
	
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("执行环绕通知之前");
		Object proceed = pjp.proceed();
		System.out.println("执行环绕通知之后");
		return proceed;
		
	}
	
	public void afterThrowing(Throwable e){
		System.out.println("异常通知 "+e.getMessage());
	}

	
	public void after(){
		System.out.println("最终通知方法执行");
	}
}
