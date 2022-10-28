package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Ciudestino extends Identificable{
	
	@Column(length = 50)
	String destino;

}
