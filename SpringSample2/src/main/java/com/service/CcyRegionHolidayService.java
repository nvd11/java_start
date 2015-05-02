package com.service;

import com.model.CcyRegionHoliday;
import com.util.WebUssResult;

import java.util.List;

public interface CcyRegionHolidayService {
	List<CcyRegionHoliday> getAllCcyRegionHolidayList();
	WebUssResult addCcyRegionHolidayList(List<CcyRegionHoliday> arrCcyRegionHoliday);
}
