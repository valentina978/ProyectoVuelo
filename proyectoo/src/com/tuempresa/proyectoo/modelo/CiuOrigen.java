package com.tuempresa.proyectoo.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class CiuOrigen extends Identificable{
	
	@Column(length = 50)
	String origen;

	
	
}
