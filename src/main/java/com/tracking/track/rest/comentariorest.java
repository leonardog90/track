package com.tracking.track.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tracking.track.servicios.tareaservice;
import com.tracking.track.servicios.usuarioservice;


@RestController
@RequestMapping("/comentario")
public class comentariorest {

	//@Autowired
	//private comentarioser comentarioservice;
	
	@Autowired
	private usuarioservice usuarioservice;
	
	@Autowired
	private tareaservice tareaservice;

	//public comentarioser getComentarioservice() {
	//	return comentarioservice;
	//	}

	//public void setComentarioservice(comentarioser comentarioservice) {
	//		this.comentarioservice = comentarioservice;
	//	}

	public usuarioservice getUsuarioservice() {
		return usuarioservice;
	}

	public void setUsuarioservice(usuarioservice usuarioservice) {
		this.usuarioservice = usuarioservice;
	}

	public tareaservice getTareaservice() {
		return tareaservice;
	}

	public void setTareaservice(tareaservice tareaservice) {
		this.tareaservice = tareaservice;
	}

	
	
	//G&S//
	
	
	
	
	
	
	
	
	//@GetMapping(path = "/{id}")
	//public ResponseEntity<comentarioDTO> recuperarComentarioPorId(@Value @PathVariable Long id) {
	//com.tracking.track.bo.comentario comentarios = comentarioSer.getId(id);
	//comentarioDTO comentarioDTO = new comentarioDTO(comentarios);
	//return ResponseEntity.ok(comentarioDTO);
	//}
	
	//@GetMapping
	//public ResponseEntity<List<comentarioDTO>> buscarComentarios(){
	
	//List<com.tracking.track.bo.comentario> comentarios = comentarioService.buscarComentarios();
	//List<comentarioDTO> comentarioDTO = new ArrayList<comentarioDTO>();
	//for(comentario c :  comentarios) {
	//comentarioDTO.add(new comentarioDTO(c));
			//}
		
	//return ResponseEntity.ok(comentarioDTO);
	//}
	
	//@PostMapping(path = "/{idTarea}")
	//public ResponseEntity<comentarioDTO> nuevocomentario(@PathVariable(value = "idtarea") Long idtarea, @RequestBody comentarioDTO comentarioDTO){
	//	usuario usuario = usuarioService.buscarUsuariosPorId(comentarioDTO.getIdUsuarioCreador());
	//if (usuario == null) {
	//	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	//}
		
	//tarea tarea = tareaService.buscartareaid(comentarioDTO.getIdTareaAsignada());
	//if (tarea == null) {
	//	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	//}
		
		//	comentario comentarios = new Comentario();
		//comentarios.setDescripcion(comentarioDTO.getDescripcion());
		//comentarios.setCreadoPor(usuario);
		//comentarios.setTareaasignada(tarea);
		
	//	Long idGenerado = comentarioService.setCreacion(comentarios);
		//	comentarioDTO.setIdComentario(idGenerado);
		//comentarioDTO.setFechaCreacion(comentarios.getFecha());
		//return ResponseEntity.status(HttpStatus.CREATED).body(comentarioDTO);
	
		
	
	
}