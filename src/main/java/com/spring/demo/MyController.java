package com.spring.demo;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String Hello() {
		
		System.out.println("Entrei neste método");
		
		return "Hello world!";
	}
}
