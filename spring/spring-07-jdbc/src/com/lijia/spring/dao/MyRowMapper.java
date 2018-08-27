package com.lijia.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lijia.spring.beans.Student;

public class MyRowMapper implements RowMapper<Student> {
	
	/*
	 * 当查询出总的结果集后，框架会自动遍历这个结果集，每次遍历的一行数据
	 * 都会被存放到这个rs参数中，也就是说，这里的rs代表的是一行数据，并不是jdbc中的那个所有查询结果集
	 * 只要能执行到这个方法，就说明这里的rs不会是空的
	 */
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		student.setScore(rs.getDouble("score"));
		return student;
	}

}
