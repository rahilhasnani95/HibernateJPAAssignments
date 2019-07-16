package com.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DepartmentJPQL")
public class DepartmentJPQL {

	@Id
	private int deptNo;
	private String dName;
	private String loc;
	
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDName() {
		return dName;
	}
	public void setDName(String name) {
		dName = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}


}
