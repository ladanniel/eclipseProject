package com.cn.mybatis.test;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Before;
import org.junit.Test;

import com.cn.mybatis.dao.UserDao;
import com.cn.mybatis.dao.impl.UserDaoImpl;
import com.cn.mybatis.pojo.User;

public class UserDaoImplTest {
	

	@Test
	public void testFindUserById() {
		String config = "sqlMapConfig.xml";
		InputStream ips = Resource.class.getClassLoader().getResourceAsStream(config);
		//创建回话工厂，传入mybatis配置文件信息
		SqlSessionFactory sql = new SqlSessionFactoryBuilder().build(ips);
		//通过工厂得到session
		User user = new UserDaoImpl(sql).findUserById(2);
		System.out.println(user);
		
	}

}
