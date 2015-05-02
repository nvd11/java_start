package com.service;

import java.util.List;

import com.model.CcyRegionHoliday;
import com.util.WebUssResult;
import com.dao.CcyRegionHolidayDAO;

import org.springframework.transaction.annotation.Transactional;

public class CcyRegionHolidayServiceImpl implements CcyRegionHolidayService{
	
	private CcyRegionHolidayDAO ccyRegionHolidayDAO;

	public void setCcyRegionHolidayDAO(CcyRegionHolidayDAO ccyRegionHolidayDAO) {
		this.ccyRegionHolidayDAO = ccyRegionHolidayDAO;
	}

	@Override
	@Transactional
	public List<CcyRegionHoliday> getAllCcyRegionHolidayList() {
		return this.ccyRegionHolidayDAO.getAllCcyRegionHolidayList();
	}

	@Override
	public WebUssResult addCcyRegionHolidayList(List<CcyRegionHoliday> arrCcyRegionHoliday) {
		// TODO Auto-generated method stub
		return this.ccyRegionHolidayDAO.addCcyRegionHolidayList(arrCcyRegionHoliday);
	}

}
