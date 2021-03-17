package com.hello.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello1")
public class ObjetivosController {
	@GetMapping
	public String hello1() {
		
		return ("\"Hello World \nDominar Git e GitHub \nMelhorar em Java \nAprender Spring bem\"");
	}

}
