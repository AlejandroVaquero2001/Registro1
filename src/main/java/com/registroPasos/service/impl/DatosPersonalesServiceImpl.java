package com.registroPasos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registroPasos.dao.IDatosPersonalesDAO;
import com.registroPasos.entities.Paso1_datosPersonales;
import com.registroPasos.service.IDatosPersonalesService;

@Service
public class DatosPersonalesServiceImpl implements IDatosPersonalesService {

	@Autowired
	private IDatosPersonalesDAO datosPersonalesDAO;
	
	@Override
	public void saveDatosPersonales(Paso1_datosPersonales datosPersonales) {
		datosPersonalesDAO.save(datosPersonales);
		
	}

}
