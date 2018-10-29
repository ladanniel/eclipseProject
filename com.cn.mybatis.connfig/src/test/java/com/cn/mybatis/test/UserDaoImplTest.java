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
		//�����ػ�����������mybatis�����ļ���Ϣ
		SqlSessionFactory sql = new SqlSessionFactoryBuilder().build(ips);
		//ͨ�������õ�session
		User user = new UserDaoImpl(sql).findUserById(2);
		System.out.println(user);
		
	}

}
