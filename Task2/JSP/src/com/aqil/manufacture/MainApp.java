package com.aqil.manufacture;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		// Create IoC Container
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MotorConfig.class);
		
		// Get bean object
		VehicleMotor vehicleMotor = context.getBean("vehicleMotor", VehicleMotor.class);
		
		// use bean object
		System.out.println(vehicleMotor.getManufacturingStatus());
		System.out.println("Vehicle Name : " + vehicleMotor.getName());
		System.out.println(vehicleMotor.getName() + " wheel : " + vehicleMotor.getWheel());
		System.out.println(vehicleMotor.getName() + " engine capacity in cc : " + vehicleMotor.getEngineCapacity());
		System.out.println(vehicleMotor.getName() + " transmission gear : " + vehicleMotor.getTransmissionGear());
		System.out.println(vehicleMotor.getName() + " maximum speed : " + vehicleMotor.getMaxSpeed());
		
		
		// Close IoC container
		context.close();
	}

}
