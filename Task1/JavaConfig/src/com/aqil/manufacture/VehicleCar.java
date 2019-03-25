package com.aqil.manufacture;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class VehicleCar implements Vehicle {
	
	private String name;
	private int wheel;
	private float engineCapacity;
	private int transmissionGear;
	private int maxSpeed;

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
		return "Car Manufacturing Status : Healthy";
		
	}

}
