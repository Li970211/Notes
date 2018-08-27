package com.lijia.spring.service;

import java.util.List;

import com.lijia.spring.beans.Student;
import com.lijia.spring.dao.StudentDao;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao dao;
	//提供set方法将dao注入
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public void addStudent(Student student) {
		dao.insertStudent(student);
	}

	@Override
	public void removeById(int id) {
		dao.deleteById(id);
	}

	@Override
	public void modifyStudent(Student student) {
		dao.updateStudent(student);
	}

	@Override
	public List<String> findAllStudentsNames() {
		return dao.selectAllStudentsNames();
	}

	@Override
	public String findStudentNameById(int id) {
		return dao.selectStudentNameById(id);
	}

	@Override
	public List<Student> findAllStudents() {
		return dao.selectAllStudents();
	}

	@Override
	public Student findStudentById(int id) {
		return dao.selectStudentById(id);
	}

}
