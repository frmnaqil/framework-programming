package com.aqil.spring.model;

public class VehicleMotor {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getWheel() {
		return wheel;
	}
	public void setWheel(Integer wheel) {
		this.wheel = wheel;
	}
	public Float getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(Float engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public Integer getTransmissionGear() {
		return transmissionGear;
	}
	public void setTransmissionGear(Integer transmissionGear) {
		this.transmissionGear = transmissionGear;
	}
	public Integer getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	private Integer wheel;
	private Float engineCapacity;
	private Integer transmissionGear;
	private Integer maxSpeed;
	
}
