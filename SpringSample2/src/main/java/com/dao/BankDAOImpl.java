package com.dao;

import java.util.List;
import java.util.ArrayList;

import com.model.Bank;
import com.service.CountryService;
import com.util.ApplicationContextHandle;
import com.util.WebUssResult;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.TestStateMachine;

public class BankDAOImpl implements BankDAO {
	
	private SessionFactory sessionFactory;

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
    private CountryService countryService;
	
	@SuppressWarnings("unchecked")
	public List<Bank> getBankList(){
		//addBank();
		//checkStateMachine();
		System.out.println("getBankList");
		this.countryService = (CountryService)ApplicationContextHandle.getBean("countryService");  
		System.out.println(countryService.getTestStr());
		
		Session session = this.getSessionFactory().getCurrentSession();
		//return session.createQuery("from Bank").list();
		return new ArrayList<Bank>();
				
	}
	
	public WebUssResult addBank(){
		Session session = this.getSessionFactory().getCurrentSession();
		//System.out.println(BankDAOImpl.class.getClassLoader().getResource("com/dao/234.xml").getFile().toString());
		//System.out.println(BankDAOImpl.class.getClassLoader().getResource("../web.xml").getFile().toString());
		System.out.println("12345");
		System.out.println(BankDAOImpl.class.getClassLoader().getResource("/").getPath());
		System.out.println("66");
		TestStateMachine tsm = new TestStateMachine();
		
		System.out.println(tsm.getCurrentState().getId());
		tsm.fireEvent("atm.connected");
		tsm.fireEvent("atm.loadSuccess");
		System.out.println(tsm.getCurrentState().getId());
		
		Bank b = new Bank();
		b.setName("DDD");
		b.setDescription("descpton");
		b.setScxml(tsm.getEngine().getStateMachine());
		tsm.getCurrentState().setId("idle");
		System.out.println(tsm.getCurrentState().getId());

		session.persist(b);
		
		return new WebUssResult(0,"");
	}

	public void checkStateMachine(){
		Session session = this.getSessionFactory().getCurrentSession();
		List<Bank> arrBank = session.createQuery("from Bank where name=?").setParameter(0, "EEE").list();
		Bank b = arrBank.get(0);
		TestStateMachine tsm = new TestStateMachine();
		tsm.getEngine().setStateMachine(b.getScxml());
		
		System.out.println(tsm.getCurrentState().getId());
		
		System.out.println(b.getName());
	}
}
