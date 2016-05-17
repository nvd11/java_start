package com.home.rest;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;



public class User {
	private int id;
	private String name;
	private String nickName;
	private String email;
	
	@Range(min=1,max=10000,message="id must > 1 and < 10000")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Length(min=3, max=20, message="length of name must in 3 to 20！")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@NotEmpty(message="nickName cannot be empty!")
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	@Email(message="email format is incorrect")
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
