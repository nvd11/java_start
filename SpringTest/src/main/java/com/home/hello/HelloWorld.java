package com.home.hello;

public class HelloWorld {

	public HelloWorld() {
		System.out.println("HelloWorld: Constructor is building..");
	}
	
	public String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void hello(){
		System.out.println("Hello: " + name);
	}
	
	
	
}
