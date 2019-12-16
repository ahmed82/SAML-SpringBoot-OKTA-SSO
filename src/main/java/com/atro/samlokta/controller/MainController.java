package com.atro.samlokta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@GetMapping("/")
	public String index() {
		return "Hello SAML!";
	}

}
