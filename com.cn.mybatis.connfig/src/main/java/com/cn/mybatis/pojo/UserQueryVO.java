package com.cn.mybatis.pojo;

/**User�İ�װ��
 * vo ���ŵ㣺
 * 1����ǰ�˵��־ò㶼���Դ�ֵ
 * 2����װ����Ҫ�Ĳ�ѯ���� 
 * 3������User������PO:
 * 4�����Ҫ��User������չ����������User���������User����һ����չ��UserCustom
 * @author Administrator
 *
 */
public class UserQueryVO {
	//������Ҫ��װ����Ҫ������
	//��װUser�Ĳ�ѯ����
	//private User user;�˴�������User����չ�࣬Ҳ������User��
	private UserCustom userCustom;
	

	@Override
	public String toString() {
		return "UserQueryVO [userCustom=" + userCustom + "]";
	}

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
	
	//��װ��ַ��
	

}
