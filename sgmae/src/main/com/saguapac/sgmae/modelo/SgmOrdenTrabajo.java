package com.saguapac.sgmae.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="SgmOrdenTrabajo")
public class SgmOrdenTrabajo implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ORDEN_TRABAJO", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idOrdenTrabajo;
	
	@Column(name="DESCRIPCION", precision=2)
	private String descripcion;
	
	@Column(name="FECHA_INICIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaInicioOT;
	
	@Column(name="FECHA_FIN")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFinOT;
	
	@Embedded 
	private Auditorias auditorias;
	
	@Enumerated(EnumType.STRING)
	private TipoOrdenTrabajo tipo;


	
	public SgmOrdenTrabajo() {
		
	}

	public Long getIdOrdenTrabajo() {
		return idOrdenTrabajo;
	}

	public void setIdOrdenTrabajo(Long idOrdenTrabajo) {
		this.idOrdenTrabajo = idOrdenTrabajo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaInicioOT() {
		return fechaInicioOT;
	}

	public void setFechaInicioOT(Date fechaInicioOT) {
		this.fechaInicioOT = fechaInicioOT;
	}

	public Date getFechaFinOT() {
		return fechaFinOT;
	}

	public void setFechaFinOT(Date fechaFinOT) {
		this.fechaFinOT = fechaFinOT;
	}

	public void setAuditorias(Auditorias auditorias) {
		this.auditorias = auditorias;
	}

	public Auditorias getAuditorias() {
		return auditorias;
	}

	public void setTipo(TipoOrdenTrabajo tipo) {
		this.tipo = tipo;
	}

	public TipoOrdenTrabajo getTipo() {
		return tipo;
	}
	
	
}