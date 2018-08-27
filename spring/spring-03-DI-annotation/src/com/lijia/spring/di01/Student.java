package com.lijia.spring.di01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
	@Value("李嘉")
	private String name;
	@Value("21")
	private int age;
	@Autowired    //byType方式的注解注入，其可单独使用
	@Qualifier("mySchool")  //byName方式的注解注入，要求@Qualifier和@Autowired联合使用
	private School school;
	
	public void setSchool(School school) {
		this.school = school;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school
				+ "]";
	}
	
	
}
