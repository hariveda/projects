package com.hari.interviewprep.springdemo.dto;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@DiscriminatorValue(value = "Car")
@Entity
public class FourWheeler extends Vehicle {
	@Column(name="STEERING_WHEEL")
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
}
