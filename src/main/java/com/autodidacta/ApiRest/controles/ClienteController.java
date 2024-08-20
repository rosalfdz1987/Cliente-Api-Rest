package com.autodidacta.ApiRest.controles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

	@GetMapping("/holaMundo")
	public String holaMundo() {

		return "hola mundo hay va Roberto!!!!!";
	}

}
