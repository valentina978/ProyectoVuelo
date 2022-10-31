package com.tuempresa.proyectoo.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Estado  extends Identificable{

	@ManyToOne
	@DescriptionsList(descriptionProperties = "estado")
	ListaEstados listadeestados;

}
