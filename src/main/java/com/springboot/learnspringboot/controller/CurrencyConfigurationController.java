package com.springboot.learnspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learnspringboot.config.CurrencyConfiguration;

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyConfiguration configuration;
	
	@RequestMapping("/currency")
	public CurrencyConfiguration retieveAllCourses() {
		return configuration;
	}
}
