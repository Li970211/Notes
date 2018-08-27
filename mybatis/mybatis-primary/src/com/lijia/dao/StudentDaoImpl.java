package com.lijia.dao;

import org.apache.ibatis.session.SqlSession;

import com.lijia.beans.Student;
import com.lijia.utils.MyBatisUtils;

public class StudentDaoImpl implements IStudentDao {

	private SqlSession sqlSession;
	@Override
	public void insertStu(Student student) {
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			//相关操作
			sqlSession.insert("insertStudent", student);
			sqlSession.commit();
			/*为什么sqlSession.commit()就把事务提交了
			 * 由于上面执行增删改操作的时候，底层都是update,然后dirty(
			 * 内存里的数据和数据库的数据不一致为脏，初始为false(不脏)
			 * )就会变为true，然后从读取配置文件，在执行器又执行了update操作
			 * 在执行sqlSession.commit(),起底层commit(false);
			 * 在执行 executor.commit(isCommitOrRollbackRequired(force))这里的force就是commit(false)中的false
			 * 在isCommitOrRollbackRequired(force)中返回return (!autoCommit && dirty) || force;
			 * autoCommit默认是false,dirty此时为true,则整体返回true;
			 * 点commit方法看到执行commit(boolean required)，由于上面返回true就直接执行下面语句
			 * if (required) {
			      transaction.commit();//事务提交
			    }
			 * 执行提交后dirty = false;变回了false。如果没有提交则为true
			 *为什么InputStream的流不用关？
			 *由于SqlSessionFactoryBuilder对象的build()方法会自动将输入流关闭
			 *为什么sqlSession.close()就可以不用进行回滚了
			 *sqlSession.commit()提交不回滚，没有提交回滚，由于dirty的值。
			 * 在进行SqlSession进行关闭时，会将事务回滚后关闭，所以
			 * MyBatis程序无需通过显示的对SqlSession进行回滚，达到事务回滚的目的
			 */
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		
	}

}
