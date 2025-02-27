package com.danmu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.danmu.bean.User;
import com.danmu.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World ABCDEFG!!!";
	}
	
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("name","jack");
		model.addAttribute("age",20);
		model.addAttribute("info","我是一个爱学习的好青年");
		return "index";
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public String save(User user) {
		userService.save(user);
		return "save success!";
	}
}
