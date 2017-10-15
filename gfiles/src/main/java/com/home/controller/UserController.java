package com.home.controller;

import com.home.model.GFileUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Created by gateman on 17-10-15.
 */
@Controller
public class UserController {

	public static Log logging = LogFactory.getLog(UserController.class);

    @RequestMapping("/TestUser")
	public @ResponseBody GFileUser hello(){
		System.out.println("hello");
		logging.info("Test for commons logging!");
		GFileUser user = new GFileUser(1, "jack");
		return user;
	}
}
