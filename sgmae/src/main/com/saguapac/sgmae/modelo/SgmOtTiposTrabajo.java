package com.saguapac.sgmae.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SGM_OT_TIPOS_TRABAJO")
public class SgmOtTiposTrabajo {

	
	@Id
	@Column(name="ID_OT_TIPOS_TRABAJO")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idOTTiposTrabajo;

	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	private SgmTiposTrabajo sgmTiposTrabajo;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	private SgmOrdenTrabajo sgmOrdenTrabajo;
	
	
	
	public SgmTiposTrabajo getSgmTiposTrabajo() {
		return sgmTiposTrabajo;
	}

	public void setSgmTiposTrabajo(SgmTiposTrabajo sgmTiposTrabajo) {
		this.sgmTiposTrabajo = sgmTiposTrabajo;
	}

	public SgmOrdenTrabajo getSgmOrdenTrabajo() {
		return sgmOrdenTrabajo;
	}

	public void setSgmOrdenTrabajo(SgmOrdenTrabajo sgmOrdenTrabajo) {
		this.sgmOrdenTrabajo = sgmOrdenTrabajo;
	}

	public void setIdOTTiposTrabajo(Long idOTTiposTrabajo) {
		this.idOTTiposTrabajo = idOTTiposTrabajo;
	}

	public Long getIdOTTiposTrabajo() {
		return idOTTiposTrabajo;
	}
	
	
}
