package com.tracking.track.servicios;


import java.util.*;

import com.tracking.track.bo.*;

public interface proyectoservice {
	
	public List<proyecto> buscarProyectos();
	public Long altaproyectos(proyecto	proyectos);
	public proyecto buscarproyectoid(Long id);
	public List<proyecto> buscarproyectos(String nombre);
	public void borrarproyectos(Long id);
	public void actualizarproyectos(proyecto proyectos);

}