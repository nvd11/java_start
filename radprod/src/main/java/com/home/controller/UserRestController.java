package com.home.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.rest.User;

@Controller
@RequestMapping("/user")
public class UserRestController {
	private Map<Integer,User> userMap = new HashMap<Integer, User>();
	
	public UserRestController(){
		userMap.put(1, new User(1,"jack","jacky","jack@163.com"));
		userMap.put(2, new User(2,"nick","nicky","nick@163.com"));
		userMap.put(3, new User(3,"jenny","jenny","jenny@163.com"));
		userMap.put(4, new User(4,"bill","billy","bill@163.com"));
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("users", userMap);
		return "rest/user/users";
	}

}
