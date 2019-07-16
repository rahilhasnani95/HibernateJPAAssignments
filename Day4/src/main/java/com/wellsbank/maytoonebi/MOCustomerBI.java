package com.wellsbank.maytoonebi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MO_CustomerBI")
public class MOCustomerBI {

	
	@Id
	int custId;
	String custName;
	
	@OneToMany(targetEntity = AccountBI.class, mappedBy = "customer")
	List<AccountBI> account;

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

	public List<AccountBI> getAccount() {
		return account;
	}

	public void setAccount(List<AccountBI> account) {
		this.account = account;
	}
	
	
	
}
