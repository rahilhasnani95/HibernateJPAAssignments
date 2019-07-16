package com.wellsbank.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TC_EVANGELIST")

public class EvangeList extends Employee_TC {

	private int noOfSessions;

	public int getNoOfSessions() {
		return noOfSessions;
	}

	public void setNoOfSessions(int noOfSessions) {
		this.noOfSessions = noOfSessions;
	}
	
}
