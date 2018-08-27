package com.lijia.test;

import org.junit.Before;
import org.junit.Test;

import com.lijia.beans.Student;
import com.lijia.dao.IStudentDao;
import com.lijia.dao.StudentDaoImpl;

public class MyTest {
	
	private IStudentDao dao;
	
	@Before
	public void before(){
		dao = new StudentDaoImpl();
	}
	
	@Test
	public void testInsert(){
		Student student = new Student("张三", 29, 96.5);
		dao.insertStu(student);
	}
}
