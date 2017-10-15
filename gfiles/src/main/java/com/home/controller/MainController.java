package com.home.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gateman on 17-10-14.
 */
@Controller
public class MainController {
    @RequestMapping({"/hello","/"})
	public String hello(){
		System.out.println("hello");
		return "hello";
	}

}
