


package com.gateman.girl.controller;

import com.gateman.girl.property.GrilProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${content}")
    private String content;

    @Autowired
    private GrilProperty girlProperty;

    @GetMapping(value = "/hello")
    public String say(){
        return "Hello Spring Boot!";
    }

    @GetMapping(value = "/cup")
    public String sayCup(){
        return cupSize;
    }

    @GetMapping(value = "/content")
    public String sayContent(){
        return content;
    }

    @GetMapping(value = "/getGirl")
    public String sayGril(){
        return girlProperty.toString();
    }


}
