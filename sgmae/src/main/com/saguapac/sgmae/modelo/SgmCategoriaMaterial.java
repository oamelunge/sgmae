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
@Table(name="SGM_CATEGORIA_MATERIAL")
public class SgmCategoriaMaterial implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CATEGORIA")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCategoria;

	@Column(name="NOMBRE_CATEGORIA",length=70)
	private String nombreCategoria;
	
	
	@Column (name="DESCRIPCION", length=250)
	private String descripcion;
	
	@Embedded 
	private Auditorias auditorias;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="sgmCategoriaMaterial")
	private List<SgmMaterial> sgmMaterial;
	
	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setSgmMaterial(List<SgmMaterial> sgmMaterial) {
		this.sgmMaterial = sgmMaterial;
	}

	public List<SgmMaterial> getSgmMaterial() {
		return sgmMaterial;
	}
	
}