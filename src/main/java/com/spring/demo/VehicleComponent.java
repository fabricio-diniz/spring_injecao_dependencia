package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleComponent {

	@Autowired
	@Qualifier("bikeBean")
	private Vehicle vehicle;
	
	public void Service() {
		
		vehicle.start();
		vehicle.stop();
	}
}
