package com.aqil.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.resource.PathResourceResolver;

import com.aqil.spring.model.VehicleMotor;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/showForm", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("form", "VehicleMotor", new VehicleMotor());
	}
	
	@RequestMapping(value = "/addVehicleMotor", method = RequestMethod.POST)
	public String submit(@Validated @ModelAttribute("VehicleMotor")VehicleMotor motor, 
			BindingResult result, ModelMap model) {
		
		if(result.hasErrors()) {
			return "Error!!!";
		}
		
		model.addAttribute("name", motor.getName());
		model.addAttribute("wheel", motor.getWheel());
		model.addAttribute("engineCapacity", motor.getEngineCapacity());
		model.addAttribute("transmissionGear", motor.getTransmissionGear());
		model.addAttribute("maxSpeed", motor.getMaxSpeed());
		
		return "motorView";
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry
			.addResourceHandler("/resources/**")
			.addResourceLocations("/resources/")
			.setCachePeriod(3600)
			.resourceChain(true)
			.addResolver(new PathResourceResolver());
		
	}

}
