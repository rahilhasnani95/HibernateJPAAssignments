package com.wellsbank.manytomanyuni;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MtoM_JointAccountHolder")
public class JointAccountHolder {

	@Id
	int customerId;
	String name;
	
	@ManyToMany(targetEntity = Account_MtoM.class, cascade = CascadeType.ALL)
	@JoinTable(name = "Holder")
	List<Account_MtoM> account;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account_MtoM> getAccount() {
		return account;
	}

	public void setAccount(List<Account_MtoM> account) {
		this.account = account;
	}
	
	
}
