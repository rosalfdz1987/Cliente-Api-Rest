package com.autodidacta.ApiRest.controles;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.autodidacta.ApiRest.entidades.Cliente;
import com.autodidacta.ApiRest.repositorios.ClienteRepositorio;

@RestController
public class ClienteController {
	
	private ClienteRepositorio clienteRepositorio;
	
    
	


	public ClienteController(ClienteRepositorio clienteRepositorio) {
		
		this.clienteRepositorio = clienteRepositorio;
	}


   /**
    * http://localhost:8080/api/clientes
    * 
    * */
	@GetMapping("/api/clientes")
	public List<Cliente> findAll() {
		
	
		return clienteRepositorio.findAll();
		
	}
	
	

	   /**
	    * http://localhost:8080/api/cliente/{id}
	    * 
	    * */
	@GetMapping("api/cliente/{id}")
	public Cliente findOneById(@PathVariable String id) {

		
	Optional<Cliente> clienteOPt = clienteRepositorio.findById(id);
	
	if (clienteOPt.isPresent()) {
		
		return clienteOPt.get();
			}
	else {
		return null;
	}
		
	/**
	 * opcion 2 con una linea funcional
	 * return clienteOpt.orElse(null)*/
	}
	
}
