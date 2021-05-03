package com.tracking.track.rest;


import com.tracking.track.bo.proyecto;


public class proyectoDTO {

	private Long idproyecto;
	private String nombre;
	private Long idUsuarioresponsable;
	private Integer Totalhoras;
	
		
	public proyectoDTO(proyecto proyectos) {
		this.idproyecto = proyectos.getId();
		this.nombre = proyectos.getNombre();
		this.Totalhoras = proyectos.getTotalhoras();
		this.idUsuarioresponsable = proyectos.getResponsable().getId();
	}


	public Long getIdproyecto() {
		return idproyecto;
	}


	public void setIdproyecto(Long idproyecto) {
		this.idproyecto = idproyecto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Long getIdUsuarioresponsable() {
		return idUsuarioresponsable;
	}


	public void setIdUsuarioresponsable(Long idUsuarioresponsable) {
		this.idUsuarioresponsable = idUsuarioresponsable;
	}


	public Integer getTotalhoras() {
		return Totalhoras;
	}


	public void setTotalhoras(Integer totalhoras) {
		Totalhoras = totalhoras;
	}


	}
	
