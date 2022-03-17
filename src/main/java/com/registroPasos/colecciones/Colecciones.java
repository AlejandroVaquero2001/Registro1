package com.registroPasos.colecciones;

import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Colecciones {

	public static LinkedHashMap<String,String> datosNavegacion = new LinkedHashMap<String,String>();
	public static SortedMap<String, String> listaGenerosOrdenada= new TreeMap<String, String>();
	public static SortedMap<String, String> listaParejaOrdenada= new TreeMap<String, String>();
	public static SortedMap<String, String> listaNacionalidadesOrdenada = new TreeMap<String, String>();
	public static SortedMap<String, String> listaDepertamentosOrdenada = new TreeMap<String, String>();

	static { // se usa static por que es un valor que no se va a modificar
		
		datosNavegacion.put("datosPersonales", "/images/Number-1-icon.png");
		datosNavegacion.put("datosProfesionales", "/images/Number-2-icon.png");
		datosNavegacion.put("datosBancarios", "/images/Number-3-icon.png");	
		datosNavegacion.put("resumen","/images/checkered-flag-icon.png");

		listaGenerosOrdenada.put("H", "Hombre");
		listaGenerosOrdenada.put("M", "Mujer");
		listaGenerosOrdenada.put("O", "Otro");
		
		listaParejaOrdenada.put("C", "Casado");
		listaParejaOrdenada.put("S", "Soltero");

		listaNacionalidadesOrdenada.put("Española", "Española");
		listaNacionalidadesOrdenada.put("Francesa", "Francesa");
		listaNacionalidadesOrdenada.put("Italiana", "Italiana");
		listaNacionalidadesOrdenada.put("Portuguesa", "Portuguesa");
		
		listaDepertamentosOrdenada.put("Marketing", "Marketing");
		listaDepertamentosOrdenada.put("Direccion", "Direccion");
		listaDepertamentosOrdenada.put("Administracio", "Administracion");
		listaDepertamentosOrdenada.put("IT", "IT");

	}
}

