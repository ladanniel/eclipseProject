/**
	 * <settings> ��ȫ�ֲ������� ���翪���������棬������ʱ����
	 */
	 
	#### typeAliases(����)�����ã����㿪��
	 ע�⣺������ƶ��������������͵�ȫ·�������㿪�����������parameterType��resultTypeָ�������Ͷ���һЩ��������mapper.xml��ͨ���������壬���㿪��
	 ������������
	  <typeAliases> 
      <typeAlias type="com.cn.mybatis.pojo.User" alias="user"></typeAlias>
  </typeAliases>
        #### ������������: mybatis�Զ�ɨ����е�pojo�� �Զ��������������������ĸ��Сд������
        <package name="com.cn.mybatis.pojo"></package>
        ### ���������
        д���package����
        
        ###typeHandlers:���ʹ�����
        mybatis��ͨ��typeHandlers���jdbc��java���͵�ת��������String���͵� ͨ������²���Ҫ�Զ�ת������
        plugins(���)
        
        ####mapper(ӳ������)
        ����ӳ���ļ�����
        <mappers>
	      <mapper resource="mapper/User.xml"></mapper>
	      <mapper resource="mapper/UserMapper.xml"></mapper>
	   </mappers>
   ͨ��mapper�ӿڼ���ӳ���ļ� mapper.xml����������
       <mappers>
	       <mapper class="com.cn.mybatis.mapper.UserMapper"></mapper>
	  </mappers>
	  
	  ##�������ض��mapper
         <mappers>
	       <package name="com.cn.mybatis.mapper"></package>
	  </mappers>
	 parameterType��������
	 resultType����������
	 <selectKey>������ѯ��������ֵ���õ�parameterType�ƶ��Ķ��������
	 order:<selectKey keyProperty="id" order="BEFORE" resultType="java.lang.Integer">��ִ��˳�������insert����ִ��˳��-->
	 #####����ӳ��
	 parameterType�ƶ��������͵Ĳ������м����ͣ�hashmap ��entity�İ�װ��
	 ##��װ��
	   ��VO��
	  
	 
	 
	 #####���ӳ��
	 
	 #####Mapper.xmlӳ���ۺϲ�ѯ  ������Ҫ������ѯ
	 
	 
	 
	 