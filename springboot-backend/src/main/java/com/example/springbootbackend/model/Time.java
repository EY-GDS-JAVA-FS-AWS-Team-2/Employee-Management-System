package com.example.springbootbackend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "times")
public class Time {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Worked_Hours")
	private int workedhours;
	
	@Column(name = "Off_hours")
	private int offhours;
	
	@Column(name = "Days_Off")
	private int daysoff;
	
	@Column(name = "Over_Time")
	private int overtime;
	
	@Column(name = "Extra_Days")
	private int extradays;
	
	@Column(name = "From_Date")
	private Date fromdate;
	
	@Column(name = "To_Date")
	private Date todate;
	
	public Time()
	{
		
	}
	
	

	public Time(int workedhours, int offhours, int daysoff, int overtime, int extradays, Date fromdate, Date todate) {
		super();
		this.workedhours = workedhours;
		this.offhours = offhours;
		this.daysoff = daysoff;
		this.overtime = overtime;
		this.extradays = extradays;
		this.fromdate = fromdate;
		this.todate = todate;
	}



	public int getWorkedhours() {
		return workedhours;
	}

	public void setWorkedhours(int workedhours) {
		this.workedhours = workedhours;
	}

	public int getOffhours() {
		return offhours;
	}

	public void setOffhours(int offhours) {
		this.offhours = offhours;
	}

	public int getDaysoff() {
		return daysoff;
	}

	public void setDaysoff(int daysoff) {
		this.daysoff = daysoff;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public int getExtradays() {
		return extradays;
	}

	public void setExtradays(int extradays) {
		this.extradays = extradays;
	}

	public Date getFromdate() {
		return fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public Date getTodate() {
		return todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	
	
	

}

