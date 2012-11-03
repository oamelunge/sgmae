package com.saguapac.sgmae.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="SGM_ACTIVO")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="TIPO_ACTIVO")
public class SgmActivo {
	
	
	
	
	@Id
	@Column(name="ID_ACTIVO")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long idActivo;
	
	@Column(name="DESCRIPCION",length=200)
	public String descripcion;
	
	@Column(name="AREA_PERTENCIA",length=100)
	public String areaPertenencia;
	
	@Embedded 
	private Auditorias auditorias;

	public Long getIdActivo() {
		return idActivo;
	}

	public void setIdActivo(Long idActivo) {
		this.idActivo = idActivo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAreaPertenencia() {
		return areaPertenencia;
	}

	public void setAreaPertenencia(String areaPertenencia) {
		this.areaPertenencia = areaPertenencia;
	}

	public Auditorias getAuditorias() {
		return auditorias;
	}

	public void setAuditorias(Auditorias auditorias) {
		this.auditorias = auditorias;
	}
	

}
