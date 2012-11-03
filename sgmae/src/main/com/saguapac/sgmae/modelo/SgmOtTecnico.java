package com.saguapac.sgmae.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="SGM_OT_TECNICO")
public class SgmOtTecnico implements  Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1013970159748008677L;


	@Id
	@Column(name="ID_OT_TECNICO")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idOtTecnico;
	
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="ID_ORDEN_TRABAJO")
	private SgmOrdenTrabajo sgmOrdenTrabajo;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="ID_TECNICO")
	private SgmTecnico sgmTecnico;
	
	
	@Embedded 
	private Auditorias auditorias;


	public Long getIdOtTecnico() {
		return idOtTecnico;
	}


	public void setIdOtTecnico(Long idOtTecnico) {
		this.idOtTecnico = idOtTecnico;
	}


	public SgmOrdenTrabajo getSgmOrdenTrabajo() {
		return sgmOrdenTrabajo;
	}


	public void setSgmOrdenTrabajo(SgmOrdenTrabajo sgmOrdenTrabajo) {
		this.sgmOrdenTrabajo = sgmOrdenTrabajo;
	}


	public SgmTecnico getSgmTecnico() {
		return sgmTecnico;
	}


	public void setSgmTecnico(SgmTecnico sgmTecnico) {
		this.sgmTecnico = sgmTecnico;
	}


	public Auditorias getAuditorias() {
		return auditorias;
	}


	public void setAuditorias(Auditorias auditorias) {
		this.auditorias = auditorias;
	}
	


}
