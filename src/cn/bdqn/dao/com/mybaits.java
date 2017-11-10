package cn.bdqn.dao.com;

import java.io.InputStream;

import javax.jms.Session;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class mybaits {
 private static SqlSessionFactory factory = null;
 static{
	 try {
	 InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
	 factory=new SqlSessionFactoryBuilder().build(is);
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
 public static SqlSession getSession(){
	 return factory.openSession(false);
 }
 public static void closeSession(SqlSession session){
	 if(session !=null){
	session.close();
	 }
 }
}
