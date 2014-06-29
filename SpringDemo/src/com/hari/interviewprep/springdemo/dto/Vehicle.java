package com.hari.interviewprep.springdemo.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
// @Table(name = "VEHICLE")
//@Table(name = "VEHICLE2")
//@Table(name = "VEHICLE3")
@Table(name = "VEHICLE4")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "VEHICLE_TYPE", discriminatorType = DiscriminatorType.STRING)
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "VEHICLE_ID")
	private int vehicleId;
	@Column(name = "VEHICLE_NAME")
	private String vehicleName;

	// @ManyToOne
	// @JoinColumn(name="USER_ID")
	// private UserDetails user;

	// @ManyToMany(mappedBy = "vehicleColl")
	// private Collection<UserDetails> userColl = new ArrayList<UserDetails>();

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	// public UserDetails getUser() {
	// return user;
	// }
	//
	// public void setUser(UserDetails user) {
	// this.user = user;
	// }

	// public Collection<UserDetails> getUserColl() {
	// return userColl;
	// }
	//
	// public void setUserColl(Collection<UserDetails> userColl) {
	// this.userColl = userColl;
	// }

}
