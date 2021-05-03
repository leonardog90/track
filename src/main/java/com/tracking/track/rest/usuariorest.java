package com.tracking.track.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class usuariorest {

	//	@Autowired
	//	private usuarioservice usuarioService;
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<usuarioDTO> recuperarUsuarioPorId(@PathVariable Long id) {
		//usuario usuarios = usuarioservice.buscarusauarioporid(id);
		usuarioDTO usuarioDTO = new usuarioDTO();
		return ResponseEntity.ok(usuarioDTO);
	}
	
	//@GetMapping
	//public ResponseEntity<List<usuarioDTO>> buscarusuarios(){
	
		//List<usuario> usuario = usuarioService.buscarUsuarios();
		//	List<usuarioDTO> usuarioDTO = new ArrayList<usuarioDTO>();
		//for(usuario u :  usuario) {
		//	usuarioDTO.add(new usuarioDTO());
		//}
		
			//	return ResponseEntity.ok(usuarioDTO);
	//	}
	
//	@PostMapping
	//	public ResponseEntity<usuarioDTO> alta(@Valid @RequestBody usuarioDTO usuarioDTO){
	//usuario usuario = new usuario();
	//usuario.setNombre(usuarioDTO.getNombre());
	//usuario.setUser(usuarioDTO.getUser());
	//usuario.setApellido(usuarioDTO.getApellido());
		
	//Long idGenerado = usuarioService.altaUsuarios(usuario);
	//usuarioDTO.setIdUsuario(idGenerado);
	//return ResponseEntity.status(HttpStatus.CREATED).body(usuarioDTO);
	//}
	
	//@PutMapping(path = "/{id}")
	//public ResponseEntity actualizarUsuarios(@PathVariable Long id, @RequestBody usuarioDTO usuarioDTO){
	//usuario usuarios = usuarioService.buscarUsuariosPorId(id);
	//usuarios.setNombre(usuarioDTO.getNombre());
	//usuarioService.actualizarUsuarios(usuarios);
	//return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	//}
	
	//@DeleteMapping(path = "/{id}")
	//public ResponseEntity borrarUsuarios(@PathVariable Long id){
	//	usuarioService.borrarUsuarios(id);
	//	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
