package com.cn.ssm.spring.domain;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserInfo {

	 private Integer id;
	 private String username;
	 private String password;
	 
	 private List<String> addressList;
	 private Set<String> addressSet;
	 private Map<String,String>addressMap;

	public Map<String, String> getAddressMap() {
		return addressMap;
	}



	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}



	public Set<String> getAddressSet() {
		return addressSet;
	}



	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}



	public List<String> getAddressList() {
		return addressList;
	}



	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}



	public UserInfo(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public UserInfo() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	
	 	
}
