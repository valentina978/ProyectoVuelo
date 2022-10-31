package com.tuempresa.aeropuertoproyecto.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable
@Getter @Setter
public class Direccion {
	
	@Id
	@Column(length = 32)
	String calle;
	
	@Column(length = 64)
	String colonia;
	
	@Column(length = 64)
	String municipio;
	
	@Column(length = 32)
	String estado;
	
	@ManyToOne
	@DescriptionsList(descriptionProperties = "pais")
	ListaPaises listaPaises;
	
	
}
