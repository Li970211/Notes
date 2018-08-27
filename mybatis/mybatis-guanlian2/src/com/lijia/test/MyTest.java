package com.lijia.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lijia.beans.Country;
import com.lijia.beans.Minister;
import com.lijia.dao.MinisterDao;
import com.lijia.utils.MyBatisUtils;

public class MyTest {
	
	private MinisterDao dao;
	private SqlSession sqlSession;
	
	@Before
	public void before(){
		sqlSession = MyBatisUtils.getSqlSession();
		dao = sqlSession.getMapper( MinisterDao.class);
	}
	@After
	public void after(){
		if(sqlSession!=null){
			sqlSession.close();
		}
	}
	@Test
	public void test01(){
		Minister minister = dao.selectMinisterById(2);
		System.out.println(minister);

	}
}
