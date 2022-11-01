package com.tuempresa.proyectoo.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(name = "Corta" , members = "nombres, apellidos; " +
                                 "fotografia,direccion")
public class Persona extends Identificable {
	
	@Column(length = 23)
	String nombres;
	
	@Column(length = 23)
	String apellidos;
	
	@Required
	@File
	@Column(length = 32)
	String fotografia;
	
	@ManyToOne
	Direccion direccion;
	
	

}
