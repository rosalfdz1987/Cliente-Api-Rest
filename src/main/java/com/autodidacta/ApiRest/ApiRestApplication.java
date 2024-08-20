package com.autodidacta.ApiRest;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import com.autodidacta.ApiRest.entidades.Cliente;
import com.autodidacta.ApiRest.repositorios.ClienteRepositorio;

@SpringBootApplication
public class ApiRestApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(ApiRestApplication.class, args);
		
		ClienteRepositorio clienteRepositorio =context.getBean(ClienteRepositorio.class);
		
		Cliente cliente1 = new Cliente();
		cliente1.setRut("1");
		cliente1.setEmail("wewr@gmail.com");
		cliente1.setTelefono("2312432");	
		cliente1.setCreateAt(LocalDate.of(2023, 10, 15));
		
		Cliente cliente2 = new Cliente();
		cliente2.setRut("2");
		cliente2.setEmail("sfe@gmail.com");
		cliente2.setTelefono("345432");	
		cliente1.setCreateAt(LocalDate.of(2023, 12,5));
		
		clienteRepositorio.save(cliente1);
		clienteRepositorio.save(cliente2);
		
		// recuperrlos todos 
		
		System.out.println(clienteRepositorio.findAll().size());
		
		System.out.println(clienteRepositorio.findAll());
		
		//borrar 
		
	  // clienteRepositorio.deleteById("E24324");
	   
	   System.out.println(clienteRepositorio.findAll().size());
	   
	  
		
		
		
		
	}

}
