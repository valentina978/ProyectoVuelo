package com.tuempresa.proyectoo.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Municipio extends Identificable {

	@ManyToOne
	@DescriptionsList(descriptionProperties = "municipio")
	ListaDeMunicipios listademunicipios;
	
}
