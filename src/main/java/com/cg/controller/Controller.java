package com.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/controller2")
    public String controller2(){
        return "Hello from controller2";
    }
	
}
