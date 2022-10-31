package com.tuempresa.proyectoo.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Pais extends Identificable{
	
	@ManyToOne
	@DescriptionsList(descriptionProperties = "pais")
	ListaPaises listaPaises;

}
