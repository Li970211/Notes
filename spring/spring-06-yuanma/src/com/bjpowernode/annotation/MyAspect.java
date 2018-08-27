package com.bjpowernode.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect    // 表示当前类为切面
public class MyAspect {
	
	@Before("execution(* *..ISomeService.doFirst(..))")
	public void myBefore() {
		System.out.println("执行前置通知方法");
	}
	
	@Before("execution(* *..ISomeService.doFirst(..))")
	public void myBefore(JoinPoint jp) {
		System.out.println("执行前置通知方法 jp = " + jp);
	}
	
	@AfterReturning("execution(* *..ISomeService.doSecond(..))")
	public void myAfterReturning() {
		System.out.println("执行后置通知方法");
	}
	
	@AfterReturning(value="execution(* *..ISomeService.doSecond(..))", returning="result")
	public void myAfterReturning(Object result) {
		System.out.println("执行后置通知方法  result = " + result);
	}
	
	@Around("execution(* *..ISomeService.doSecond(..))")
	public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("执行环绕通知方法，目标方法执行之前");
		// 执行目标方法
		Object result = pjp.proceed();
		System.out.println("执行环绕通知方法，目标方法执行之后");
		if(result != null) {
			result = ((String)result).toUpperCase();
		}
		return result;
	}
	
	@AfterThrowing("execution(* *..ISomeService.doThird(..))")
	public void myAfterThrowing() {
		System.out.println("执行异常通知方法");
	}
	
	@AfterThrowing(value="doThirdPointcut()", throwing="ex")
	public void myAfterThrowing(Exception ex) {
		System.out.println("执行异常通知方法 ex = " + ex.getMessage());
	}
	
	@After("doThirdPointcut()")
	public void myAfter() {
		System.out.println("执行最终通知方法");
	}
	
	// 定义了一个切入点，叫 doThirdPointcut()
	@Pointcut("execution(* *..ISomeService.doThird(..))")
	public void doThirdPointcut(){}
}




























