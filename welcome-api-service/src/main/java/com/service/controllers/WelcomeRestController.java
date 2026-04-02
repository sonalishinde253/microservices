package com.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.GreetFeignClient;

@RestController
public class WelcomeRestController {
	@Autowired
	private GreetFeignClient feignClient;
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		String welcomeMessage = "In Micreoservices Porject";
		String greetMsg = feignClient.invokeGreetApi();
		return greetMsg + " , " +welcomeMessage;
	}
}
