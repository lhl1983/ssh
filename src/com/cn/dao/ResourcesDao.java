package com.cn.dao;

import java.util.List;

import com.cn.model.Resources;

public interface ResourcesDao {

	public List<Resources> getResourceList(Integer roleId);
}
