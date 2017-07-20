package cn.timesaving.web.service.impl;

import cn.timesaving.web.service.AccountService;

public class AccountServiceImpl implements AccountService{

	public String getName(String name) {
			System.out.println("AccountServiceImpl-->getName()"+name);
			return name;
	}
}
