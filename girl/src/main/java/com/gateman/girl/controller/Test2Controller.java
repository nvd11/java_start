package com.gateman.girl.controller;

import com.gateman.girl.property.GrilProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Test2Controller {

    @Autowired
    private GrilProperty girlProperty;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public GrilProperty say() {
        return girlProperty;
    }

    @RequestMapping(value = "/say2", method = RequestMethod.POST)
    public GrilProperty say2() {
        return girlProperty;
    }
}
