package com.autodidacta.ApiRest.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String rut;
	
	private String email;
	
	private String telefono;
	
	@Column(name="Fecha_Inicio")
	@Temporal(TemporalType.DATE)
	private LocalDate createAt;

	public Cliente(String rut, String email, String telefono, LocalDate createAt) {
		this.rut = rut;
		this.email = email;
		this.telefono = telefono;
		this.createAt = createAt;
	}

	public Cliente() {
		super();
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDate getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDate date) {
		this.createAt = date;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut
				+ ", email=" + email 
				+ ", telefono=" + telefono 
				+ ", createAt=" + createAt + "]";
	}
	
	
	
	

}
