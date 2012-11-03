package com.saguapac.sgmae.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.Length;

public class Auditorias implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public Auditorias() {

	}

	@Column(name = "ID_CIA")
	private Integer idCompania;
	
	@Column(name = "USUARIO_CREACION",length = 30)
	@Length(max = 30)
	private String usuarioCreacion;
	
	@Column(name = "USUARIO_MODIFICACION",length = 30)
	@Length(max = 30)
	private String usuarioModificacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_CREACION")
	private Date fechaCreacion;
	
	@Column(name = "IP_USUARIO",length = 30)
	@Length(max = 30)
	private String ipUsuario;

	
	public final Integer getIdCompania() {
		return idCompania;
	}

	public final void setIdCompania(Integer idCompania) {
		this.idCompania = idCompania;
	}
	
	
	public final String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public final void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	
	public final String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public final void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	
	public final Date getFechaCreacion() {
		return fechaCreacion;
	}

	public final void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	
	public final String getIpUsuario() {
		return ipUsuario;
	}

	public final void setIpUsuario(String ipUsuario) {
		this.ipUsuario = ipUsuario;
	}




}
