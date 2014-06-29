package com.hari.interviewprep.springdemo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class EmployeeDetails {

	@Id
	@GeneratedValue
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "EMP_NAME")
	private String employeeName;
	@Temporal(TemporalType.DATE)
	@Column(name = "JOINING_DATE")
	private Date joiningDate;
	@Column(name = "EMP_ADDRESS")
	private String employeeAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

}
