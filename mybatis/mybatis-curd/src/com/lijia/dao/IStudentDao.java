package com.lijia.dao;

import java.util.List;
import java.util.Map;

import com.lijia.beans.Student;

public interface IStudentDao {
	//插入
	void insertStudent(Student student);
	void insertStudnetCacheId(Student student);
	//删除
	void deleteStudentById(int id);
	//修改
	void updateStudent(Student student);
	//查询所有
	List<Student> selectAllStudents();
	Map<String,Object> selectAllStudentsMap();
	//查询指定学生
	Student selectStudentById(int id);
	Student selectStudentByMap(Map<String, Object> map);
	//根据姓名查询
	List<Student> selectStudentsByName(String name);
}
