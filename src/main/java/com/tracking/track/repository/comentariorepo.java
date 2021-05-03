package com.tracking.track.repository;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tracking.track.bo.*;


@Repository
public interface comentariorepo extends CrudRepository<comentario, Long> {
	
	@Query(value = "select c from comentario c")
	public List<comentario> buscarcomentarios();
	
	@Query(value = "select c from comentario c where c.descripcion like %:descripcion%")
	public List<comentario> buscarcomentarios(@Param("descripcion") String comentario);

}