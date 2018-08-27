package com.lijia.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.lijia.bean.Student;
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
		List<String> names = new ArrayList<>();
		List<Student> students = this.findAllStudents();
		for (Student student : students) {
			names.add(student.getName());
		}
		return names;
	}

	@Override
	public String findStudentNameById(int id) {
		Student student = this.findStudentById(id);
		return student.getName();
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
