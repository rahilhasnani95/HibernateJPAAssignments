package com.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeJPQL")
public class EmployeeJPQL {

	@Id
	private int empNo;
	private String eName;
	private String job;
	private int mgr;
	private String hireDate;
	private int sal;
	private int comm;
	private int deptNo;
	
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEName() {
		return eName;
	}
	public void setEName(String name) {
		eName = name;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate)
	{ 
		this.hireDate = hireDate;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}


}
