package com.tuempresa.aeropuertoproyecto.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Estados extends Identificable {

	
	@ManyToOne
	@DescriptionsList(descriptionProperties = "estados")
	ListaDeEstados listadeestados;
}
