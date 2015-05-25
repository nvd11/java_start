package com.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;

import static javax.persistence.GenerationType.*;

@Entity
@Table(name="CCY_REGION_HOLIDAY")
public class CcyRegionHoliday implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator ="seq_ccy_region_holiday_id")
	@SequenceGenerator(name = "seq_ccy_region_holiday_id", sequenceName = "SEQ_CCY_REGION_HOLIDAY")
	@Column(name = "ID")
	private int id;
	
	@Column(name = "CURRENCY", columnDefinition = "nvarchar2")
	private String currency;
	
	@Column(name = "REGION", columnDefinition = "nvarchar2")
	private String region;
	
	@Column(name = "HOLIDAY_DATE")
	private Date holidayDate;
	
	@Column(name = "LOCK_FLAG")
	private boolean lockFlag;
	
	@Column(name = "HOLIDAY_TYPE", columnDefinition = "nvarchar2")
	private String holidayType;
	
	@Column(name = "CREATION_TIME", columnDefinition = "TIMESTAMP WITH TIME ZONE")
	private String creationTime;
	
	@Column(name = "CREATION_STAFFID", columnDefinition = "nvarchar2")
	private String creationStaffId;
	
	@Column(name = "MODIFIED_TIME", columnDefinition = "TIMESTAMP WITH TIME ZONE")
	private String modifiedTime;
	
	@Column(name = "MODIFIED_STAFFID", columnDefinition = "nvarchar2")
	private String modifiedStaffId;

	
	//setter and getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Date getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(Date holidayDate) {
		this.holidayDate = holidayDate;
	}

	public boolean getLockFlag() {
		return lockFlag;
	}

	public void setLockFlag(boolean lockFlag) {
		this.lockFlag = lockFlag;
	}

	public String getHolidayType() {
		return holidayType;
	}

	public void setHolidayType(String holidayType) {
		this.holidayType = holidayType;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getCreationStaffId() {
		return creationStaffId;
	}

	public void setCreationStaffId(String creationStaffId) {
		this.creationStaffId = creationStaffId;
	}

	public String getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getModifiedStaffId() {
		return modifiedStaffId;
	}

	public void setModifiedStaffId(String modifiedStaffId) {
		this.modifiedStaffId = modifiedStaffId;
	}
	
	
	
}
