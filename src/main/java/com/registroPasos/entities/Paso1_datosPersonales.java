package com.registroPasos.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Entity
@Table(name="datosPersonales")
public class Paso1_datosPersonales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellidos;
	@Column(name="fechaNacimiento")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	private Date fechaNacimiento;
	private String genero;
	private String casado;
	private String nacionalidades;
	
	@OneToOne(targetEntity=Paso2_datosProfesionales.class, mappedBy="datosPersonalesTabla", fetch=FetchType.EAGER)
	private List<Paso2_datosProfesionales> datosProfesionales;
	
	@OneToOne(targetEntity=Paso3_datosBancarios.class, mappedBy="datosPersonalesTabla", fetch=FetchType.EAGER)
	private List<Paso3_datosBancarios> datosBancarios;
	
	public Paso1_datosPersonales() {
		super();
	}

	public Paso1_datosPersonales(Long id, String nombre, String apellidos, Date fechaNacimiento, String genero,
			String casado, String nacionalidades, List<Paso2_datosProfesionales> datosProfesionales,
			List<Paso3_datosBancarios> datosBancarios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.casado = casado;
		this.nacionalidades = nacionalidades;
		this.datosProfesionales = datosProfesionales;
		this.datosBancarios = datosBancarios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCasado() {
		return casado;
	}

	public void setCasado(String casado) {
		this.casado = casado;
	}

	public String getNacionalidades() {
		return nacionalidades;
	}

	public void setNacionalidades(String nacionalidades) {
		this.nacionalidades = nacionalidades;
	}

	public List<Paso2_datosProfesionales> getDatosProfesionales() {
		return datosProfesionales;
	}

	public void setDatosProfesionales(List<Paso2_datosProfesionales> datosProfesionales) {
		this.datosProfesionales = datosProfesionales;
	}

	public List<Paso3_datosBancarios> getDatosBancarios() {
		return datosBancarios;
	}

	public void setDatosBancarios(List<Paso3_datosBancarios> datosBancarios) {
		this.datosBancarios = datosBancarios;
	}

	
	
	
}