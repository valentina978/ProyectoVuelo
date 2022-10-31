package com.tuempresa.aeropuertoproyecto.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Ciudestino extends Identificable{
	
	@Column(length = 50)
	String destino;

}
