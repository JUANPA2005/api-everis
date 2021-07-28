package com.api.everis.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.everis.models.entity.CobGestor;
import com.api.everis.models.services.ICobGestorService;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

//@CrossOrigin(origins = {"http://192.168.1.6:3000"})
@CrossOrigin(originPatterns = "*" )
@RestController
@RequestMapping("/api")
public class CobGestorRestController {

	@Autowired
	private ICobGestorService cobGestorService;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@GetMapping("/gestores")
	public List<CobGestor> gestores() {
		String sql = "use Goya select * from GCCOBRANZAS.COB_GESTOR";
		List<CobGestor> gestores = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(CobGestor.class));

//		return cobGestorService.findAll();
		return gestores;
	}
}
