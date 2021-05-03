package com.tracking.track.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.tracking.track.bo.*;

@Repository
public interface usuariorepo extends CrudRepository<usuario, Long> {
	
	@Query(value = "select u from usuario u")
	public List<usuario> buscarusuarios();
	
	@Query(value = "select u from usuario u where u.nombre like %:nombre%")
	public List<usuario> buscarusuarios(@Param("nombre") String nombre);
	
	@Query(value = "select u from usuario u where u.alias like %:alias")
    public usuario buscaresuer(String alias);

	
}