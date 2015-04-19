package com.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.IdClass;


@Entity
@Table(name = "CCY_REGION")
@IdClass(Pk_Ccy_Region.class)
public class Ccy_Region implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String currency;
	private String region;
	
	@Id
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	@Id
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
