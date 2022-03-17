package com.registroPasos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.registroPasos.colecciones.Colecciones;
import com.registroPasos.entities.Paso1_datosPersonales;
import com.registroPasos.service.IDatosPersonalesService;


@Controller
public class Paso1_datosPersonalesControllers {
	
	@Autowired
	private IDatosPersonalesService datosPersonalesService;
	
	@GetMapping("/")
	public String datosPersonales(Model model) {
		model.addAttribute("datosPersonales", new Paso1_datosPersonales());
		model.addAttribute("listaGenerosOrdenada", Colecciones.listaGenerosOrdenada);
		model.addAttribute("listaParejaOrdenada", Colecciones.listaParejaOrdenada);
		model.addAttribute("listaNacionalidadesOrdenada", Colecciones.listaNacionalidadesOrdenada);
		model.addAttribute("datosNavegacion", Colecciones.datosNavegacion);
		
		return "datosPersonales";
	}
	
	
		
	@PostMapping("/save-datosPersonales") 
	public String saveActors(Paso1_datosPersonales datosPersonales,RedirectAttributes redirect, Model model) {
				
		datosPersonalesService.saveDatosPersonales(datosPersonales);
		redirect.addFlashAttribute("datosPersonalesGuardado","Los Datos Personales se han guardado");

		return "redirect:/datosProfesionales/datosProfesionales-form";
	}
	
}
