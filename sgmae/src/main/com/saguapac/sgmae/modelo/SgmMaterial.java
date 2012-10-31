package com.saguapac.sgmae.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SGM_MATERIAL")
public class SgmMaterial {

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
	
	
	
}
