package com.home;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.hello.HelloWorld;
import com.home.hello.Car;
import com.home.hello.Person;
import com.home.hello.RichPerson;
import com.home.factoryBean.FactoryBeanClient;
import com.home.factoryMethod.*;

public class SpringTest {
	

	public static void main(String args[]){
		//Client.f();
		FactoryBeanClient.f();
		
//		String s[] = System.getProperty("java.class.path").split(";");  
//		for (String string : s) {  
//		    System.out.println(string);  
//		}  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void mainf(){
		
		//HelloWorld hd = new HelloWorld();
		
		/* Spring ***************/
		//1. create an IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2 get the bean from IOC container
		HelloWorld hd = (HelloWorld) ctx.getBean("helloWorld");
		hd.hello();
		
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		
		Car car2=(Car) ctx.getBean("car2");
		System.out.println(car2);
		
		Person p = (Person) ctx.getBean("person");
		System.out.println(p);
		
		Person p2 = (Person) ctx.getBean("person2");
		System.out.println(p2);
		
		Person p3 = (Person) ctx.getBean("person3");
		System.out.println(p3);
		
		RichPerson p4 = (RichPerson) ctx.getBean("richPerson");
		System.out.println(p4);
	}

	
	
}
