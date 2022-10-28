package com.tuempresa.proyectoo.modelo;

import javax.persistence.*;

import lombok.*;


@Embeddable
@Getter @Setter
public class Direccion {

	@Column(length=30)
	String calle;
	@Column(length=30)
	String colonia;
	@Column(length=30)
	String municipio;
	@Column(length=30)
	String estado;
}
