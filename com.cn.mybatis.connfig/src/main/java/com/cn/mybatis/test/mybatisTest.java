package com.cn.mybatis.test;


import java.io.IOException;
import java.io.InputStream;
import java.util.Date;



import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;

import com.cn.mybatis.pojo.User;

public class mybatisTest{
	@Test
	public void selectById()throws IOException {
		//mybatis 配置文件
				String config = "sqlMapConfig.xml";
				//获取配置文件流
				InputStream ips = Resource.class.getClassLoader().getResourceAsStream(config);
				//创建回话工厂，传入mybatis配置文件信息
				SqlSessionFactory sql = new SqlSessionFactoryBuilder().build(ips);
				//通过工厂得到session
				SqlSession session =sql.openSession();
				
				//通过sqlsession操作数据库 statement = namespace.statement的id paramenterType
				User user = session.selectOne("test.selectById", 1);
				System.out.println(user);
				session.close();
				System.out.println(user.getId());
	}
		//模糊测试查询用户列表
	@Test
	public void selectByName()throws IOException {
		//mybatis 配置文件
				String config = "sqlMapConfig.xml";
				//获取配置文件流
				InputStream ips = Resource.class.getClassLoader().getResourceAsStream(config);
				//创建回话工厂，传入mybatis配置文件信息
				SqlSessionFactory sql = new SqlSessionFactoryBuilder().build(ips);
				//通过工厂得到session
				SqlSession session =sql.openSession();
				
				//通过sqlsession操作数据库 statement = namespace.statement的id paramenterType
				User user = session.selectOne("test.selectByName", "%江一阳%");
				System.out.println(user);
				session.close();
				
		
	}	
	
	@Test
	public void insertByUserName()throws IOException {
		//mybatis 配置文件
				String config = "sqlMapConfig.xml";
				//获取配置文件流
				InputStream ips = Resource.class.getClassLoader().getResourceAsStream(config);
				//创建回话工厂，传入mybatis配置文件信息
				SqlSessionFactory sql = new SqlSessionFactoryBuilder().build(ips);
				//通过工厂得到session
				SqlSession session =sql.openSession();
				
				User user = new User();
				user.setId(31);
				user.setUsername("张巧");
				user.setPassword("654321");
				user.setSex(1);
				user.setBirthday(new Date());
				user.setIsAdmin(1);
				session.insert("test.insertByUserName",user);
				session.commit();
				//主键返回
				Integer id = user.getId();
				System.out.println(id);
				session.close();
				
		
	}
		
	

}
