package com.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("Controller3")
	public String controller3() {
		return "Hello from controller3";
	}
	
}
