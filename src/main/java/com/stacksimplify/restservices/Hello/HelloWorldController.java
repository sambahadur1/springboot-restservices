package com.stacksimplify.restservices.Hello;

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
}
