package com.spring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bikeBean")
public class Bike implements Vehicle {

	@Override
	public void start() {

		System.out.println("Inciando bicicleta...");
		
	}

	@Override
	public void stop() {

		System.out.println("Parando bicicleta...");
		
	}

}
