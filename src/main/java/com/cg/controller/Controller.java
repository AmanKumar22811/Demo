package com.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/controller1")
	public String controller1() {
		return "Hello from controller1";
	}
    @GetMapping("/controller2")
    public String controller2(){
        return "Hello from controller2";
    }
    @GetMapping("/controller3")
	public String controller3() {
		return "Hello from controller3";
	}
    
   @GetMapping("/disha")
   public String disha() {
	   return "Hello from Disha";
   }
	
}
