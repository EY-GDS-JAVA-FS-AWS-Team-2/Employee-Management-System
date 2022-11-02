package com.example.springbootbackend.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="holidays")
public class Holiday {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Holiday")
	private String holiday;
	
	@Column(name = "h_From_Date")
	private Date holidayFromDate;
	
	@Column(name = "h_To_Date")
	private Date holidayToDate;

	public Holiday() {}
	
	public Holiday(String holiday, Date holidayFromDate, Date holidayToDate) {
		this.holiday = holiday;
		this.holidayFromDate = holidayFromDate;
		this.holidayToDate = holidayToDate;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getHoliday() {
		return holiday;
	}


	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}


	public Date getHolidayFromDate() {
		return holidayFromDate;
	}


	public void setHolidayFromDate(Date holidayFromDate) {
		this.holidayFromDate = holidayFromDate;
	}


	public Date getHolidayToDate() {
		return holidayToDate;
	}


	public void setHolidayToDate(Date holidayToDate) {
		this.holidayToDate = holidayToDate;
	}
	
	
	
	

}
