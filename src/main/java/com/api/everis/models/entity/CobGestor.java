package com.api.everis.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "COB_GESTOR")
public class CobGestor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String USUARIO_ID;
	
	private String PRIMER_NOMBRE;
	private String SEGUNDO_NOMBRE;
	private String PRIMER_APELLIDO;
	private String SEGUNDO_APELLIDO;
	
	public String getUSUARIO_ID() {
		return USUARIO_ID;
	}

	public void setUSUARIO_ID(String uSUARIO_ID) {
		USUARIO_ID = uSUARIO_ID;
	}

	public String getPRIMER_NOMBRE() {
		return PRIMER_NOMBRE;
	}

	public void setPRIMER_NOMBRE(String pRIMER_NOMBRE) {
		PRIMER_NOMBRE = pRIMER_NOMBRE;
	}

	public String getSEGUNDO_NOMBRE() {
		return SEGUNDO_NOMBRE;
	}

	public void setSEGUNDO_NOMBRE(String sEGUNDO_NOMBRE) {
		SEGUNDO_NOMBRE = sEGUNDO_NOMBRE;
	}

	public String getPRIMER_APELLIDO() {
		return PRIMER_APELLIDO;
	}

	public void setPRIMER_APELLIDO(String pRIMER_APELLIDO) {
		PRIMER_APELLIDO = pRIMER_APELLIDO;
	}

	public String getSEGUNDO_APELLIDO() {
		return SEGUNDO_APELLIDO;
	}

	public void setSEGUNDO_APELLIDO(String sEGUNDO_APELLIDO) {
		SEGUNDO_APELLIDO = sEGUNDO_APELLIDO;
	}
	
}
