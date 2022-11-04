package com.example.springbootbackend.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="C_First_Name")
	private String cFirstName;
	
	@Column(name="C_Middle_Name")
	private String cMiddleName;
	
	@Column(name="C_Last_Name")
	private String cLastName;
	
	@Column(name="C_Cellular_Phone")
	private String cCellularPhone;
	
	@Column(name="C_Home_Phone")
	private String cHomePhone;
	
	@Column(name="C_City")
	private String cCity;
	
	@Column(name="C_Address")
	private String cAddress;
	
	public Contact()
	{
		
	}
	
	

	public Contact(String cFirstName, String cMiddleName, String cLastName, String cCellularPhone, String cHomePhone,
			String cCity, String cAddress) {
		super();
		this.cFirstName = cFirstName;
		this.cMiddleName = cMiddleName;
		this.cLastName = cLastName;
		this.cCellularPhone = cCellularPhone;
		this.cHomePhone = cHomePhone;
		this.cCity = cCity;
		this.cAddress = cAddress;
	}



	public String getcFirstName() {
		return cFirstName;
	}

	public void setcFirstName(String cFirstName) {
		this.cFirstName = cFirstName;
	}

	public String getcMiddleName() {
		return cMiddleName;
	}

	public void setcMiddleName(String cMiddleName) {
		this.cMiddleName = cMiddleName;
	}

	public String getcLastName() {
		return cLastName;
	}

	public void setcLastName(String cLastName) {
		this.cLastName = cLastName;
	}

	public String getcCellularPhone() {
		return cCellularPhone;
	}

	public void setcCellularPhone(String cCellularPhone) {
		this.cCellularPhone = cCellularPhone;
	}

	public String getcHomePhone() {
		return cHomePhone;
	}

	public void setcHomePhone(String cHomePhone) {
		this.cHomePhone = cHomePhone;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	

	
	
	
	
	

}

