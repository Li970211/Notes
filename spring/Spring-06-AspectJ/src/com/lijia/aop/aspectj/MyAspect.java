package com.lijia.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.experimental.categories.Categories.ExcludeCategory;

@Aspect //表示当前类为切面
public class MyAspect {

	@Before("execution(* *..ISomeService.doFirst(..))")
	public void before(){
		System.out.println("执行前置通知方法");
	}
	
	@Before("execution(* *..ISomeService.doFirst(..))")
	public void before(JoinPoint jp){
		System.out.println("执行前置通知方法jp="+jp);
	}
	
	@AfterReturning("execution(* *..ISomeService.doFirst(..))")
	public void afterReturning(){
		System.out.println("执行后置通知方法");
	}
	
	@Around("execution(* *..ISomeService.doThird(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("执行环绕通知之前");
		Object proceed = pjp.proceed();
		System.out.println("执行环绕通知之后");
		return proceed;
		
	}
	
	@AfterThrowing(value="execution(* *..ISomeService.doSecond(..))",throwing="e")
	public void afterThrowing(Throwable e){
		System.out.println("异常通知 "+e.getMessage());
	}
	//对有doSecond()如果是有异常，控制台先打印最终通知的输出，在打印异常通知的打印就信息
	@After("execution(* *..ISomeService.doSecond(..))")
	public void after(){
		System.out.println("最终通知方法执行");
	}
}
