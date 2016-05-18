package com.home;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.hello.HelloWorld;

public class SpringTest {
	
	public static void main(String[] args){
		
		//HelloWorld hd = new HelloWorld();
		
		/* Spring ***************/
		//1. create an IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2 get the bean from IOC container
		HelloWorld hd = (HelloWorld) ctx.getBean("helloWorld");
		
		hd.hello();
	}

	
	
}
