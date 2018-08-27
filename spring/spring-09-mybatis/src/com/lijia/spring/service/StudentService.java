package com.lijia.spring.service;

import java.util.List;

import com.lijia.spring.beans.Student;

public interface StudentService {
	void addStudent(Student student);
	void removeById(int id);
	void modifyStudent(Student student);
	
	List<String> findAllStudentsNames();
	String findStudentNameById(int id);
	
	List<Student> findAllStudents();
	Student findStudentById(int id);
}
