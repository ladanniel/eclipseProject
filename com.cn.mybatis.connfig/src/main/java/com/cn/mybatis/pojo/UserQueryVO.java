package com.cn.mybatis.pojo;

/**User的包装类
 * vo ：优点：
 * 1、从前端到持久层都可以传值
 * 2、包装所需要的查询条件 
 * 3、参照User表建立的PO:
 * 4、如果要对User进行扩展，不能脱离User，建议针对User建立一个扩展类UserCustom
 * @author Administrator
 *
 */
public class UserQueryVO {
	//根据需要包装所需要的类型
	//包装User的查询条件
	//private User user;此处建议用User的扩展类，也可以用User类
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
	
	//包装地址类
	

}
