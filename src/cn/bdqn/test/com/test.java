package cn.bdqn.test.com;

import org.apache.ibatis.session.SqlSession;


import cn.bdqn.dao.com.UserDao;
import cn.bdqn.dao.com.mybaits;


public class test {
	public static void main(String[] args) {
		try {
			SqlSession session =mybaits.getSession();
			UserDao user = session.getMapper(UserDao.class);
			String name= user.getNameById(1);
			session.close();
			
			System.out.println(name);
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
