package com.lijia.dao;

import java.util.List;
import java.util.Map;

import com.lijia.beans.Student;

public interface IStudentDao {
	//根据姓名查询
	List<Student> selectStudentsByCondition(Map<String, Object> map);
	
	List<Student> selectStudentsByCond(String name, int age);
	
	List<Student> selectStudentIf(Student student);
	
	List<Student> selectStudentChoose(Student student);
	
	List<Student> selectStudentForeach(int[] ids);
	
	List<Student> selectStudentForeachList(List<Integer> ids);
	
	List<Student> selectStudentForeachList2(List<Student> student);
	
}
