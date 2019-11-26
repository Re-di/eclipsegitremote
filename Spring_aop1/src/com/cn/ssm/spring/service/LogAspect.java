package com.cn.ssm.spring.service;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class LogAspect {

	//前置通知方法
		public void before(JoinPoint joinPoint) {
			System.out.println(new Date());
			System.out.println(joinPoint.getSignature());
			System.out.println("params:");
			for (Object param : joinPoint.getArgs()) {
				System.out.print(param+" ");
			}
			System.out.println();	
		}
		
		public void around(ProceedingJoinPoint proceedingJoinPoint) {
			
			try {
				System.out.println("进入方法体");
				proceedingJoinPoint.proceed();//执行目标对象的方法
				System.out.println("离开方法体");
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public void after() {
			System.out.println("after advice");
		}
		
		public void afterThrowing() {
			System.out.println("after throwing advice");
		}
		
		public void afterReturning() {
			System.out.println("after returning advice");
		}
}
