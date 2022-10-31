package com.tuempresa.aeropuertoproyecto.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Municipio extends Identificable {

	
	@ManyToOne
	@DescriptionsList(descriptionProperties = "municipio")
	ListaDeMunicipios listaDeMunicipios;
}
