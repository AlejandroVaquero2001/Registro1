package com.registroPasos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registroPasos.entities.Paso1_datosPersonales;

@Repository
public interface IDatosPersonalesDAO extends JpaRepository<Paso1_datosPersonales, Long>  {

}
