package com.devops.springboot.controlller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/message")
	public String sayMessage() {
		return "Hi";
	}
	
}