package com.hari.interviewprep.springdemo.dto;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@DiscriminatorValue(value = "Bike")
@Entity
public class TwoWheeler extends Vehicle {
	@Column(name="STEERING_HANDLE")
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
}
