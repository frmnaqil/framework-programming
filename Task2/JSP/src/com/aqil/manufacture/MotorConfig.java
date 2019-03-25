package com.aqil.manufacture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:motor.conf")
public class MotorConfig {
	
	// IoC
	// 1. Create Object
	@Bean
	public Vehicle vehicleMotor() {
		VehicleMotor motor1 = new VehicleMotor();
		return motor1;
	}
	
	// 2. Dependency Injection

}
