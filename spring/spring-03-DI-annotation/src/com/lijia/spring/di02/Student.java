package com.lijia.spring.di02;

import javax.annotation.Resource;

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
//	@Resource(name="mySchool")//byName方法的注解注入
	@Resource//byType方法的注解注入
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
