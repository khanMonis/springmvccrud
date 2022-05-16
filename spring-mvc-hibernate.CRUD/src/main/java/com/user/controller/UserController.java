package com.user.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.dao.UserDao;
import com.user.model.User;

@Controller
public class UserController {
	
	
	private ApplicationContext connApplicationContext;

	@RequestMapping("/home")
	public String  view1() {
		return "home";
		
	}
	@RequestMapping("/register")
	public String  view2(Model m) {
		connApplicationContext= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user=connApplicationContext.getBean("mu",User.class);
		m.addAttribute("bean", user);
		return "register";
		
	}
	@RequestMapping("/store")
	public String  view3(@ModelAttribute("bean")User user1  ,Model m) {
		
		connApplicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDao user2=connApplicationContext.getBean("dao",UserDao.class);
		user2.saveData(user1);
		m.addAttribute("msg","record insert successfully");
		return "register";
		
	}
	
}
