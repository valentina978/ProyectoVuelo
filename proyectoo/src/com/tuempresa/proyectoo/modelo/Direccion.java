package com.tuempresa.proyectoo.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter



public class Direccion {
	
	@Id
	@Column(length = 32)
	String calle;
	
	@Column(length = 34)
	String colonia;
	
	@ManyToOne
	@DescriptionsList(descriptionProperties = "municipio")
	ListaDeMunicipios listademunicipios;
	
	@ManyToOne
	@DescriptionsList(descriptionProperties = "estado")
	ListaEstados listadeestados;
	
	
	@ManyToOne
	@DescriptionsList(descriptionProperties = "pais")
	ListaPaises listaPaises;

	
}
