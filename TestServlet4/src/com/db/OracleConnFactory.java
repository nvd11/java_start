package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

import oracle.jdbc.driver.OracleDriver;

public class OracleConnFactory implements DBconnFactory {
	private String ip; 
	private int port;
	private String instanceName;
	private String login; 
	private String passwd;
	
	public OracleConnFactory(String ip, int port, String instanceName, String login, String passwd){
		this.ip = ip;
		this.port = port;
		this.instanceName = instanceName;
		this.login = login;
		this.passwd = passwd;
	}

	@Override
	public Connection getConn() {
		// TODO Auto-generated method stub
		Connection Conn = null;
		String url;
		try{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance(); 
			url = "jdbc:oracle:thin:@" + this.ip + ":" + this.port + ":" + this.instanceName;
			System.out.println(url);
			Conn = DriverManager.getConnection(url,this.login, this.passwd);
			System.out.println("conn successfully!");
		}catch(Exception e){
			e.printStackTrace();
			System.exit(-1);
		}
		return Conn;
	}

}
