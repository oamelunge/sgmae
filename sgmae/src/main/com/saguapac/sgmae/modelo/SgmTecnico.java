package com.saguapac.sgmae.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="SGM_TECNICO")
public class SgmTecnico implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3376637613645657213L;

	@Id
	@Column(name="ID_TECNICO")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idTecnico;
	
	@Column(name="NOMBRE_COMPLETO", length=150)
	private String nombreCompleto;
	
	@Column(name="COSTO_HORA", precision=2)
	private BigDecimal costoHora;
	
	@Column(name="NUM_CORPORATIVO", length=15)
	private String numCorporativo;
	
	@Embedded 
	private Auditorias auditorias;
	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="sgmTecnico")
	private  List<SgmOtTecnico> sgmOtTecnicos;


	public Long getIdTecnico() {
		return idTecnico;
	}


	public void setIdTecnico(Long idTecnico) {
		this.idTecnico = idTecnico;
	}


	public String getNombreCompleto() {
		return nombreCompleto;
	}


	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}


	public BigDecimal getCostoHora() {
		return costoHora;
	}


	public void setCostoHora(BigDecimal costoHora) {
		this.costoHora = costoHora;
	}


	public String getNumCorporativo() {
		return numCorporativo;
	}


	public void setNumCorporativo(String numCorporativo) {
		this.numCorporativo = numCorporativo;
	}


	public Auditorias getAuditorias() {
		return auditorias;
	}


	public void setAuditorias(Auditorias auditorias) {
		this.auditorias = auditorias;
	}


	public List<SgmOtTecnico> getSgmOtTecnicos() {
		return sgmOtTecnicos;
	}


	public void setSgmOtTecnicos(List<SgmOtTecnico> sgmOtTecnicos) {
		this.sgmOtTecnicos = sgmOtTecnicos;
	}
}
