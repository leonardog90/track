package com.tracking.track.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracking.track.servicios.tareaservice;
import com.tracking.track.servicios.tipoestadoservice;


@RestController
@RequestMapping("/tipodeestados")
public class tipoestadorest {

	@Autowired 
	private tipoestadoservice tipoestadoservice;
	
	@Autowired
	private tareaservice tareaservice;

	public tipoestadoservice getTipoestadoservice() {
		return tipoestadoservice;
	}

	public void setTipoestadoservice(tipoestadoservice tipoestadoservice) {
		this.tipoestadoservice = tipoestadoservice;
	}

	public tareaservice getTareaservice() {
		return tareaservice;
	}

	public void setTareaservice(tareaservice tareaservice) {
		this.tareaservice = tareaservice;
	}
	
	
	
	
	//@GetMapping(path = "/{id}")
	//public ResponseEntity<tipoestadoDTO> buscartipoestado(@PathVariable Long id) {
	//	tipoestado tipoDeEstado = tipoestadoservice.tipoestadoid(id);
	//	tipoestadoDTO tipoDeEstadoDTO = new tipoestadoDTO(tipoestado);
	//	return ResponseEntity.ok(tipoDeEstadoDTO);
	
	
	//@GetMapping
	//public ResponseEntity<List<TipoDeEstadoDTO>> buscarTipoDeEstados(){
	
//	List<tipoestado> tipoDeEstado = tipoDeEstadoService.tipoestadoid();
//	List<tipoestadoDTO> tipoDeEstadoDTO = new ArrayList<tipoestadoDTO>();
//	for(tipoestado e :  tipoDeEstado) {
//		tipoDeEstadoDTO.add(new tipoestadoDTO(e));
//	}
		
//	return ResponseEntity.ok(tipoDeEstadoDTO);
	
	
}