package com.service;

import com.model.Country;
import com.model.Ccy_Region;
import com.dao.CountryDAO;
import com.dao.Ccy_RegionDAO;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public class CountryServiceImpl implements CountryService{
	
	private CountryDAO countryDAO;
	private Ccy_RegionDAO ccy_regionDAO;

	public void setCountryDAO(CountryDAO countryDAO) {
		this.countryDAO = countryDAO;
	}

	public void setCcy_RegionDAO(Ccy_RegionDAO ccy_regionDAO) {
		this.ccy_regionDAO = ccy_regionDAO;
	}

	@Override
	@Transactional
	public boolean addCountry(Country cty) {
		if (null == this.countryDAO){
			return false;
		}
		
		System.out.println("CountryServiceImpl");
		return this.countryDAO.addCountry(cty);
	}
	

	@Override
	@Transactional
	public boolean addCcyRegion(Ccy_Region cr) {
		if (null == this.ccy_regionDAO){
			return false;
		}
		
		System.out.println("Ccy_RegionServiceImpl");
		return this.ccy_regionDAO.addCcyRegion(cr);
	}
}
