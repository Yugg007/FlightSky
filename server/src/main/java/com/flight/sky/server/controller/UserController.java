package com.flight.sky.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("")
	public String test() {
		return "Successfully test";
	}

}
