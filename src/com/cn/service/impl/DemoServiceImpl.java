package com.cn.service.impl;

import com.cn.dao.DemoDao;
import com.cn.service.DemoService;

public class DemoServiceImpl implements DemoService {

	private DemoDao demoDao;

	public DemoDao getDemoDao() {
		return demoDao;
	}

	public void setDemoDao(DemoDao demoDao) {
		this.demoDao = demoDao;
	}

	@Override
	public void saveDemo() {
		System.out.println("I am service");
//		testDao.saveUser();
		demoDao.listDemo();
	}

}
