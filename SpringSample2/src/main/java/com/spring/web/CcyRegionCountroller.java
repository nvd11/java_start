package com.spring.web;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.servlet.ServletContext;

import  com.service.CountryService;
import  com.model.CcyRegion;

@Controller
public class CcyRegionCountroller {
	@Autowired
	private ServletContext context;
	
	private CountryService countryService;
	
	@Autowired(required = true)
	@Qualifier(value="countryService")
	public void setCountryService(CountryService countryService){
		this.countryService = countryService;
	}
	
	@RequestMapping(value = "/addCcyRegion", method = RequestMethod.PUT)
	public void listenAddCcyRegion(@RequestBody final CcyRegion cy){
		System.out.println(cy.getCurrency());
		System.out.println(cy.getRegion());
		
		if (false == this.countryService.addCcyRegion(cy)){
			System.out.println("DB error");
		}
	}
	
	@RequestMapping(value = "/getCcyRegionList", method = RequestMethod.GET)
	public @ResponseBody 
	List<CcyRegion> listenGetRegionList(){
		List<CcyRegion> listCcyRegionList = this.countryService.getCcyRegionList();
		return listCcyRegionList;
	}

}
