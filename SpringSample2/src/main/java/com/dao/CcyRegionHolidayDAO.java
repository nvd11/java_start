package com.dao;

import java.util.List;
import com.util.WebUssResult;

import com.model.CcyRegionHoliday;

public interface CcyRegionHolidayDAO {
	List<CcyRegionHoliday> getAllCcyRegionHolidayList();
	WebUssResult addCcyRegionHolidayList(List<CcyRegionHoliday> arrCcyRegionHoliday);
}
