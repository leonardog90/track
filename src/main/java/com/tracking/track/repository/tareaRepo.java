package com.tracking.track.repository;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tracking.track.bo.*;

public interface tareaRepo extends CrudRepository<tarea, Long> {
	
	@Query(value = "select t from tarea t")
	public List<tarea> buscarTareas();
	
	@Query(value = "select t from tarea t where t.nombre like %:nombre%")
	public List<tarea> buscartareast(@Param("nombre") String nombre);

}