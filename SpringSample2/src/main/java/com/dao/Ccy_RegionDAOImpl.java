package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Ccy_Region;

public class Ccy_RegionDAOImpl implements Ccy_RegionDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(final SessionFactory sf){
		this.sessionFactory = sf;
	}

	@SuppressWarnings("unchecked")
	public boolean addCcyRegion(Ccy_Region cy) {
		System.out.println("Ccy_RegionDAOImpl");
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(cy);
		return true;
	}

}
