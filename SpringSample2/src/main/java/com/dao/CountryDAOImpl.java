package com.dao;

import com.model.Country;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


@Repository
public class CountryDAOImpl implements CountryDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(final SessionFactory sf){
		this.sessionFactory = sf;
	}

	@SuppressWarnings("unchecked")
	public boolean addCountry(Country cty) {
		System.out.println("CountryDAOimpl");
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(cty);
		// TODO Auto-generated method stub
		return true;
	}

}
