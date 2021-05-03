package com.tracking.track.bo;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proyectos") 
public class proyecto {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, length =70)
	private String nombre;
	private Integer totalhoras;
	@ManyToOne
	private usuario responsable;
	@ManyToMany
	private List<usuario> usuario = new ArrayList<usuario>();
	@OneToMany(mappedBy = "proyectos")
	private List<tarea> tareas = new ArrayList<tarea>();
	@OneToMany
	@JoinColumn(name = "proyecto p")
	private List<tarea> tareasproyecto = new ArrayList<tarea>();
	@ManyToOne
	private usuario usuarioresponsable;
	@ManyToMany
	private List<usuario> usuarios = new ArrayList<usuario>();
	
	
	//G&S//

	
	public Long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getTotalhoras() {
		return totalhoras;
	}
	public void setTotalhoras(Integer totalhoras) {
		this.totalhoras = totalhoras;
	}
	public usuario getResponsable() {
		return responsable;
	}
	public void setResponsable(usuario responsable) {
		this.responsable = responsable;
	}
	public List<usuario> getUsuario() {
		return usuario;
	}
	public void setUsuario(List<usuario> usuario) {
		this.usuario = usuario;
	}
	public List<tarea> getTareas() {
		return tareas;
	}
	public void setTareas(List<tarea> tareas) {
		this.tareas = tareas;
	}
	public List<tarea> getTareasproyecto() {
		return tareasproyecto;
	}
	public void setTareasproyecto(List<tarea> tareasproyecto) {
		this.tareasproyecto = tareasproyecto;
	}
	public usuario getUsuarioresponsable() {
		return usuarioresponsable;
	}
	public void setUsuarioresponsable(usuario usuarioresponsable) {
		this.usuarioresponsable = usuarioresponsable;
	}
	public List<usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
		
	
	
	
}