package com.dao;

import java.util.List;


import com.model.CcyRegionHoliday;
import com.util.WebUssResult;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.ConstraintViolationException;


public class CcyRegionHolidayDAOImpl implements CcyRegionHolidayDAO{
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<CcyRegionHoliday> getAllCcyRegionHolidayList() {
		return this.sessionFactory.getCurrentSession().createQuery("from CcyRegionHoliday").list();
	}


	@Override
	public WebUssResult addCcyRegionHolidayList(List<CcyRegionHoliday> arrCcyRegionHoliday) {
		System.out.println("1111");
		Session session = this.sessionFactory.openSession();
		
		CcyRegionHoliday ccyRegionHoliday;
		int count = arrCcyRegionHoliday.size();
		
		if (0 == count){
			return new WebUssResult(1,"no any entries");
		}
		
		for (int i = 0; i < count;i++){
			ccyRegionHoliday = arrCcyRegionHoliday.get(i);
			ccyRegionHoliday.setModifiedStaffId(ccyRegionHoliday.getCreationStaffId());
			session.persist(ccyRegionHoliday);
		}
		
		System.out.println("22222");
		if (null == session.getTransaction()){
			System.out.println("Transaction null@!");
		}else{
			System.out.println(session.getTransaction().isActive());
		}
		
		session.beginTransaction();
		System.out.println(session.getTransaction().isActive());
		System.out.println("33333");
		try{
			session.getTransaction().commit();
		}catch(ConstraintViolationException e){
			e.printStackTrace();
			session.getTransaction().rollback();
			return new WebUssResult(-2,"duplicate unique constraint");
		}
		catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
			return new WebUssResult(-1,"commit error");
		}finally{
			if (false != session.getTransaction().isActive()){
				System.out.println("4444");
				session.getTransaction().rollback();
			}
			System.out.println(session.getTransaction().isActive());
			session.close();
		}
		
		
		return new WebUssResult(0, "commit successfully!");
	}}
