package com.model;

import java.io.Serializable;

//this class just be used as the composite-id of the class "Ccy_Region"
public class PkCcyRegion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String currency;
	private String region;
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	@Override
	public boolean equals(Object other){
		if (this == other){
			return true;
		}
		
		if (null == other){
			return false;
		}
		
		if (!(other instanceof CcyRegion)){
			return false;
		}
		
		CcyRegion crOther = (CcyRegion)other;
		if (this.getCurrency().equals(crOther.getCurrency()) && this.getRegion().equals(crOther.getRegion())){
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode(){
		return this.getCurrency().hashCode() * this.getRegion().hashCode();
	}
}
