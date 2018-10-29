package com.cn.mybatis.mapper;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Before;
import org.junit.Test;

import com.cn.mybatis.pojo.User;
import com.cn.mybatis.pojo.UserCustom;
import com.cn.mybatis.pojo.UserQueryVO;

public class UserMapperTest {
	public  SqlSessionFactory sql ;
	
	@Before
	public void setUp() {
		String config = "sqlMapConfig.xml";
		InputStream ips = Resource.class.getClassLoader().getResourceAsStream(config);
		//�����ػ�����������mybatis�����ļ���Ϣ
		sql = new SqlSessionFactoryBuilder().build(ips);
	}
	
  //�־ò㷽���Ĳ��������ð�װ���� map service�����н��鲻Ҫʹ�ð�װ���ͣ�������ҵ���ά����

	@Test
	public void testFindUserById()  {
		
		
		try {
			SqlSession sqls = sql.openSession();
			//mybatis�Զ����ɴ������ (�൱�ڴ�������)
			UserMapper um = sqls.getMapper(UserMapper.class);
			User user = um.selectById(1);
			System.out.println(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//�û���Ϣ���ۺϲ�ѯ
	@Test
	public void testFindUserList()  {
	
		
		
		try {
			SqlSession sqls = sql.openSession();
			//mybatis�Զ����ɴ������ (�൱�ڴ�������)
			UserMapper um = sqls.getMapper(UserMapper.class);
			UserQueryVO uqv = new UserQueryVO();
			UserCustom uc = new UserCustom();
			uc.setSex(1);
			uc.setUsername("xuxiang");
			uqv.setUserCustom(uc);
			List<UserCustom> list;
			list = um.findUserList(uqv);
			System.out.println(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
