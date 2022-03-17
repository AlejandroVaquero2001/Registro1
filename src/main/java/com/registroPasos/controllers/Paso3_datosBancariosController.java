package com.registroPasos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.registroPasos.colecciones.Colecciones;
import com.registroPasos.entities.Paso1_datosPersonales;
import com.registroPasos.entities.Paso3_datosBancarios;
import com.registroPasos.service.IDatosBancariosService;

@Controller
@RequestMapping("/datosBancarios")
public class Paso3_datosBancariosController {
	
	@Autowired
	private IDatosBancariosService DatosBancariosService;
	
	@GetMapping("/datosBancarios-form") 
	 public String actorsForm(Paso3_datosBancarios datosBancarios, Model
			  model) {
				  
		 model.addAttribute("datosBancarios", new Paso3_datosBancarios()); 	  
		 model.addAttribute("datosNavegacion", Colecciones.datosNavegacion);	  
		 return "datosBancarios"; 
	}
	
	@PostMapping("/save") 
	 public String saveActors(Paso3_datosBancarios datosBancarios,RedirectAttributes redirect, Model model, Paso1_datosPersonales datosPersonales) {
		
		DatosBancariosService.saveDatosBancarios(datosBancarios);
		redirect.addFlashAttribute("datosBancariosGuardado","Los Datos Bancarios se han guardado");

		return "redirect:/datosProfesionales/datosProfesionales-form"; 
	}
}
