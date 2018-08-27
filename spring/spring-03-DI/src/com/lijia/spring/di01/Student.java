package com.lijia.spring.di01;

/**
 * @author 李嘉
 *
 * @date 2018年7月21日
 */
public class Student {
	private String name;
	private int age;
	private School school;//
	
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
