package com.simpleProject.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class myController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome guru!";
	}
}
