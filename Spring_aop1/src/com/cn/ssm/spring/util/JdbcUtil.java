package com.cn.ssm.spring.util;

import java.sql.Connection;

	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class JdbcUtil {
		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		private Connection conn;
		public Connection getConn() {
			return conn;
		}
		public void setConn(Connection conn) {
			this.conn = conn;
		}
		public JdbcUtil() {
			
		}
		/*
		 * ��ʼ�����ݿ������*/
		public void init() {
			System.out.println("public void init()");
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm_topic?serverTimezone=UTC",
						"root","root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*
		 * �ͷ����ݿ���Դ*/
		public void free() {
			System.out.println("public void free()");
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
