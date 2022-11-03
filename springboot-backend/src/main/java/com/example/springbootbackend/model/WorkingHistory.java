package com.example.springbootbackend.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="workinghistory")
public class WorkingHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Company_Name")
	private String companyName;
	
	@Column(name="Employer_Name")
	private String employerName;
	
	@Column(name="Company_Employer_Address")
	private String companyEmployerAddress;
	
	@Column(name="Company_Employer_Cellular_Phone")
	private String companyEmployerCellularPhone;
	
	@Column(name="Company_Employer_Office_Phone")
	private String companyEmployerOfficePhone;
	
	@Column(name="Previous_Qualification")
	private String previousQualification;
	
	@Column(name="Previous_Experience")
	private String previousExperience;
	
	@Column(name = "p_Start_Date")
	private Date startDate;
	
	@Column(name = "p_End_Date")
	private Date endDate;
	
	public WorkingHistory() {
		
	}
	
	public WorkingHistory(String companyName, String employerName, String companyEmployerAddress,
			String companyEmployerCellularPhone, String companyEmployerOfficePhone, String previousQualification,
			String previousExperience, Date startDate, Date endDate) {
		this.companyName = companyName;
		this.employerName = employerName;
		this.companyEmployerAddress = companyEmployerAddress;
		this.companyEmployerCellularPhone = companyEmployerCellularPhone;
		this.companyEmployerOfficePhone = companyEmployerOfficePhone;
		this.previousQualification = previousQualification;
		this.previousExperience = previousExperience;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getCompanyEmployerAddress() {
		return companyEmployerAddress;
	}

	public void setCompanyEmployerAddress(String companyEmployerAddress) {
		this.companyEmployerAddress = companyEmployerAddress;
	}

	public String getCompanyEmployerCellularPhone() {
		return companyEmployerCellularPhone;
	}

	public void setCompanyEmployerCellularPhone(String companyEmployerCellularPhone) {
		this.companyEmployerCellularPhone = companyEmployerCellularPhone;
	}

	public String getCompanyEmployerOfficePhone() {
		return companyEmployerOfficePhone;
	}

	public void setCompanyEmployerOfficePhone(String companyEmployerOfficePhone) {
		this.companyEmployerOfficePhone = companyEmployerOfficePhone;
	}

	public String getPreviousQualification() {
		return previousQualification;
	}

	public void setPreviousQualification(String previousQualification) {
		this.previousQualification = previousQualification;
	}

	public String getPreviousExperience() {
		return previousExperience;
	}

	public void setPreviousExperience(String previousExperience) {
		this.previousExperience = previousExperience;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
	
	
	

}
