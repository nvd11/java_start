package com.dao;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.CcyRegion;

public class CcyRegionDAOImpl implements CcyRegionDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(final SessionFactory sf){
		this.sessionFactory = sf;
	}

	@SuppressWarnings("unchecked")
	public boolean addCcyRegion(CcyRegion cy) {
		System.out.println("Ccy_RegionDAOImpl");
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(cy);
		return true;
	}


	@SuppressWarnings("unchecked")
	public List<CcyRegion> getCcyRegionList() {
		List<CcyRegion> arrCcyRegion = new ArrayList<CcyRegion>();
		
		arrCcyRegion = this.sessionFactory.getCurrentSession().createQuery("from CcyRegion").list();
		
		return arrCcyRegion;
			
	}

}
