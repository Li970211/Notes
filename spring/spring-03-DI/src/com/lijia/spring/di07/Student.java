package com.lijia.spring.di07;

/**
 * @author 李嘉
 *
 * @date 2018年7月21日
 */
public class Student {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}




	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age+ "]";
	}
	
	
}
