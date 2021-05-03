package com.tracking.track.repository;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.tracking.track.bo.*;


@Repository
public interface tipoestadorepo extends CrudRepository<tipoestado, Long> {
	
	@Query(value = "select e from tipoestado e")
	public List<tipoestado> buscarTipoEstados();
	
	@Query(value = "select e from tipoestado e where e.nombre like %:nombre%")
	public List<tipoestado> buscarTipoEstados(@Param("nombre") String tipoDeEstado);
	
}