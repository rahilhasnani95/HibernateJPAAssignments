package com.wellsbank.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TC_LOAN")

public class LoanAcount_TC extends Account_TC {

	double loanAmount;

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	
	
}
