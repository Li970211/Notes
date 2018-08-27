package com.lijia.spring.dao;

import java.util.List;

import com.lijia.bean.Student;

public interface StudentDao {
	void insertStudent(Student student);
	void deleteById(int id);
	void updateStudent(Student student);
	
	List<String> selectAllStudentsNames();
	String selectStudentNameById(int id);
	
	List<Student> selectAllStudents();
	Student selectStudentById(int id);
}
