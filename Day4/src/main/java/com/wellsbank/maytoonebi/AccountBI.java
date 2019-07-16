package com.wellsbank.maytoonebi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.wellsbank.onetoone.Customer;

@Entity
@Table(name = "MO_AccountBI")
public class AccountBI {

	@Id
	int accountId;
	String accounttype;

	@ManyToOne(cascade=CascadeType.ALL, targetEntity=MOCustomerBI.class)
	@JoinColumn(name="custId")
	MOCustomerBI customer;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public MOCustomerBI getCustomer() {
		return customer;
	}

	public void setCustomer(MOCustomerBI customer) {
		this.customer = customer;
	}

	
	
}