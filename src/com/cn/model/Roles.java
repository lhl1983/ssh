package com.cn.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Roles implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;

	private String name;

	private Integer enabled;
	
	private Set<Resources> resources = new HashSet<Resources>();
	
	public Set<Resources> getResources() {
		return resources;
	}

	public void setResources(Set<Resources> resources) {
		this.resources = resources;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
}
