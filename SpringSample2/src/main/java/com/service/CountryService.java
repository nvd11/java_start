package com.service;

import com.model.Country;
import com.model.CcyRegion;
import com.model.Bank;

import java.util.List;

public interface CountryService {
	
	boolean addCountry(Country cty);
	boolean addCcyRegion(CcyRegion cy);
	List<CcyRegion> getCcyRegionList();
	List<Bank> getBankList();
	String getTestStr();
}
