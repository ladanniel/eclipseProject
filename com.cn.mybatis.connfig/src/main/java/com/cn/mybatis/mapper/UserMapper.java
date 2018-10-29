package com.cn.mybatis.mapper;

import java.util.List;


import com.cn.mybatis.pojo.User;
import com.cn.mybatis.pojo.UserCustom;
import com.cn.mybatis.pojo.UserQueryVO;


public interface UserMapper {
	//综合查询
	public List<UserCustom> findUserList(UserQueryVO userQueryVO) throws Exception;
	//查询用户信息
		public User selectById(int id) throws Exception;
		//添加用户信息
		public void insertUser(User user) throws Exception;
		//删除用户信息
		public void deleteUser(int id) throws Exception;


}
