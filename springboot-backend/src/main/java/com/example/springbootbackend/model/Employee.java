package com.example.springbootbackend.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Personal_ID_Number")
	private long personalIDNumber;
	
	@Column(name = "First_Name")
	private String firstName;
	
	@Column(name = "Middle_Name")
	private String middleName;
	
	@Column(name = "Last_Name")
	private String lastName;
	
	@Column(name = "Date_of_Birth")
	private Date dateofBirth;
	
	@Column(name = "Email_id")
	private String emailId;
	
	@Column(name = "Cellular_Phone")
	private String cellularPhone;
	
	@Column(name = "Home_Phone")
	private String homePhone;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name="Postal_Code")
	private long postalCode;
	
	@Column(name="Qualification")
	private String qualification;
	
	@Column(name="Current_Experience")
	private String currentExperience;
	
	@Column(name = "Start_Date")
	private Date startDate;
	
	@Column(name = "End_Date")
	private Date endDate;
	
	@Column(name="Type_of_Employee")
	private String typeofEmployee;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Marital_Status")
	private String maritalStatus;
	
	
	
	public Employee() {}


	public Employee(long personalIDNumber, String firstName, String middleName, String lastName, Date dateofBirth,
			String emailId, String cellularPhone, String homePhone, String city, String address, long postalCode,
			String qualification, String currentExperience, Date startDate, Date endDate, String typeofEmployee,
			String gender, String maritalStatus) {
		this.personalIDNumber = personalIDNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.emailId = emailId;
		this.cellularPhone = cellularPhone;
		this.homePhone = homePhone;
		this.city = city;
		this.address = address;
		this.postalCode = postalCode;
		this.qualification = qualification;
		this.currentExperience = currentExperience;
		this.startDate = startDate;
		this.endDate = endDate;
		this.typeofEmployee = typeofEmployee;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public long getPersonalIDNumber() {
		return personalIDNumber;
	}



	public void setPersonalIDNumber(long personalIDNumber) {
		this.personalIDNumber = personalIDNumber;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getMiddleName() {
		return middleName;
	}



	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Date getDateofBirth() {
		return dateofBirth;
	}



	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getCellularPhone() {
		return cellularPhone;
	}



	public void setCellularPhone(String cellularPhone) {
		this.cellularPhone = cellularPhone;
	}



	public String getHomePhone() {
		return homePhone;
	}



	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public long getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}



	public String getQualification() {
		return qualification;
	}



	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	public String getCurrentExperience() {
		return currentExperience;
	}



	public void setCurrentExperience(String currentExperience) {
		this.currentExperience = currentExperience;
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



	public String getTypeofEmployee() {
		return typeofEmployee;
	}



	public void setTypeofEmployee(String typeofEmployee) {
		this.typeofEmployee = typeofEmployee;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getMaritalStatus() {
		return maritalStatus;
	}



	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	

	
	
	
	
	

}
