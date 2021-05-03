package com.tracking.track.servicios;


import java.util.*;

import com.tracking.track.bo.usuario;


public interface usuarioservice {
	
	public List<usuario> buscarUsuarios();
	public Long altaUsuarios(usuario usuarios);
	public usuario buscarUsuariosPorId(Long id);
	public List<usuario> buscarUsuarios(String nombre);
	public void borrarUsuarios(Long id);
	public void actualizarUsuarios(usuario usuarios);

}