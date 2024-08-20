package com.autodidacta.ApiRest.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autodidacta.ApiRest.entidades.Cliente;

@Repository
public interface ClienteRepositorio  extends JpaRepository<Cliente,String>{

}
