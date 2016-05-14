package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HelloController {
	
	@RequestMapping({"/hello","/"})
	public String hello(){
		System.out.println("hello");
		return "hello";
	}
	
	//this form , the parameter username is must provided. eg. http://localhost:8080/radprod/para?username=jason
	//otherwise, you will get 400 error 
	@RequestMapping("/para")
	public String para(@RequestParam("username") String username){
		System.out.println("para");
		System.out.println("username is:"  + username);
		return "para/para";
	}
	
	//for this form, the parameter is optional provide
	@RequestMapping("/para2")
	public String para2(String username){
		System.out.println("para");
		System.out.println("username is:"  + username);
		return "para/para";
	}
	
	//send parameter to frontend, use model class(Interface)
	@RequestMapping("/para3")
	public String para3(String username, Model model){
		System.out.println("para");
		System.out.println("username is:"  + username);
		model.addAttribute("username",username);  //key is "username", value is username
		
		//default key is the classname of the parameter
		model.addAttribute("Hey Hikki");  //key is "string", value is "Hey Hikki"
		
		return "para/para";
	}
	

}
