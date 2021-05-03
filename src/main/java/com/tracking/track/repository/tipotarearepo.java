package com.tracking.track.repository;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tracking.track.bo.*;

@Repository
public interface tipotarearepo extends CrudRepository<tipotarea, Long> {

	@Query(value = "select tt from tipotarea tt")
	public List<tipotarea> buscattipotarea();
	
}