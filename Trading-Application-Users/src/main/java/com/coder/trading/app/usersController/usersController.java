package com.coder.trading.app.usersController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class usersController {
	
	@RequestMapping("/status/check")
	public String status() {
		return "#Working fine...";
	}
	
	
	@RequestMapping("/getUsers")
	public String getUsers() {
		
		return "Inside the getUsers method of the User Controller";
	}

}
