package com.cn.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.cn.base.dao.SupportDao;
import com.cn.dao.UsersDao;
import com.cn.model.Users;

public class UsersDaoImpl extends SupportDao implements UsersDao {

	@Override
	public Users getUsers(String username) {
		Criteria c = this.getSession().createCriteria(Users.class);
		c.add(Restrictions.eq("account",username));
		List<Users> list = c.list();
		Users users = null;
		if(null != list && list.size() > 0)
			users = list.get(0);
		return users;
	}

}
