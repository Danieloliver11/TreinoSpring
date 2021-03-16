package com.olamundo.ola.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vontade")
public class ControllerOla {
	@GetMapping
	public String exe2() {
		
		return "Essa semana irei apreender Spring e costruir um blog " ;
	}

}
