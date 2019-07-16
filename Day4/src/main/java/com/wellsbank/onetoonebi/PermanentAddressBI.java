package com.wellsbank.onetoonebi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OOPermanentAddressBI")
public class PermanentAddressBI {

	@Id
	int doorNo;
	String state;
	
	@OneToOne(mappedBy = "address")
	CustomerBI customer;

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public CustomerBI getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerBI customer) {
		this.customer = customer;
	}
	
	
	
}
