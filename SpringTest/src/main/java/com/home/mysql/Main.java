package com.home.mysql;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



class Main {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-configfile.xml");
		
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		
		Connection conn;
		try {
			conn = dataSource.getConnection();
			System.out.println("connection is ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
