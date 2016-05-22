package com.home.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dmain {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-autowire.xml");
		
		Dperson p1 = (Dperson) ctx.getBean("person1");
		Dperson p2 = (Dperson) ctx.getBean("person2");
		Dperson p3 = (Dperson) ctx.getBean("person3");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}
}
