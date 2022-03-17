package com.registroPasos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registroPasos.entities.Paso3_datosBancarios;

@Repository
public interface IDatosBancariosDAO extends JpaRepository<Paso3_datosBancarios, Long>{

}
