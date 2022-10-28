package com.training.pms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/suhel")
	public  String Greet()
	{
		return "Good Morning!!!!";
	}

}
