package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(DemoApplication.class, args);
		
		//Para utilizar as implementações do Qualifier basta descomentar o trecho abaixo
		/*
		VehicleComponent vComponent = (VehicleComponent) appContext.getBean("vehicleComponent");
		
		vComponent.Service();
		*/
	}

}
