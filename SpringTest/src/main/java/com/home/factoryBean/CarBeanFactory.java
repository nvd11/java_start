package com.home.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class CarBeanFactory implements FactoryBean<Car>{
	
	private int id;
	private String brand;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public Car getObject() throws Exception {
		return new Car(id, brand, 0);
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
