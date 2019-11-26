package com.cn.ssm.spring.test;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.ssm.spring.HelloWorld;
import com.cn.ssm.spring.domain.UserInfo;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个String容器
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = context.getBean(com.cn.ssm.spring.HelloWorld.class);
				System.out.println(helloWorld.hello("zhangsan"));
		
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		context.getBean("jdbcUtil");
//		JdbcUtil jdbcutil = (JdbcUtil)context.getBean("jdbcUtil");
//		JdbcUtil jdbcutil2 = (JdbcUtil)context.getBean("jdbcUtil");
//		JdbcUtil jdbcutil3 = (JdbcUtil)context.getBean("jdbcUtil");
//		JdbcUtil jdbcutil4 = (JdbcUtil)context.getBean("jdbcUtil");
//		System.out.println("jdbcutil==jdbcutil "+(jdbcutil==jdbcutil2 ));
//		System.out.println("jdbcutil==jdbcutil "+(jdbcutil2==jdbcutil3 ));
//		System.out.println("jdbcutil==jdbcutil "+(jdbcutil3==jdbcutil4 ));	
//		context.close();

//		UserInfo userInfo1 = context.getBean(com.cn.ssm.spring.domain.UserInfo.class);
//		 System.out.println(userInfo1);
		 
		UserInfo userInfo = (UserInfo) context.getBean("user");
		System.out.println(userInfo);
			
		List<String> addressList = userInfo.getAddressList();
		for (String string : addressList) {
			System.out.println(string);
		}
		Set<String> addressSet= userInfo.getAddressSet();
		 for (String string1 : addressSet) {
			System.out.println(string1);
		}
		
	}

}
