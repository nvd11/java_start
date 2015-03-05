package com.common;

import java.sql.Connection;
import com.db.*;

public class GlobalVar {
	private static Connection conn = null;
	
	public static Connection getConn(){
		if (null != conn){
			return conn;
		}
		
		//DBconnFactory dbFact = new MSSqlConnFactory("192.168.1.110",1433,"master", "nvd11","32565624");
		DBconnFactory dbFact = new OracleConnFactory("192.168.1.109",1521,"orcl", "bill","32565624");
		return dbFact.getConn();
	}
}
