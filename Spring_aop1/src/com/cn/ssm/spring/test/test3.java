package com.cn.ssm.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.ssm.spring.service.StudentService;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个String容器
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		StudentService studentServiceService = context.getBean(StudentService.class);
		studentServiceService.save("zhangsan", "17900521");
		 
	}

}
