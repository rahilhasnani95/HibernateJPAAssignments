package com.wellsbank.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TC_TECHASSOCIATE")

public class TechAssociate extends Employee_TC{

	private int noOfLabs;

	public int getNoOfLabs() {
		return noOfLabs;
	}

	public void setNoOfLabs(int noOfLabs) {
		this.noOfLabs = noOfLabs;
	}
	
}
