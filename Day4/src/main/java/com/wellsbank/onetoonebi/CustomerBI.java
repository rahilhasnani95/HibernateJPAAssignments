package com.wellsbank.onetoonebi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OOCustomerBI")
public class CustomerBI {

	@Id
	private int custId;
	private String custName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "doorNo")
	PermanentAddressBI address;
	
	public PermanentAddressBI getAddress() {
		return address;
	}
	public void setAddress(PermanentAddressBI address) {
		this.address = address;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
	
}
