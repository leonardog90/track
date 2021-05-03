package com.tracking.track.rest;

public class tipotareaDTO {

	private Long tipotareaid;
	private String nombre;
	private Long idTareaAsignada;
		
	public tipotareaDTO() {}
	
//	public tipotareaDTO(tipotareaDTO tipotareaDTO) {
	//		this.tipotareaid = tipotarea.getId();
	//		this.nombre = tipotarea.getNombre();
	//	this.idtareaAsignada = tipotarea.getId();
	

	//}

	public Long getTipotareaid() {
		return tipotareaid;
	}

	public void setTipotareaid(Long tipotareaid) {
		this.tipotareaid = tipotareaid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdTareaAsignada() {
		return idTareaAsignada;
	}

	public void setIdTareaAsignada(Long idTareaAsignada) {
		this.idTareaAsignada = idTareaAsignada;
	}

}