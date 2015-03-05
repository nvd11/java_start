package com.db;

import java.sql.Connection;

public interface DBconnFactory {
	
	Connection getConn();
}
