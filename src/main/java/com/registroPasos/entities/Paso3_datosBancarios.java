package com.registroPasos.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="datosBancarios")
public class Paso3_datosBancarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cuentaCorriente;
	
	//Vamos a establecer las relaciones con la tabla peliculas
	@OneToOne(fetch = FetchType.LAZY)
	private Paso1_datosPersonales datosPersonalesTabla;
	
	public Paso3_datosBancarios() {
		super();
	}

	public Paso3_datosBancarios(Long id, String cuentaCorriente, Paso1_datosPersonales datosPersonales) {
		super();
		this.id = id;
		this.cuentaCorriente = cuentaCorriente;
		this.datosPersonalesTabla = datosPersonales;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(String cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	public Paso1_datosPersonales getDatosPersonales() {
		return datosPersonalesTabla;
	}

	public void setDatosPersonales(Paso1_datosPersonales datosPersonales) {
		this.datosPersonalesTabla = datosPersonales;
	}


	
	
	
	

}
