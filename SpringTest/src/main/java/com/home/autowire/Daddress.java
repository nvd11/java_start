package com.home.autowire;

public class Daddress {
	private String city;
	private String street;
	private int number;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Daddress [city=" + city + ", street=" + street + ", number="
				+ number + "]";
	}

}
