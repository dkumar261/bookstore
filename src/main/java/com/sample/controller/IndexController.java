package com.sample.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/")
	public String getResponse(Map<String, Object> model) {
		System.out.println("Index controller hits : ");
		return "home";
	}
}	
