package com.tracking.track.bo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class usuario {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String nombre;
	
	@Column(nullable = false, length = 100)
	private String apellido;

	@Column (unique = true, nullable = false, length = 40)
	private String user;
	
	@ManyToOne
	private usuario usuarioresponsable;
	
	@ManyToMany(mappedBy = "usuarios")
	private List<tarea> tarea = new ArrayList<tarea>();
	
	
	@ManyToMany(mappedBy = "usuarios")
	private List<proyecto> proyectos = new ArrayList<proyecto>();



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	
	//G&S//


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public usuario getUsuarioresponsable() {
		return usuarioresponsable;
	}

	public void setUsuarioresponsable(usuario usuarioresponsable) {
		this.usuarioresponsable = usuarioresponsable;
	}

	public List<tarea> getTarea() {
		return tarea;
	}

	public void setTarea(List<tarea> tarea) {
		this.tarea = tarea;
	}

	public List<proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	
	//Over
	

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	usuario other = (usuario) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (nombre == null) {
		if (other.nombre != null)
			return false;
	} else if (!nombre.equals(other.nombre))
		return false;
	return true;
}}