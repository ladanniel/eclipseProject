/**
	 * <settings> ：全局参数配置 比如开启二级缓存，开启延时加载
	 */
	 
	#### typeAliases(别名)：作用：方便开发
	 注意：如果在制定类型是输入类型的全路径不方便开发，可以针对parameterType或resultType指定的类型定义一些别名，在mapper.xml中通过别名定义，方便开发
	 单个别名定义
	  <typeAliases> 
      <typeAlias type="com.cn.mybatis.pojo.User" alias="user"></typeAlias>
  </typeAliases>
        #### 批量别名定义: mybatis自动扫描包中的pojo类 自动定义别名，别名类首字母大小写都可以
        <package name="com.cn.mybatis.pojo"></package>
        ### 多个包定义
        写多个package即可
        
        ###typeHandlers:类型处理器
        mybatis中通过typeHandlers完成jdbc和java类型的转换：例如String类型等 通常情况下不需要自定转换类型
        plugins(插件)
        
        ####mapper(映射配置)
        单个映射文件加载
        <mappers>
	      <mapper resource="mapper/User.xml"></mapper>
	      <mapper resource="mapper/UserMapper.xml"></mapper>
	   </mappers>
   通过mapper接口加载映射文件 mapper.xml代理方法加载
       <mappers>
	       <mapper class="com.cn.mybatis.mapper.UserMapper"></mapper>
	  </mappers>
	  
	  ##批量加载多个mapper
         <mappers>
	       <package name="com.cn.mybatis.mapper"></package>
	  </mappers>
	 parameterType参数类型
	 resultType输出结果类型
	 <selectKey>：将查询到的主键值设置到parameterType制定的对象的属性
	 order:<selectKey keyProperty="id" order="BEFORE" resultType="java.lang.Integer">的执行顺序，相对于insert语句的执行顺序-->
	 #####输入映射
	 parameterType制定输入类型的参数，有简单类型，hashmap ，entity的包装类
	 ##包装类
	   见VO类
	  
	 
	 
	 #####输出映射
	 
	 #####Mapper.xml映射综合查询  如多表：需要关联查询
	 
	 
	 
	 