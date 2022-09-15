package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
//	Takes HTTP methods, URI
	@RequestMapping(method=RequestMethod.GET, path = "/helloWorld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/helloWorld1")
	public String helloWorld1() {
		return "Hello World1!";
	}
	
	@GetMapping("/helloWorld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Sam", "Bahadur", "Nepal");
	}	
}
