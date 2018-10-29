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
		//mybatis �����ļ�
				String config = "sqlMapConfig.xml";
				//��ȡ�����ļ���
				InputStream ips = Resource.class.getClassLoader().getResourceAsStream(config);
				//�����ػ�����������mybatis�����ļ���Ϣ
				SqlSessionFactory sql = new SqlSessionFactoryBuilder().build(ips);
				//ͨ�������õ�session
				SqlSession session =sql.openSession();
				
				//ͨ��sqlsession�������ݿ� statement = namespace.statement��id paramenterType
				User user = session.selectOne("test.selectById", 1);
				System.out.println(user);
				session.close();
				System.out.println(user.getId());
	}
		//ģ�����Բ�ѯ�û��б�
	@Test
	public void selectByName()throws IOException {
		//mybatis �����ļ�
				String config = "sqlMapConfig.xml";
				//��ȡ�����ļ���
				InputStream ips = Resource.class.getClassLoader().getResourceAsStream(config);
				//�����ػ�����������mybatis�����ļ���Ϣ
				SqlSessionFactory sql = new SqlSessionFactoryBuilder().build(ips);
				//ͨ�������õ�session
				SqlSession session =sql.openSession();
				
				//ͨ��sqlsession�������ݿ� statement = namespace.statement��id paramenterType
				User user = session.selectOne("test.selectByName", "%��һ��%");
				System.out.println(user);
				session.close();
				
		
	}	
	
	@Test
	public void insertByUserName()throws IOException {
		//mybatis �����ļ�
				String config = "sqlMapConfig.xml";
				//��ȡ�����ļ���
				InputStream ips = Resource.class.getClassLoader().getResourceAsStream(config);
				//�����ػ�����������mybatis�����ļ���Ϣ
				SqlSessionFactory sql = new SqlSessionFactoryBuilder().build(ips);
				//ͨ�������õ�session
				SqlSession session =sql.openSession();
				
				User user = new User();
				user.setId(31);
				user.setUsername("����");
				user.setPassword("654321");
				user.setSex(1);
				user.setBirthday(new Date());
				user.setIsAdmin(1);
				session.insert("test.insertByUserName",user);
				session.commit();
				//��������
				Integer id = user.getId();
				System.out.println(id);
				session.close();
				
		
	}
		
	

}
