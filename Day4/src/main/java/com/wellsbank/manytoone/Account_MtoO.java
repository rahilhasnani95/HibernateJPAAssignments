package com.wellsbank.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "MtoO_Account")
public class Account_MtoO {

	@Id
	int accountId;
	String accountType;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "custId")
	Customer_MtoO customer;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Customer_MtoO getCustomer() {
		return customer;
	}

	public void setCustomer(Customer_MtoO customer) {
		this.customer = customer;
	}
	
	
	
}
