package com.home.factoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void f(){
		h2();
	}

	public static void g(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-factoryMethod.xml");
		Car car1 = (Car) ctx.getBean("car1");
		System.out.println(car1);
	}
	
	public static void h(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-factoryMethod.xml");
		Car car1 = (Car) ctx.getBean("bmwCar");
		System.out.println(car1);
		
		car1 = (Car) ctx.getBean("audiCar");
		System.out.println(car1);
	}
	
	
	public static void h2(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-factoryMethod.xml");
		Car car1 = (Car) ctx.getBean("car4");
		System.out.println(car1);
		
		car1 = (Car) ctx.getBean("car6");
		System.out.println(car1);
	}
}
