package com.tracking.track.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracking.track.servicios.tareaservice;
import com.tracking.track.servicios.tipotareaservice;


@RestController
@RequestMapping("/tipodetareas")
public class tipotarearest {

	@Autowired 
	private tipotareaservice tipotareaservice;
	
	@Autowired
	private tareaservice tareaService;

	public tipotareaservice getTipotareaservice() {
		return tipotareaservice;
	}

	public void setTipotareaservice(tipotareaservice tipotareaservice) {
		this.tipotareaservice = tipotareaservice;
	}

	public tareaservice getTareaService() {
		return tareaService;
	}

	public void setTareaService(tareaservice tareaService) {
		this.tareaService = tareaService;
	}
	
	
	
	//@GetMapping(path = "/{id}")
	//public ResponseEntity<tipotareaDTO> buscartipotareaporid(@PathVariable Long id) {
	//	tipotarea tipoDeTarea = tareaservice.buscartareaid(id);
	//	tipotareaDTO tipoDeTareaDTO = new tipotareaDTO(tipoDeTarea);
	//	return ResponseEntity.ok(tipoDeTareaDTO);
	//}
	
	//@GetMapping
	//public ResponseEntity<List<tipotareaDTO>> buscarTipoDeTarea(){
	
	//List<tipotarea> tipoDeTarea = tipotareaservice.buscartipotarea();
	//List<tipotareaDTO> tipotareaDTO = new ArrayList<tipotareaDTO>();
	//for(tipotarea t :  tipotarea) {
	//	tipoDeTareaDTO.add(new tipotareaDTO());
	//}
		
	//return ResponseEntity.ok(tipoDeTareaDTO);
	//}
	
	//	@PostMapping
	//public ResponseEntity<tipotareaDTO> nuevotipotarea(@Valid @RequestBody tipotareaDTO tipotareaDTO){	
	//tarea tarea = tareaService.buscartipotareaporid(tipoDeTareaDTO.getIdTareaAsignada());
	//if (tarea == null) {
	//	throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"SIN TAREA");
	//}
		
	//	tipotarea tipoDeTarea = new tipotarea();
	//	tipotarea.setNombre(tipotareaDTO.getNombre());
	//	tipotarea.setTipoestado(tarea);
				
	//	Long idGenerado = tipoDeTareaService.altaTipoDeTareas(tipoDeTarea);
	//	tipoDeTareaDTO.setIdTipoTarea(idGenerado);
	//	return ResponseEntity.status(HttpStatus.CREATED).body(tipoDeTareaDTO);
	//	}
		
	//@PutMapping(path = "/{id}")
	//public ResponseEntity actualizarTipoDeTarea(@PathVariable Long id, @RequestBody tipotareaDTO tipotareaDTO){
	//	tarea tarea = tareaService.buscartareaid(tipotareaDTO.setNombretarea());
	//	if (tarea == null) {
	//		throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"SIN TAREA");
	//	}
//			
	//	tipotarea tipotarea = tipotareaservice.buscartipotarea();
	//	tipotarea.setNombre(tipotareaDTO.getNombre());
	//	tipotarea.setTareaAsignada(tarea);
				
	//	tipotareaservice.actualizarTipoDeTareas(tarea);
		//	return ResponseEntity.status(HttpStatus.OK).build();
	//}
	
	//@DeleteMapping(path = "/{id}")
	//public ResponseEntity borrartipotarea(@PathVariable Long id){
	//tipotareaservice.borrartipotarea(id);
	//return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	
}