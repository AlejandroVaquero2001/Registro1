package com.registroPasos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registroPasos.dao.IDatosProfesionalesDAO;
import com.registroPasos.entities.Paso2_datosProfesionales;
import com.registroPasos.service.IDatosProfesionalesService;

@Service
public class DatosProfesionalesServiceImpl implements IDatosProfesionalesService{

	@Autowired
	private IDatosProfesionalesDAO datosProfesionalesDAO ;

	@Override
	public void saveDatosProfesionales(Paso2_datosProfesionales datosProfesionales) {
		datosProfesionalesDAO.save(datosProfesionales);
		
	}
	
	


}
