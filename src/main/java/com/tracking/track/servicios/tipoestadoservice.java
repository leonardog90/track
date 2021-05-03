package com.tracking.track.servicios;

import java.util.List;

import com.tracking.track.bo.tipoestado;

public interface tipoestadoservice {
	
	public List<tipoestado> buscartipoestado();
	public Long altaestado(tipoestado	tipoDeEstado);
	public tipoestado tipoestadoid(Long id);
	public List<tipoestado> tipoestado(String nombre);
	public void borrartipoestado(Long id);
	public void actualizartipoestados(tipoestado tipoDeEstado);
	
}