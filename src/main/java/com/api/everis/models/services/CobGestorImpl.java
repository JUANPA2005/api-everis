package com.api.everis.models.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.everis.models.dao.ICobGestorDao;
import com.api.everis.models.entity.CobGestor;

@Service
public class CobGestorImpl implements ICobGestorService {
	
	@Autowired
	private ICobGestorDao cobGestorDao;

	@Override
	public List<CobGestor> findAll() {
		return (List<CobGestor>)  cobGestorDao.findAll();
	}

}
