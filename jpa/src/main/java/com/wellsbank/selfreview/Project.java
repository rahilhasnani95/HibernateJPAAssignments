package com.wellsbank.selfreview;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Project {
	
	@Id
	int projectId;
	@Temporal(TemporalType.DATE)
	Calendar dateOfCreation;
	String pmName;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public Calendar getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(Calendar dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public String getPmName() {
		return pmName;
	}
	public void setPmName(String pmName) {
		this.pmName = pmName;
	}
	
	
}
