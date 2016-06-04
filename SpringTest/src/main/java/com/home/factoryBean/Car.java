package com.home.factoryBean;

public class Car {
	private int id;
	private String name;
	private int price;

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	public Car(){
		
	}

	public Car(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
