package com.saguapac.sgmae.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SGM_TIPOS_TRABAJO")
public class SgmTiposTrabajo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4958594247807668043L;


	@Id
	@Column(name="ID_TIPO_TRABAJO")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idTipoTrabajo;
	
	
	@Column(name="NOMBRE", length=50)
	private String nombre;
	
	@Column(name="DESCRIPCION", length=250)
	private String descripcion;
	
	@Embedded 
	private Auditorias auditorias;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="sgmTiposTrabajo")
	private List<SgmOtTiposTrabajo> sgmOtTiposTrabajo;

	public Long getIdTipoTrabajo() {
		return idTipoTrabajo;
	}

	public void setIdTipoTrabajo(Long idTipoTrabajo) {
		this.idTipoTrabajo = idTipoTrabajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Auditorias getAuditorias() {
		return auditorias;
	}

	public void setAuditorias(Auditorias auditorias) {
		this.auditorias = auditorias;
	}

	public List<SgmOtTiposTrabajo> getSgmOtTiposTrabajo() {
		return sgmOtTiposTrabajo;
	}

	public void setSgmOtTiposTrabajo(List<SgmOtTiposTrabajo> sgmOtTiposTrabajo) {
		this.sgmOtTiposTrabajo = sgmOtTiposTrabajo;
	}
	
}
