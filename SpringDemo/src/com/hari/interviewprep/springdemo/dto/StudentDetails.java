package com.hari.interviewprep.springdemo.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "STUDENT_DETAILS")
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STUDENT_ID")
	private int studendId;

	@Column(name = "STUDENT_NAME")
	private String studentName;

	@ElementCollection(fetch = FetchType.LAZY)
	@JoinTable(name = "USER_ADDRESS", joinColumns = @JoinColumn(name = "STUDENT_ID"))
	private Collection<Address> setOfAddresses = new ArrayList();

	// @ElementCollection
	// @JoinTable(name = "USER_ADDRESS", joinColumns = @JoinColumn(name =
	// "STUDENT_ID"))
	// @GenericGenerator(name = "hilo-gen", strategy = "hilo")
	// @CollectionId(columns = { @Column(name = "ADDRESS_ID") }, generator =
	// "hilo-gen", type = @Type(type = "long"))
	// private Collection<Address> setOfAddresses = new ArrayList();

	// @ElementCollection
	// @JoinTable(name = "USER_ADDRESS", joinColumns = @JoinColumn(name =
	// "STUDENT_ID"))
	// private Set<Address> setOfAddresses = new HashSet();

	public int getStudendId() {
		return studendId;
	}

	public void setStudendId(int studendId) {
		this.studendId = studendId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// public Set<Address> getSetOfAddresses() {
	// return setOfAddresses;
	// }
	// public void setSetOfAddresses(Set<Address> setOfAddresses) {
	// this.setOfAddresses = setOfAddresses;
	// }

	public Collection<Address> getSetOfAddresses() {
		return setOfAddresses;
	}

	public void setSetOfAddresses(Collection<Address> setOfAddresses) {
		this.setOfAddresses = setOfAddresses;
	}

}
