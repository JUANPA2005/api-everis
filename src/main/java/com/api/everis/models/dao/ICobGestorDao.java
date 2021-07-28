package com.api.everis.models.dao;

import org.springframework.data.repository.CrudRepository;


import com.api.everis.models.entity.CobGestor;

public interface ICobGestorDao extends CrudRepository<CobGestor, String> {

//	@Query("from GCCOBRANZAS.COB_GESTOR")
//	public List<COB_GESTOR> findAllGestores();

}
