package com.mvc.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class indexController {
	
	@GetMapping({"/index","","/home","/"})
	public String index(Model model) {
		return "index";
	}

}
