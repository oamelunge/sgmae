package com.saguapac.sgmae.modelo;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name="SGM_OT_MATERIAL")
public class SgmOtMaterial implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_OT_MATERIAL")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idOTMaterial;
	
	@Column(name="CANTIDAD", precision=2)
	private BigDecimal 	cantidad;
	
	@Column(name="PRECIO_UNITARIO", precision=2)
	private BigDecimal precioUnitario;
	
	@Column(name="TOTAL_LINEA",precision=2)
	private BigDecimal totalLinea;

	@Embedded 
	private Auditorias auditorias;
	
	@ManyToOne(optional=false, fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ORDEN_TRABAJO", nullable=false)
	private SgmOrdenTrabajo SgmOrdenTrabajo;
	
	@ManyToOne(optional=false, fetch=FetchType.LAZY)
	@JoinColumn(name="ID_MATERIAL", nullable=false)
	private SgmMaterial sgmMaterial;
	
	public Long getIdOTMaterial() {
		return idOTMaterial;
	}

	public void setIdOTMaterial(Long idOTMaterial) {
		this.idOTMaterial = idOTMaterial;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getTotalLinea() {
		return totalLinea;
	}

	public void setTotalLinea(BigDecimal totalLinea) {
		this.totalLinea = totalLinea;
	}

	public void setAuditorias(Auditorias auditorias) {
		this.auditorias = auditorias;
	}

	public Auditorias getAuditorias() {
		return auditorias;
	}

	public void setSgmMaterial(SgmMaterial sgmMaterial) {
		this.sgmMaterial = sgmMaterial;
	}

	public SgmMaterial getSgmMaterial() {
		return sgmMaterial;
	}

	public void setSgmOrdenTrabajo(SgmOrdenTrabajo sgmOrdenTrabajo) {
		SgmOrdenTrabajo = sgmOrdenTrabajo;
	}

	public SgmOrdenTrabajo getSgmOrdenTrabajo() {
		return SgmOrdenTrabajo;
	}
	
	
	
}
