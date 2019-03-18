package com.aqil.manufacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VehicleMotor implements Vehicle {
	
	@Autowired
	private Research electricResearch;
	private String name;
	private int wheel;
	private float engineCapacity;
	private int transmissionGear;
	private int maxSpeed;
	
	public VehicleMotor() {
		
	}

	public VehicleMotor(Research electricResearch) {
		this.electricResearch = electricResearch;
	}

	public Research getElectricResearch() {
		return electricResearch;
	}

	public void setElectricResearch(Research electricResearch) {
		this.electricResearch = electricResearch;
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
