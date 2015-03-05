package com.db;

import java.sql.Connection;
import java.sql.DriverManager;


public class MSSqlConnFactory implements DBconnFactory {
	
	private String ip; 
	private int port;
	private String dbName;
	private String login; 
	private String passwd;
	
	public MSSqlConnFactory(String ip, int port, String dbName, String login, String passwd){
		this.ip = ip;
		this.port = port;
		this.dbName = dbName;
		this.login = login;
		this.passwd = passwd;
	}
	
	@Override
	public Connection getConn(){
		Connection conn = null;
		String DBURL = "jdbc:sqlserver://" + ip + ":" + port 
						+ "; Database=" + dbName;
		
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(DBURL, login, passwd);
			System.out.println("33");
		}catch(Exception e){
			e.printStackTrace();
			System.exit(-1);
		}
		
		return conn;
	}
}
