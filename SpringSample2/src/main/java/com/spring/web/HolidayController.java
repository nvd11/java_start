package com.spring.web;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired; //auto bind the service ojbect
import org.springframework.beans.factory.annotation.Qualifier;

import com.model.CcyRegionHoliday;
import com.service.CcyRegionHolidayService;
import com.util.WebUssResult;

import javax.servlet.ServletContext;

@Controller
public class HolidayController {
	
	@Autowired
	private ServletContext context;

	private CcyRegionHolidayService ccyRegionHolidayService;

	@Autowired(required = true)
	@Qualifier(value="ccyRegionHolidayService")
	public void setCcyRegionHolidayService(CcyRegionHolidayService ccyRegionHolidayService) {
		this.ccyRegionHolidayService = ccyRegionHolidayService;
	}
	
	
	@RequestMapping(value = "/getAllCcyRegionHolidayList", method = RequestMethod.GET)
	public @ResponseBody 
	List<CcyRegionHoliday> listenGetAllCcyRegionHolidayList(){
		return this.ccyRegionHolidayService.getAllCcyRegionHolidayList();
	}
	
	
	@RequestMapping(value = "/addCcyRegionHolidayList", method = RequestMethod.POST)
	public @ResponseBody 
	WebUssResult listenAddCcyRegionHolidayList(@RequestBody final List<CcyRegionHoliday> arrCcyRegionHoliday){
		return this.ccyRegionHolidayService.addCcyRegionHolidayList(arrCcyRegionHoliday);
	}
}

