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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SGM_MATERIAL")
public class SgmMaterial implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_MATERIAL", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idMaterial;
	
	@Column(name="CODIGO_MAGERIAL",nullable=false,length=20)
	private String  codigoMaterial;
	
	@Column(name="NOMBRE_MATERIAL",nullable=false,length=200)
	private String nombreMaterial;
	
	@Column(name="UBICACION",nullable=false,length=100)
	private String ubicacion;
	
	@Column(name="COSTO_UNITARIO", precision=2)
	private BigDecimal costoUnitario;
	
	@Column(name="EXISTENCIA", precision=2)
	private BigDecimal existencia;
	
	@Column(name="EXISTENCIA_MINIMA", precision=2)
	private BigDecimal existenciaMinima;
	
	@Embedded 
	private Auditorias auditorias;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="sgmMaterial")
	private List<SgmOtMaterial> sgmOtMaterial;

	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumn(name="ID_CATEGORIA", nullable=false)
	private SgmCategoriaMaterial sgmCategoriaMaterial;

	public Long getIdMaterial() {
		return idMaterial;
	}



	public void setIdMaterial(Long idMaterial) {
		this.idMaterial = idMaterial;
	}



	public String getCodigoMaterial() {
		return codigoMaterial;
	}



	public void setCodigoMaterial(String codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
	}



	public String getNombreMaterial() {
		return nombreMaterial;
	}



	public void setNombreMaterial(String nombreMaterial) {
		this.nombreMaterial = nombreMaterial;
	}



	public String getUbicacion() {
		return ubicacion;
	}



	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}



	public BigDecimal getCostoUnitario() {
		return costoUnitario;
	}



	public void setCostoUnitario(BigDecimal costoUnitario) {
		this.costoUnitario = costoUnitario;
	}



	public BigDecimal getExistencia() {
		return existencia;
	}



	public void setExistencia(BigDecimal existencia) {
		this.existencia = existencia;
	}



	public BigDecimal getExistenciaMinima() {
		return existenciaMinima;
	}



	public void setExistenciaMinima(BigDecimal existenciaMinima) {
		this.existenciaMinima = existenciaMinima;
	}



	public Auditorias getAuditorias() {
		return auditorias;
	}



	public void setAuditorias(Auditorias auditorias) {
		this.auditorias = auditorias;
	}



	public void setSgmOtMaterial(List<SgmOtMaterial> sgmOtMaterial) {
		this.sgmOtMaterial = sgmOtMaterial;
	}



	public List<SgmOtMaterial> getSgmOtMaterial() {
		return sgmOtMaterial;
	}



	public void setSgmCategoriaMaterial(SgmCategoriaMaterial sgmCategoriaMaterial) {
		this.sgmCategoriaMaterial = sgmCategoriaMaterial;
	}



	public SgmCategoriaMaterial getSgmCategoriaMaterial() {
		return sgmCategoriaMaterial;
	}
	
	
	
}
