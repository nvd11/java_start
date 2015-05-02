package com.dao;

import java.util.List;
import com.model.CcyRegion;

public interface CcyRegionDAO {
	boolean addCcyRegion(CcyRegion cy);
	List<CcyRegion> getCcyRegionList();
}
