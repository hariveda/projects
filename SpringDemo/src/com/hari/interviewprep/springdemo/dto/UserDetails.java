package com.hari.interviewprep.springdemo.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@NamedQuery(name = "UserDetails.byId", query = "from UserDetails where userId = ?")
@NamedNativeQuery(name = "UserDetails.byName", query = "select * from user_details where user_name = ?", resultClass = UserDetails.class)
@Table(name = "USER_DETAILS")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "USER_NAME")
	private String userName;

	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "street", column = @Column(name = "USER_HOME_STREET")),
			@AttributeOverride(name = "city", column = @Column(name = "USER_HOME_CITY")),
			@AttributeOverride(name = "state", column = @Column(name = "USER_HOME_STATE")),
			@AttributeOverride(name = "pincode", column = @Column(name = "USER_HOME_PINCODE")) })
	private Address homeAddress;
	@Embedded
	private Address officeAddress;

	// @OneToOne
	// @JoinColumn(name="USER_VEHICLE_ID")
	// private Vehicle vehicle;

	// @OneToMany
	// @JoinTable(joinColumns=@JoinColumn(name="USER_ID"),
	// inverseJoinColumns=@JoinColumn(name="USER_VEHICLE_ID"))
	// private Collection<Vehicle> vehicleColl = new ArrayList<Vehicle>();

	// @OneToMany(mappedBy="user")
	// private Collection<Vehicle> vehicleColl = new ArrayList<Vehicle>();

	@ManyToMany
	private Collection<Vehicle> vehicleColl = new ArrayList<Vehicle>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Collection<Vehicle> getVehicleColl() {
		return vehicleColl;
	}

	public void setVehicleColl(Collection<Vehicle> vehicleColl) {
		this.vehicleColl = vehicleColl;
	}

	// public Vehicle getVehicle() {
	// return vehicle;
	// }
	//
	// public void setVehicle(Vehicle vehicle) {
	// this.vehicle = vehicle;
	// }

}
