package com.lijia.spring.di05;

/**
 * @author 李嘉
 *
 * @date 2018年7月21日
 */
public class Student {
	private String name;
	private int age;
	private School school;//对象属性，域属性
	private Address address;
	
	
	
	public void setAddress(Address address) {
		this.address = address;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void setSchool(School school) {
		this.school = school;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school
				+ ", address=" + address + "]";
	}



	
	
	
}
