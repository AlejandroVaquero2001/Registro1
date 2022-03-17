package com.registroPasos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registroPasos.dao.IDatosBancariosDAO;
import com.registroPasos.entities.Paso3_datosBancarios;
import com.registroPasos.service.IDatosBancariosService;

@Service
public class DatosBancariosServiceImpl implements IDatosBancariosService{
	
	@Autowired
	private IDatosBancariosDAO datosBancariosDAO;

	@Override
	public void saveDatosBancarios(Paso3_datosBancarios datosBancarios) {
		datosBancariosDAO.save(datosBancarios);
		
	}
	

}
