package com.registroPasos.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="datosProfesionales")
public class Paso2_datosProfesionales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departamento;
	private double salario;
	private String comentarios;
	
	//Vamos a establecer las relaciones con la tabla peliculas
	@OneToOne(fetch = FetchType.LAZY)
	private Paso1_datosPersonales datosPersonalesTabla;
		
	public Paso2_datosProfesionales() {
		super();
	}
	
	
	public Paso2_datosProfesionales(Long id, String departamento, double salario, String comentarios,
			Paso1_datosPersonales datosPersonalesTabla) {
		super();
		this.id = id;
		this.departamento = departamento;
		this.salario = salario;
		this.comentarios = comentarios;
		this.datosPersonalesTabla = datosPersonalesTabla;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Paso1_datosPersonales getDatosPersonalesTabla() {
		return datosPersonalesTabla;
	}

	public void setDatosPersonalesTabla(Paso1_datosPersonales datosPersonalesTabla) {
		this.datosPersonalesTabla = datosPersonalesTabla;
	}

	
}
