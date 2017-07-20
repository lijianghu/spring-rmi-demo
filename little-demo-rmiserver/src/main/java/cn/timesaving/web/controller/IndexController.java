package cn.timesaving.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.timesaving.web.service.AccountService;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@Resource
	private AccountService accountService;
	
	@RequestMapping("/index")
	public String list(HttpServletRequest request){
		System.out.println("+++++++++++++服务+"+accountService.getName("服务器名"));
		return "index";
	}
	
}