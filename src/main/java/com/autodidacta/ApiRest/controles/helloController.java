package com.autodidacta.ApiRest.controles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	
	@GetMapping("/holaMundo")
	public String holaMundo() {

		return "hola mundo hay va Roberto!!!!!";
	}

	@GetMapping("/bootstrap")
	public String bootstrap() {

		return """
				<!doctype html>
				<html lang="en">
				  <head>
				    <meta charset="utf-8">
				    <meta name="viewport" content="width=device-width, initial-scale=1">
				    <title>Bootstrap demo</title>
				    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
				  </head>
				  <body>
				    <h1>Hola roberto!</h1>
				    <a class= "btn btn-primary" href="https://www.google.com">Google</a>
				    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
				  </body>
				</html>

								""";
	}

	
}
