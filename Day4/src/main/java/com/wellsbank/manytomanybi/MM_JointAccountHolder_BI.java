package com.wellsbank.manytomanybi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "MM_JOINTACCOUNTHOLDER_BI")
public class MM_JointAccountHolder_BI {

	@Id
	int customerId;
	double balance;
	
	@ManyToMany(cascade=CascadeType.ALL, targetEntity=MM_Account_BI.class)
	@JoinTable(name="MM_Holder_BI")
	List<MM_Account_BI> account;


	public List<MM_Account_BI> getAccount() {
		return account;
	}
	public void setAccount(List<MM_Account_BI> account) {
		this.account = account;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance)
	{ this.balance = balance;
	}


}
