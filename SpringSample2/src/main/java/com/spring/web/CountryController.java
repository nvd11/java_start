package com.spring.web;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.servlet.ServletContext;

import  com.dto.CountryDTO;
import  com.service.CountryService;
import  com.model.Country;
import  com.model.Bank;


@Controller
public class CountryController {
	@Autowired
	private ServletContext context; //use to get real path
	
	private CountryService countryService;

	@Autowired(required = true)
	@Qualifier(value="countryService")
	public void setCountryService(CountryService countryService){
		this.countryService = countryService;
	}
	
	
	
	@RequestMapping(value = "/countryMaintenance", method = RequestMethod.GET)
	public String listenCountryPage(final Model model){
		
		return "mainteinCountry";
	}
	
	@RequestMapping(value =  "/addCountry", method = RequestMethod.PUT)
	public void listenAddCountry(@RequestBody final Country cty){
		System.out.println(cty.getId());
		System.out.println(cty.getName());
		
		if (false == this.countryService.addCountry(cty)){
			System.out.println("DB error");
		}
	}
	
	@RequestMapping(value =  "/GetBankList", method = RequestMethod.GET)
	public @ResponseBody
	List<Bank> ListenGetBankList(){
		
		System.out.println("baaa");
		return this.countryService.getBankList();
	}
	
	@RequestMapping(value = "/testPassPra", method = RequestMethod.POST)
	public String listenTestPassPra(@RequestParam("name") String name, @RequestParam("location") String location, final Model model){
		System.out.println("aaaa");
		System.out.println(name);
		System.out.println(location);
		return "addCountry";
	}
	
	@RequestMapping(value = "/testPassPra2", method = RequestMethod.POST)
	public String listenTestPassPra2(@RequestParam("bankId") List<Integer> idlist, final Model model){
		System.out.println("bbbb");
		System.out.println(idlist.get(0));
		return "addCountry";
	}
	
}
