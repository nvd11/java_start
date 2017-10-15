package com.home.controller;

import com.home.model.GFileUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gateman on 17-10-15.
 */
@Controller
public class UserController {
    @RequestMapping("/TestUser")
	public @ResponseBody GFileUser hello(){
		System.out.println("hello");
		GFileUser user = new GFileUser(1, "jack");
		return user;
	}
}
