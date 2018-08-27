package com.lijia.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lijia.beans.Student;
import com.lijia.dao.IStudentDao;
import com.lijia.utils.MyBatisUtils;

public class MyTest {
	
	private IStudentDao dao;
	private SqlSession sqlSession;
	
	@Before
	public void before(){
		sqlSession = MyBatisUtils.getSqlSession();
		dao = sqlSession.getMapper(IStudentDao.class);
	}
	@After
	public void after(){
		if(sqlSession!=null){
			sqlSession.close();
		}
	}
	@Test
	public void testSelectStudentsByCondition(){
		//查询名字中有张的，并且年龄大于21，还要成绩大于王五的
		Student stu = new Student("王五", 19, 96.5);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("stuName", "张");
		map.put("stuAge", 21);
		map.put("stu", stu);
		List<Student> list = dao.selectStudentsByCondition(map);
		if(list.size()>0){
			for (Student student : list) {
				System.out.println(student);
			}
		}
	}
	
	@Test
	public void testSelectStudentsByCond(){
		List<Student> list = dao.selectStudentsByCond("张",21);
		if(list.size()>0){
			for (Student student : list) {
				System.out.println(student);
			}
		}
	}
	
	@Test
	public void testIf(){
		Student stu = new Student("张",22);
		List<Student> list = dao.selectStudentIf(stu);
		if(list.size()>0){
			for (Student student : list) {
				System.out.println(student);
			}
		}
	}
	
	@Test
	public void testChoose(){
		Student stu = new Student("",22);
		List<Student> list = dao.selectStudentChoose(stu);
		if(list.size()>0){
			for (Student student : list) {
				System.out.println(student);
			}
		}
	}
	
	@Test
	public void testForeach(){
		int[] ids = {1,3,5,7};
		List<Student> list = dao.selectStudentForeach(ids);
		if(list.size()>0){
			for (Student student : list) {
				System.out.println(student);
			}
		}
	}
	
	@Test
	public void testForeachList(){
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(3);
		List<Student> list = dao.selectStudentForeachList(ids);
		if(list.size()>0){
			for (Student student : list) {
				System.out.println(student);
			}
		}
	}
	
	@Test
	public void testForeachList2(){
		Student student1 = new Student();
		student1.setId(1);
		Student student2 = new Student();
		student2.setId(5);
		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		List<Student> list = dao.selectStudentForeachList2(students);
		if(list.size()>0){
			for (Student student : list) {
				System.out.println(student);
			}
		}
	}
	
	
	
}
