package com.registroPasos.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

import com.registroPasos.enums.NacionalidadesNombre;

@Entity
public class Nacionalidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	@Enumerated(EnumType.STRING)
	@Column(unique = true)
	private NacionalidadesNombre listaNacionalidad;
	
	
	public Nacionalidad() {
		super();
	}


	public Nacionalidad(int id, NacionalidadesNombre listaNacionalidad) {
		super();
		this.id = id;
		this.listaNacionalidad = listaNacionalidad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public NacionalidadesNombre getListaNacionalidad() {
		return listaNacionalidad;
	}


	public void setListaNacionalidad(NacionalidadesNombre listaNacionalidad) {
		this.listaNacionalidad = listaNacionalidad;
	}

	
	
}
