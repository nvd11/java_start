package com.dao;

import java.util.List;

import com.model.Bank;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
	
	@SuppressWarnings("unchecked")
	public List<Bank> getBankList(){
		Session session = this.getSessionFactory().getCurrentSession();
		return session.createQuery("from Bank").list();
				
	}

}
