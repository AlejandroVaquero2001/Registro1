package com.registroPasos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registroPasos.entities.Paso2_datosProfesionales;

@Repository
public interface IDatosProfesionalesDAO extends JpaRepository<Paso2_datosProfesionales, Long>{

}
