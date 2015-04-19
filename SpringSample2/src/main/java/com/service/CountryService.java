package com.service;

import com.model.Country;
import com.model.Ccy_Region;

public interface CountryService {
	
	boolean addCountry(Country cty);
	boolean addCcyRegion(Ccy_Region cy);
}
