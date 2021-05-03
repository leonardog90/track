package com.tracking.track.rest;

public class usuarioDTO {
	
	private Long idUsuario;
	private String Nombre;
	private String Apellido;
	private String User;
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	
	
}