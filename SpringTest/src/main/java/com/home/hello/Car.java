package com.home.hello;

public class Car {
	private String brand;
	private String location;
	private int price;
	private int maxSpeed;
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Car(String brand, String location, int price) {
		super();
		this.brand = brand;
		this.location = location;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", location=" + location + ", price="
				+ price + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
	
}

