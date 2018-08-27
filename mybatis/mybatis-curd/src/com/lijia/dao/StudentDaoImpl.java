package com.lijia.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.lijia.beans.Student;
import com.lijia.utils.MyBatisUtils;

public class StudentDaoImpl implements IStudentDao {

	private SqlSession sqlSession;
	@Override
	public void insertStudent(Student student) {
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//相关操作
			sqlSession.insert("insertStudent", student);
			sqlSession.commit();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		
	}
	@Override
	public void insertStudnetCacheId(Student student) {
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//相关操作
			sqlSession.insert("insertStudnetCacheId", student);
			sqlSession.commit();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		
	}
	@Override
	public void deleteStudentById(int id) {
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//相关操作
			sqlSession.delete("deleteStudentById", id);
			sqlSession.commit();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		
	}
	@Override
	public void updateStudent(Student student) {
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//相关操作
			sqlSession.update("updateStudent",student);
			sqlSession.commit();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		
	}
	@Override
	public List<Student> selectAllStudents() {
		List<Student> students = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//相关操作
			students = sqlSession.selectList("selectAllStudents");
			//查询不用提交
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		return students;
	}
	@Override
	public Map<String, Object> selectAllStudentsMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//相关操作
			//第二个参数需要指定这个对象的属性作为key
			map = sqlSession.selectMap("selectAllStudents","id");
			//查询不用提交
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		return map;
	}
	@Override
	public Student selectStudentById(int id) {
		Student student = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//相关操作
			student = sqlSession.selectOne("selectStudentById",id);

		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		return student;
	}
	@Override
	public List<Student> selectStudentsByName(String name) {
		List<Student> students = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//相关操作
			students = sqlSession.selectList("selectStudentsByName",name);
			//查询不用提交
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		return students;
	}
	@Override
	public Student selectStudentByMap(Map<String, Object> map) {
		Student student = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//相关操作
			student = sqlSession.selectOne("selectStudentByMap",map);

		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		return student;
	}

}
