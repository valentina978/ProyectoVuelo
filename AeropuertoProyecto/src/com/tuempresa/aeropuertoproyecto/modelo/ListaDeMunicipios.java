package com.tuempresa.aeropuertoproyecto.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class ListaDeMunicipios extends Identificable {

	
	@Column(length = 50)
	String municipios;
}
