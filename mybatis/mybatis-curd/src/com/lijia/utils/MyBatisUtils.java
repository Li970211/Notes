package com.lijia.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	private static SqlSessionFactory sqlSessionFactory;//线程安全
	
	public static SqlSession getSqlSession(){
		try {
			InputStream is = Resources.getResourceAsStream("mybatis.xml");
			if(sqlSessionFactory == null){//只要有就不用创建了，提高效率
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			}
			return sqlSessionFactory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
