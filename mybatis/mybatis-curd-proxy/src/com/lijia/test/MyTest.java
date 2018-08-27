package com.lijia.test;

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
	public void testInsert(){
		Student student = new Student("张三", 29, 96.5);
		System.out.println("插入前:"+student);//插入前:Student [id=null, name=赵六, age=29, score=96.5]
		dao.insertStudent(student);
		System.out.println("插入后:"+student);//插入后:Student [id=null, name=赵六, age=29, score=96.5]
		sqlSession.commit();
	}
	@Test
	public void testInsertStudnetCacheId(){
		Student student = new Student("赵六", 29, 96.5);
		System.out.println("插入前:"+student);//插入前:Student [id=null, name=赵六, age=29, score=96.5]
		dao.insertStudnetCacheId(student);
		System.out.println("插入后:"+student);//插入后:Student [id=9, name=赵六, age=29, score=96.5]
		sqlSession.commit();
	}
	@Test
	public void testDeleteStudentById(){
		dao.deleteStudentById(10);
		sqlSession.commit();
	}
	@Test
	public void testUpdate(){
		Student student = new Student("张腾金", 22, 96.6);
		student.setId(11);
		dao.updateStudent(student);
		sqlSession.commit();
	}
	@Test
	public void testAllList(){
		List<Student> list = dao.selectAllStudents();
		if(list.size()>0){
			for (Student student : list) {
				System.out.println(student);
			}
		}
		
	}
	@Test
	public void testselectById(){
		Student student = dao.selectStudentById(1);
		System.out.println(student);
	}
	@Test
	public void testSelectMap(){
		Map<String, Object> map = dao.selectAllStudentsMap();
		System.out.println(map.get(9));
	}
	@Test
	public void testSelectByName(){
		List<Student> list = dao.selectStudentsByName("张");
		if(list.size()>0){
			for (Student student : list) {
				System.out.println(student);
			}
		}
	}
	@Test
	public void testSelectStudentByMap(){
		Student student = new Student();
		student.setId(1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("studentId", 1);
		map.put("student", student);
		student = dao.selectStudentByMap(map);
		System.out.println(student);
	}
}
