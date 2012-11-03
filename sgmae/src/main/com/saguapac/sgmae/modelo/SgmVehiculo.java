package com.saguapac.sgmae.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="SGM_VEHICULO")
@DiscriminatorValue("P")
public class SgmVehiculo extends SgmActivo{

	@Column(name="PLACA",length=20)
	private String placa;
	@Column(name="TIPO",length=20)
	private String tipo;
	@Column(name="CILINDRADA",length=20)
	private String cilindrada;
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
}
