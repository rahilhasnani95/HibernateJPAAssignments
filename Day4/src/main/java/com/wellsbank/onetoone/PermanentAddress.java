package com.wellsbank.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OneToOne_PERM_ADDRESS")
public class PermanentAddress {

	@Id
	int doorNo;
	String state;
	
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
