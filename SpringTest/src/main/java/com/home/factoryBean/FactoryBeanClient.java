package com.home.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanClient {
	public static void f(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-FactoryBean.xml");
		Car car1 = (Car)ctx.getBean("car1");
		System.out.println(car1);
	}
}
