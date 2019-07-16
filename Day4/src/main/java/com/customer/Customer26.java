package com.customer;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Customer26")
@NamedQuery(name = "custdetailswithT", query = "select c from Customer26 c where c.name like 'T%'")

@NamedQueries({
	@NamedQuery(name = "deletecustwithid", query = "delete from Customer26 c where c.customerId=?1"),
	@NamedQuery(name = "retreivecust", query = "select c from Customer26 c")
})
public class Customer26 {

	@Id
	int customerId;
	String name;
	char gender;
	String address;
	String city;
	String state;
	int pin;
	String telePhone;
	String fax;
	String eMail;
	Date dateOfBirth;
	String userId;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return this.gender;
	}
	public void setAddress(String address)
	{ this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
	public void setCity(String city) {
		this.city = city;

	}
	public String getCity() {
		return this.city;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return this.state;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getPin() {
		return this.pin;
	}
	public void setTelePhone(String telePhone)
	{ this.telePhone = telePhone;
	}
	public String getTelePhone() {
		return this.telePhone;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getFax() {
		return this.fax;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}

