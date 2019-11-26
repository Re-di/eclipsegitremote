package com.cn.ssm.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.ssm.spring.service.ClassService;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个String容器
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		ClassService classService = context.getBean(ClassService.class);
		classService.delete();
	}

}
