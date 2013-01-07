package com.cn.action;

import com.cn.base.action.BaseAction;
import com.cn.service.DemoService;

public class DemoAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private DemoService demoService;

	public DemoService getDemoService() {
		return demoService;
	}

	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}

	public String demo() {
		System.out.println("I am action");
		demoService.saveDemo();
		return SUCCESS;
	}

}
