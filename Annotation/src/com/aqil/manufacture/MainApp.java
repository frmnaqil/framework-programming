package com.aqil.manufacture;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		// Create IoC Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("AnnotationConfig.xml");
		
		// Get the bean
		Vehicle vehicle = context.getBean("vehicleMotor", Vehicle.class);
		
		VehicleMotor vehicleMotor = context.getBean("vehicleMotor", VehicleMotor.class);
		
		System.out.println(vehicle.getManufacturingStatus());
		System.out.println(vehicleMotor.getElectricResearch().displayResearchStatusStarted());		
		
		// Close IoC container
		context.close();
	}

}
