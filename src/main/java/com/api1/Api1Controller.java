package com.api1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api1Controller {
	
	@GetMapping(value="/getName")
	public String getName() {
		return "fazil";
	}
	
	@GetMapping(value="/getnum/{b}")
	public int getNum(@PathVariable int b) {
		return b;
	}
}
