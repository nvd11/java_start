package com.home.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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

	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addUserPage(Model model){
        //pass a empty object to frontend;
        model.addAttribute("user", new User());
		return "rest/user/add";
	}


	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addUser(@Validated User user, BindingResult br){ //BindingResult must be beside @Validated parameter
        //pass a empty object to frontend;
		if (br.hasErrors()){
			//model.addAttribute("user", user);    -> //this statment is not must
			return "rest/user/add"; 
		}
		
        this.userMap.put(user.getId(), user);
		return "redirect:/user/users";

     }
}
