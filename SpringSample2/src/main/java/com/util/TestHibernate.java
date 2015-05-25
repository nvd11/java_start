package com.util;

import java.util.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SQLQuery;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.jdbc.Work;

import com.model.*;

public class TestHibernate {
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		try{
			//create session factory base on hibernate.cfg.xml
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory(); 
		}catch(Exception e){
			e.printStackTrace();
		}
		return sessionFactory;
	}

	public static void testSql(Session session){
		List<CcyRegionHoliday> arr = session.createQuery("from CcyRegionHoliday").list();
		System.out.println(arr.size());
	}
	
	public static void testSql2(Session session){
		List<Integer> arr = session.createSQLQuery("select distinct  to_number(to_char(holiday_date, 'yyyy')) from ccy_region_holiday").list();
		System.out.println(arr.size());
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
	}
	
	public static void testSql3(Session session){
		Date dateHead = Date.valueOf("2015-03-01");
		Date dateTail = Date.valueOf("2015-03-31");
		int errCode = 2;
		
		String sqlstr = "{call USP_DEL_MONTHLY_HOLIDAY(?,?,?,?)}";
		SQLQuery sqlQuery = session.createSQLQuery(sqlstr);
		//sqlQuery.setString(0, "HKD");
		//sqlQuery.setString(1, "HK2");
		//sqlQuery.setDate(2, dateHead);
		//sqlQuery.setDate(3, dateTail);
		
		sqlQuery.setParameter(0, "HKD");
		sqlQuery.setParameter(1, "HK2");
		sqlQuery.setParameter(2, dateHead);
		sqlQuery.setParameter(3, dateTail);
		
		System.out.println("1");
		
		sqlQuery.executeUpdate();
		
		System.out.println("2");
		List arr = sqlQuery.list();
		
		System.out.println("3");
		System.out.println(arr.size());
		
	}
	
	public static void testSql4(Session session){
	    session.doWork(new Work() {  
            @Override  
            public void execute(Connection conn) throws SQLException {  
            	Date dateHead = Date.valueOf("2015-03-01");
        		Date dateTail = Date.valueOf("2015-03-31");
        		
        		CallableStatement sqlQuery= conn.prepareCall("{call USP_DEL_MONTHLY_HOLIDAY(?,?,?,?,?)}");
        		sqlQuery.registerOutParameter(1, OracleTypes.NUMBER);
        		sqlQuery.setString(2, "HKD");
        		sqlQuery.setString(3, "HK2");
        		sqlQuery.setDate(4, dateHead);
        		sqlQuery.setDate(5, dateTail);
        		sqlQuery.executeQuery();
        		
        		java.math.BigDecimal err_code = (java.math.BigDecimal) sqlQuery.getObject(1);
        		System.out.println(err_code);
            }
        });
	}
	
	public static void main(String[] args){
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		testSql4(session);
	
		session.getTransaction().commit();
		
	}
	
}
