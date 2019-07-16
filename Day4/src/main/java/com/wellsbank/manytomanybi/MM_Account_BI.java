package com.wellsbank.manytomanybi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MM_ACCOUNT_BI")
public class MM_Account_BI {

	@Id
	int accountId;
	@ManyToMany(targetEntity=MM_JointAccountHolder_BI.class, mappedBy="account")

	List<MM_JointAccountHolder_BI> joint;
	
	public int getAccountId() {
	return accountId;
	}
	public void setAccountId(int accountId) {
	this.accountId = accountId;
	}
	public List<MM_JointAccountHolder_BI> getJoint() {
		return joint;
	}
	public void setJoint(List<MM_JointAccountHolder_BI> joint) {
		this.joint = joint;
	}
	
	
}
