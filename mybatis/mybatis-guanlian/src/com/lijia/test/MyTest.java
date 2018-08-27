package com.lijia.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lijia.beans.Country;
import com.lijia.dao.CountryDao;
import com.lijia.utils.MyBatisUtils;

public class MyTest {
	
	private CountryDao dao;
	private SqlSession sqlSession;
	
	@Before
	public void before(){
		sqlSession = MyBatisUtils.getSqlSession();
		dao = sqlSession.getMapper( CountryDao.class);
	}
	@After
	public void after(){
		if(sqlSession!=null){
			sqlSession.close();
		}
	}
	@Test
	public void test01(){
		Country country = dao.selectCountryById(2);
		System.out.println(country.getCname());
	}
	
	
	
}
