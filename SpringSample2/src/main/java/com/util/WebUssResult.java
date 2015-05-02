package com.util;

import java.io.Serializable;
public class WebUssResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int statusCode;
	private String description;
	
	public WebUssResult() {
		
	}
	
	public WebUssResult(int i, String string) {
		// TODO Auto-generated constructor stub
		this.setStatusCode(i);
		this.setDescription(string);
	}

	public int getStatusCode() {
		return statusCode;
	}
	
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

}
