package com.cn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

import com.cn.base.dao.SupportDao;
import com.cn.dao.ResourcesDao;
import com.cn.model.Resources;

public class ResourcesDaoImpl extends SupportDao implements ResourcesDao{

	@Override
	public List<Resources> getResourceList(Integer roleId) {
//		Criteria c = this.getSession().createCriteria(Resources.class);
//		c.add(Restrictions.eq("", roleId));
		
		return null;
	}

}
