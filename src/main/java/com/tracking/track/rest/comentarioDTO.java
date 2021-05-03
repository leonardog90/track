package com.tracking.track.rest;

import java.util.Date;

import com.tracking.track.bo.comentario;


public class comentarioDTO {

	private Long idComentario;
	private String descripcion;
	private Long idUsuariocreador;
	private Date creacion;
	private Long idTareaAsignada;
	
	public comentarioDTO() {}
	
	public comentarioDTO(comentario comentario) {
		this.idComentario = comentario.getId();
		this.descripcion = comentario.getDescripcion();
		this.creacion = comentario.getFecha();
		this.idTareaAsignada = comentario.getTareaasignada().getIdtarea();

	}

	public Date getCreacion() {
		return creacion;
	}

	public void setCreacion(Date creacion) {
		this.creacion = creacion;
	}

	public Long getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(Long idComentario) {
		this.idComentario = idComentario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdUsuarioCreador() {
		return idUsuariocreador;
	}

	public void setIdUsuarioCreador(Long idUsuarioCreador) {
		this.idUsuariocreador = idUsuarioCreador;
	}

	public Date getFechaCreacion() {
		return creacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.creacion = fechaCreacion;
	}

	public Long getIdTareaAsignada() {
		return idTareaAsignada;
	}

	public void setIdTareaAsignada(Long idTareaAsignada) {
		this.idTareaAsignada = idTareaAsignada;
	}
	
}