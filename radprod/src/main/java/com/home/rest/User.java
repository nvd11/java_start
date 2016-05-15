package com.home.rest;

public class User {
	private int id;
	private String name;
	private String nickName;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User(){
		
	}
	
	public User(int id, String name, String nickName, String email) {
		super();
		this.id = id;
		this.name = name;
		this.nickName = nickName;
		this.email = email;
	}
	
	
	
}
