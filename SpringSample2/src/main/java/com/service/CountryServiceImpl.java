package com.service;

import java.util.List;

import com.model.Country;
import com.model.CcyRegion;
import com.model.Bank;
import com.dao.CountryDAO;
import com.dao.CcyRegionDAO;
import com.dao.BankDAO;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public class CountryServiceImpl implements CountryService{
	
	private CountryDAO countryDAO;
	private CcyRegionDAO ccyRegionDAO;
	private BankDAO bankDAO;

	public void setCountryDAO(CountryDAO countryDAO) {
		this.countryDAO = countryDAO;
	}

	public void setBankDAO(BankDAO bankDAO) {
		this.bankDAO = bankDAO;
	}

	public void setCcyRegionDAO(CcyRegionDAO ccyRegionDAO) {
		this.ccyRegionDAO = ccyRegionDAO;
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
	public boolean addCcyRegion(CcyRegion cr) {
		if (null == this.ccyRegionDAO){
			return false;
		}
		
		System.out.println("CcyRegionServiceImpl");
		return this.ccyRegionDAO.addCcyRegion(cr);
	}
	
	@Override
	@Transactional
	public List<CcyRegion> getCcyRegionList(){
		return this.ccyRegionDAO.getCcyRegionList();
	}
	
	
	@Override
	@Transactional
	public List<Bank> getBankList(){
		return this.bankDAO.getBankList();
	}

	@Override
	public String getTestStr() {
		return "testStrlar";
	}
	
}
