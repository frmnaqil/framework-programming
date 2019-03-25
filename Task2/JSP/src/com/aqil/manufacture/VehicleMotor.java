package com.aqil.manufacture;

import org.springframework.beans.factory.annotation.Value;

public class VehicleMotor implements Vehicle {
	
	@Value("${motor.name}")
	private String name;
	@Value("${motor.wheel}")
	private int wheel;
	@Value("${motor.engineCapacity}")
	private float engineCapacity;
	@Value("${motor.transmissionGear}")
	private int transmissionGear;
	@Value("${motor.maxSpeed}")
	private int maxSpeed;
	
	public VehicleMotor() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public float getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(float engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public int getTransmissionGear() {
		return transmissionGear;
	}

	public void setTransmissionGear(int transmissionGear) {
		this.transmissionGear = transmissionGear;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String getManufacturingStatus() {
		return "Motor Manufacturing Status : Healthy";
		
	}

}
