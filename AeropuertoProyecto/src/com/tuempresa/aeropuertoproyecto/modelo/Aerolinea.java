package com.tuempresa.aeropuertoproyecto.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Aerolinea {

	
	@Id
	@Hidden
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length = 32)
	String oid;
	
	@Column(length = 64)
	String nombre;
	
	
	@Column(length = 64)
	int npais;
	
	
	
	
}
