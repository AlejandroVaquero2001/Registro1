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
import com.registroPasos.entities.Paso2_datosProfesionales;
import com.registroPasos.service.IDatosProfesionalesService;

@Controller
@RequestMapping("/datosProfesionales")
public class Paso2_datosProfesionalesControllers {
	
	 @Autowired
	 private IDatosProfesionalesService datosProfesionalesService;

	 @GetMapping("/datosProfesionales-form") 
	 public String actorsForm(Paso2_datosProfesionales datoProfesionale, Model
			  model) {
				  
		 model.addAttribute("datosProfesionales", new Paso2_datosProfesionales()); 
		 model.addAttribute("listaDepertamentosOrdenada", Colecciones.listaDepertamentosOrdenada);		  
		 model.addAttribute("datosNavegacion", Colecciones.datosNavegacion);  
		 return "datosProfesionales"; 
	}
	 
	 @PostMapping("/save") 
	 public String saveActors(Paso2_datosProfesionales datoProfesionale,RedirectAttributes redirect, Model model, Paso1_datosPersonales datosPersonales) {
		
		datosProfesionalesService.saveDatosProfesionales(datoProfesionale);
		redirect.addFlashAttribute("datosProfesionalesGuardado","Los Datos Profesionales se han guardado");

		return "redirect:/datosBancarios/datosBancarios-form"; 
	}

}
