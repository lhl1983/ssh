package com.cn.service.impl;

import com.cn.dao.DemoDao;
import com.cn.dao.ResourcesDao;
import com.cn.dao.UsersDao;
import com.cn.model.Resources;
import com.cn.model.Roles;
import com.cn.model.Users;
import com.cn.service.DemoService;

public class DemoServiceImpl implements DemoService {

	private DemoDao demoDao;
	
	private UsersDao usersDao;
	
	private ResourcesDao resourceDao;

	public ResourcesDao getResourceDao() {
		return resourceDao;
	}

	public void setResourceDao(ResourcesDao resourceDao) {
		this.resourceDao = resourceDao;
	}

	public UsersDao getUsersDao() {
		return usersDao;
	}

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}


	public DemoDao getDemoDao() {
		return demoDao;
	}

	public void setDemoDao(DemoDao demoDao) {
		this.demoDao = demoDao;
	}

	@Override
	public void saveDemo() {
		System.out.println("I am service");
		demoDao.listDemo();
		
		Users user = usersDao.getUsers("admin");
		System.out.println(user.getAccount());
		for(Roles r : user.getRoles()){
			System.out.println(r.getName());
			for(Resources rs : r.getResources()){
				System.out.println(rs.getName());
			}
		}
	}

}
