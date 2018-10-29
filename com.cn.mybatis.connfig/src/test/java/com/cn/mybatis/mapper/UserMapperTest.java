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
		//创建回话工厂，传入mybatis配置文件信息
		sql = new SqlSessionFactoryBuilder().build(ips);
	}
	
  //持久层方法的参数可以用包装类型 map service（）中建议不要使用包装类型（不利于业务层维护）

	@Test
	public void testFindUserById()  {
		
		
		try {
			SqlSession sqls = sql.openSession();
			//mybatis自动生成代理对象 (相当于创建对象)
			UserMapper um = sqls.getMapper(UserMapper.class);
			User user = um.selectById(1);
			System.out.println(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//用户信息的综合查询
	@Test
	public void testFindUserList()  {
	
		
		
		try {
			SqlSession sqls = sql.openSession();
			//mybatis自动生成代理对象 (相当于创建对象)
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
