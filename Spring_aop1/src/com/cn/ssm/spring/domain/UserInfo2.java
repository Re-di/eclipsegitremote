package com.cn.ssm.spring.domain;

public class UserInfo2 {
	
	private Integer id;
	private String user_name;
	private String pass_word;
	
	
	public UserInfo2(Integer id, String user_name, String pass_word) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.pass_word = pass_word;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPass_word() {
		return pass_word;
	}
	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}
	@Override
	public String toString() {
		return "UserInfo2 [id=" + id + ", user_name=" + user_name + ", pass_word=" + pass_word + "]";
	}
	
	
}
