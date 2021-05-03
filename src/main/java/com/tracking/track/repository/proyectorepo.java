package com.tracking.track.repository;

import com.tracking.track.bo.*;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface proyectorepo extends CrudRepository<proyecto, Long> {
	
	@Query(value = "select p from proyecto p")
	public List<proyecto> buscarproyecto();
	
	@Query(value = "select p from proyecto p where p.nombre like %:nombre%")
	public List<proyecto> buscarroyectoid(@Param("nombre") String nombre);
	
}