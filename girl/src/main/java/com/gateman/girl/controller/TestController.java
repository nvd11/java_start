package com.gateman.girl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String sayTest(){
        System.out.println("test!!!");
        return "index";
    }
}
