package com.tracking.track.servicios;

import com.tracking.track.bo.tipotarea;


public interface tipotareaservice {
	
	public tipotarea buscartipotarea();
	public Long nuevotipotarea(tipotarea tipoDeTarea);
	public tipotarea buscartipotareaporid(Long id);
	public void borrartipotarea(Long id);
	public void actualizartipotarea(tipotarea tipoDeTarea);
}