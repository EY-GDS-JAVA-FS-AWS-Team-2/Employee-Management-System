package com.example.springbootbackend.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salary")
public class Salary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Monthly_Salary")
	private long salary;
	
	@Column(name="Money_Currency")
	private String currency;
	
	@Column(name="Monthly_Taxes")
	private long tax;
	
	@Column(name="Monthly_Deductions")
	private long deductions;
	
	@Column(name="Monthly_Insurances")
	private long insurance;
	
	@Column(name="ms_From_Date")
	private Date fromDate;
	
	@Column(name="ms_To_Date")
	private Date toDate;
	
	public Salary() {}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public long getTax() {
		return tax;
	}

	public void setTax(long tax) {
		this.tax = tax;
	}

	public long getDeductions() {
		return deductions;
	}

	public void setDeductions(long deductions) {
		this.deductions = deductions;
	}

	public long getInsurance() {
		return insurance;
	}

	public void setInsurance(long insurance) {
		this.insurance = insurance;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Salary(long salary, String currency, long tax, long deductions, long insurance, Date fromDate, Date toDate) {
		super();
		this.salary = salary;
		this.currency = currency;
		this.tax = tax;
		this.deductions = deductions;
		this.insurance = insurance;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	
	
}
