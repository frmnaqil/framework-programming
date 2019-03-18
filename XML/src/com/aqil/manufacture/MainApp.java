package com.aqil.manufacture;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {

		// -----IoC using Resource - XMLBeanFactory-----
		// 1. Load Configuration as resource
		Resource resource = new ClassPathResource("XmlBeanFactoryConfig.xml");
		
		// 2. Create Factory
		BeanFactory factory = new XmlBeanFactory(resource);
		
		// 3. Get Objects from Factory
		VehicleMotor motor1 = (VehicleMotor) factory.getBean("motor1");
		
		System.out.println("Motor 1 name : " + motor1.getName());
		System.out.println(motor1.getName() + " Motor 1 wheel : " + motor1.getWheel());
		System.out.println(motor1.getName() + " Motor 1 engine capacity in cc : " + motor1.getEngineCapacity());
		System.out.println(motor1.getName() + " Motor 1 transmission gear : " + motor1.getTransmissionGear());
		System.out.println(motor1.getName() + " Motor 1 maximum speed : " + motor1.getMaxSpeed());
		
		VehicleCar car1 = factory.getBean("car1",VehicleCar.class);
		
		System.out.println("Car 1 name : " + car1.getName());
		System.out.println(car1.getName() + " wheel : " + car1.getWheel());
		System.out.println(car1.getName() + " Car 1 engine capacity in cc : " + car1.getEngineCapacity());
		System.out.println(car1.getName() + " Car 1 transmission gear : " + car1.getTransmissionGear());
		System.out.println(car1.getName() + " Car 1 maximum speed : " + car1.getMaxSpeed());
		
		// -----IoC using XMLApplicationContext and Dependency Injection-----
		
		// Crete IoC container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("XmlApplicationContextConfig.xml");
		
		// Retrieve bean objects
		Vehicle vehicle = context.getBean("motorBean",Vehicle.class);
		
		vehicle.getManufacturingStatus();
		
		VehicleMotor motor2 = (VehicleMotor) vehicle;
		System.out.println("Motor 2 name : " + motor2.getName());
		System.out.println(motor2.getName() + " wheel : " + motor2.getWheel());
		System.out.println(motor2.getName() + " engine capacity in cc : " + motor2.getEngineCapacity());
		System.out.println(motor2.getName() + " transmission gear : " + motor2.getTransmissionGear());
		System.out.println(motor2.getName() + " maximum speed : " + motor2.getMaxSpeed());
		System.out.println(motor2.getName() + " " + motor2.getElectricResearch().displayResearchStatusStopped());
		
		// Close IoC container
		context.close();
	}

}
