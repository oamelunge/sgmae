package com.saguapac.sgmae.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="SGM_PREDIO")
@DiscriminatorValue("P")
public class SgmPredio extends SgmActivo {

	
	@Column(name="CODIFICACION_ACTIVO", length=20)
	private String codificacionActivo;
	@Column(name="UBICACION", length=150)
	private String ubicacion;
	@Column(name="DIRECCION", length=150)
	private String direccion;
	public String getCodificacionActivo() {
		return codificacionActivo;
	}
	public void setCodificacionActivo(String codificacionActivo) {
		this.codificacionActivo = codificacionActivo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
