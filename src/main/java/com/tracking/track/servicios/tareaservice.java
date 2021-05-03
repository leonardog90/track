package com.tracking.track.servicios;


import java.util.*;

import com.tracking.track.bo.*;
import com.tracking.track.repository.tareaRepo;

public interface tareaservice {
	
	public tareaRepo buscarTareas();
	public Long altaTareas(tarea	tareas);
	public tarea buscartareaid(Long id);
	public List<tarea> buscartarea(String nombre);
	public void borrartareas(Long id);
	public void actualizartareas(tarea tareas);

}