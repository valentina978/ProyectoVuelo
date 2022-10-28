package com.tuempresa.proyectoo.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;


@Entity
@Getter @Setter	
public class Persona {

	
	 @Id 
	   @Hidden
	   @GeneratedValue(generator = "system-uuid")
	   @GenericGenerator(name = "system-uuid" , strategy = "uuid")
	   @Column(length = 32)
	    String oid;

	   
	   
	   
	   @Required
		@Column(length=30)
		String nombre;
		
	    @Required
		@Column(length=30)
		String apellido;
		
		@Required
		@Files
	    @Column (length = 32)
	    String fotos;
		

		@Embedded
		Direccion direcion;

	}

		

