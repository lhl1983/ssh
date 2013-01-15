package com.cn.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Users implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;

	private String account;
	
	private String password;
	
	private Integer enable;

	private Set<Roles> roles = new HashSet<Roles>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}
	
	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}

}
