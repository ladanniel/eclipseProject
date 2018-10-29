package com.cn.mybatis.mapper;

import java.util.List;


import com.cn.mybatis.pojo.User;
import com.cn.mybatis.pojo.UserCustom;
import com.cn.mybatis.pojo.UserQueryVO;


public interface UserMapper {
	//�ۺϲ�ѯ
	public List<UserCustom> findUserList(UserQueryVO userQueryVO) throws Exception;
	//��ѯ�û���Ϣ
		public User selectById(int id) throws Exception;
		//����û���Ϣ
		public void insertUser(User user) throws Exception;
		//ɾ���û���Ϣ
		public void deleteUser(int id) throws Exception;


}
