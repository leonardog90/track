package com.tracking.track.rest;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracking.track.bo.proyecto;
import com.tracking.track.servicios.proyectoservice;
import com.tracking.track.servicios.usuarioservice;


@RestController
@RequestMapping("/proyectos")
public class proyectorest {

	@Autowired
	private proyectoservice proyectoService;
	
	@Autowired
	private usuarioservice usuarioservice;
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<proyectoDTO> recuperarProyectoPorId(@PathVariable Long id) {
		proyecto proyectos = proyectoService.buscarproyectoid(id);
		proyectoDTO proyectoDTO = new proyectoDTO(proyectos);
		return ResponseEntity.ok(proyectoDTO);
	}
	
	@GetMapping
	public ResponseEntity<List<proyectoDTO>> buscarProyectos(){
	
		List<proyecto> proyectos = proyectoService.buscarProyectos();
		List<proyectoDTO> proyectoDTO = new ArrayList<proyectoDTO>();
		for(proyecto p :  proyectos) {
			proyectoDTO.add(new proyectoDTO(p));
		}
		
		return ResponseEntity.ok(proyectoDTO);
	}

	public usuarioservice getUsuarioservice() {
		return usuarioservice;
	}

	public void setUsuarioservice(usuarioservice usuarioservice) {
		this.usuarioservice = usuarioservice;
	}
	
	//@PostMapping
	//public ResponseEntity<proyectoDTO> altaproyectos(@Value @RequestBody proyectoDTO proyectoDTO){
	//	usuario usuario = usuarioService.buscarUsuariosPorId(proyectoDTO.getIdUsuarioresponsable());
	//if (usuario == null) {
	//	throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"SIN USUARIO");
	//}}
	//
	//proyecto proyectos = new proyecto();
	
//	proyecto.setTotalhoras(proyectoDTO.getTotalhoras());
	//	proyecto.setNombre(proyectoDTO.getNombre());
//	proyecto.setIdUsuarioresponsable(usuario);
		
	//	Long idGenerado = proyectoService.altaProyectos(proyecto);
	//	proyectoDTO.setIdProyecto(idGenerado);
	//	return ResponseEntity.status(HttpStatus.CREATED).body(proyectoDTO);
	//}
	
	//@PutMapping(path = "/{id}")
	//public ResponseEntity actualizarProyectos(@PathVariable Long id, @RequestBody proyectoDTO proyectoDTO){
	//	usuario usuario = usuarioservice.buscarusuarioporid(proyectoDTO.getIdUsuarioresponsable());
	//	if (usuario == null) {
	//		throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"SIN ID/USUARIO");
	//	}
			
	//	proyecto proyectos = proyectoService.buscarproyectoid(id);
		//	proyectos.setNombre(proyectoDTO.getNombre());
	//	proyectos.setResponsable(usuario);
	//	proyectos.setTotalhoras(proyectoDTO.getTotalhoras());
		//	
	//proyectoService.actualizarproyectos(proyectos);
	//return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	//}
	
	//@DeleteMapping(path = "/{id}")
	//public ResponseEntity borrarproyecto(@PathVariable Long id){
	//	proyectoService.borrarproyectos(id);
	//	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
