package com.wellsbank.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TC_SAVINGS")
public class SavingsAccount_TC extends Account_TC {

	double minBalance;

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	
}
