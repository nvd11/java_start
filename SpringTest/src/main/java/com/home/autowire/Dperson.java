package com.home.autowire;

public class Dperson {
	private String name;
	private Dcar car;
	private Daddress address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dcar getCar() {
		return car;
	}

	public void setCar(Dcar car) {
		this.car = car;
	}

	public Daddress getAddress() {
		return address;
	}

	public void setAddress(Daddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Dperson [name=" + name + ", car=" + car + ", address="
				+ address + "]";
	}

}
