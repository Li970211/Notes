package com.lijia.spring.dao;

import java.util.List;

import javax.jws.soap.SOAPBinding.Style;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.lijia.spring.beans.Student;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {

	@Override
	public void insertStudent(Student student) {
		String sql = "insert into student(name,age,score) values(?,?,?)";
		this.getJdbcTemplate().update(sql, student.getName(),student.getAge(),student.getScore());
	}

	@Override
	public void deleteById(int id) {
		String sql = "delete from student where id = ?";
		this.getJdbcTemplate().update(sql, id);
	}

	@Override
	public void updateStudent(Student student) {
		String sql = "update student set name = ?,age=?,score=? where id=?";
		this.getJdbcTemplate().update(sql, student.getName(),student.getAge(),student.getScore(),student.getId());
	}

	@Override
	public List<String> selectAllStudentsNames() {
		String sql = "select name from student";
		return this.getJdbcTemplate().queryForList(sql , String.class);
	}

	@Override
	public String selectStudentNameById(int id) {
		String sql = "select name from student where id = ?";
		return this.getJdbcTemplate().queryForObject(sql , String.class,id);
	}

	@Override
	public List<Student> selectAllStudents() {
		String sql = "select id,name,age,score from student";
		return this.getJdbcTemplate().query(sql,new MyRowMapper());
	}

	@Override
	public Student selectStudentById(int id) {
		String sql = "select id,name,age,score from student where id = ?";
		return this.getJdbcTemplate().queryForObject(sql, new MyRowMapper(), id);
	}

}
