package com.lijia.aop05;

// 目标类
public class SomeServiceImpl implements ISomeService {

	@Override
	public boolean login(String username, String password) throws UserException {
		if(!"beijing".equals(username)) {
			throw new UsernameException("用户名输错了！");
		}
		if(!"111".equals(password)) {
			throw new PasswordException("密码输错了！");
		}
		// double a = 3 / 0;
		return true;
	}

}
















