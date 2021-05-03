package com.tracking.track.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tracking.track.bo.proyecto;
import com.tracking.track.servicios.tareaservice;
import com.tracking.track.servicios.tipoestadoservice;
import com.tracking.track.servicios.tipotareaservice;


@RestController
@RequestMapping("/tareas")
public class tarearest {

	@Autowired
	private tareaservice tareaservice;
	
	@Autowired
	private proyecto proyectoService;
	
	@Autowired 
	private tipoestadoservice tipoestadoservice;
	
	@Autowired 
	private tipotareaservice tipotareaservice;

	public tareaservice getTareaservice() {
		return tareaservice;
	}

	public void setTareaservice(tareaservice tareaservice) {
		this.tareaservice = tareaservice;
	}

	public proyecto getProyectoService() {
		return proyectoService;
	}

	public void setProyectoService(proyecto proyectoService) {
		this.proyectoService = proyectoService;
	}

	public tipoestadoservice getTipoestadoservice() {
		return tipoestadoservice;
	}

	public void setTipoestadoservice(tipoestadoservice tipoestadoservice) {
		this.tipoestadoservice = tipoestadoservice;
	}

	public tipotareaservice getTipotareaservice() {
		return tipotareaservice;
	}

	public void setTipotareaservice(tipotareaservice tipotareaservice) {
		this.tipotareaservice = tipotareaservice;
	}
	
	
}
	//	@GetMapping(path = "/{id}")
	//public ResponseEntity<tareaDTO> buscartareaporId(@Valid @PathVariable Long id) {
	//	tarea tarea = tareaService.buscartareaid(id);
		//	tareaDTO tareaDTO = new tareaDTO(tarea);
		//	return ResponseEntity.ok(tareaDTO);
	//	}
	
	//@GetMapping
	//	public ResponseEntity<List<tareaDTO>> buscartareas(){
	
		//	List<tarea> tarea = tareaservice.buscartareaid(Long);
		//	List<tareaDTO> tareaDTO = new ArrayList<tareaDTO>();
		//	for(tarea t :  tarea) {
		//		tareaDTO.add(new tareaDTO());
		//	}
		
		//	return ResponseEntity.ok(tareaDTO);
	
	
	//@PostMapping(path = "/{id}")
	//	public ResponseEntity<tarea> nuevatarea(@Valid @RequestBody tareaDTO tareaDTO){	
	//	proyecto proyecto = proyectoService.buscartarea(tareaDTO.getIdproyecto());
	//	if (proyecto == null) {
	//		throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"SIN PROYECTO");
	//}
		
		//	tarea tareas = new tarea();
		//	tarea.setIdproyecto(proyecto);
		//	tarea.setNombretarea(tareaDTO.getNombretarea());
	//	tarea.setHoratarea(tareaDTO.getHoratarea());
		

		//if (proyecto.getTotalhoras() < tareas.getHoratarea()) {
		//	throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"MAXIMO HORAS");
		
		
		//Long idGenerado = tareaService.nuevatarea(tareas);
		//tareaDTO.setIdtarea(idGenerado);
		//return ResponseEntity.status(HttpStatus.CREATED).body(tareaDTO);
	
	
			
	//@PutMapping(path = "/{id}")
	//public ResponseEntity actualizartarea(@PathVariable Long id, @RequestBody tareaDTO tareaDTO){
	//	proyecto proyecto = proyectoService.buscarproyecto(tareaDTO.getIdProyecto());		
	//	if (proyecto == null) {
	//		throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"SIN PROYECTO");
		
		
		//	tipoestado tipoDeEstado = tipoestadoservice.buscarproyecto(tareaDTO.getIdtarea());
		//	if (tipoDeEstado == null) {
		//	throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"SIN TIPO ESTADO");
		
		
		//tipotarea tipotarea = tipotareaservice.buscartipotareaporid(tareaDTO.getIdtarea());
		//if (tipotarea == null) {
		//	throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"SIN TIPO TAREA");
	//}
		
		//tarea tareas = tareaService.buscartareaid(id);
		//tarea.setNombretarea(tareaDTO.getNombretarea());
		//tarea.setHoratarea(tareaDTO.getHoratarea());
		//tarea.setIdEstado(tipoestado);
		//tarea.setIdtipotarea(tipotarea);
				
		//tareaService.actualizarTareas(tareas);
		//return ResponseEntity.status(HttpStatus.OK).build();
	
		//@DeleteMapping(path = "/{id}")
		//public ResponseEntity borrartarea(@PathVariable Long id){
		//	tareaService.borrartareas(id);
		//	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	
