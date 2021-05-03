package com.tracking.track.bo;



import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Comentarios")
public class comentario {

	@Id
	@GeneratedValue
	private Long id;
	private String descripcion;
	
	@ManyToOne
	private usuario creacionby;
	
	@OneToOne
	private tarea tareaasignada;
	
	private Date fecha = new Date();
	
	@ManyToMany
	private usuario usuario;
	@ManyToMany
	private tarea tareas;
	
	//G&S//


public void setId(Long id) {
	this.id = id;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public usuario getCreacionby() {
	return creacionby;
}
public void setCreacionby(usuario creacionby) {
	this.creacionby = creacionby;
}
public tarea getTareaasignada() {
	return tareaasignada;
}
public void setTareaasignada(tarea tareaasignada) {
	this.tareaasignada = tareaasignada;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}
public usuario getUsuario() {
	return usuario;
}
public void setUsuario(usuario usuario) {
	this.usuario = usuario;
}
public tarea getTareas() {
	return tareas;
}
public void setTareas(tarea tareas) {
	this.tareas = tareas;
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
	comentario other = (comentario) obj;
	if (descripcion == null) {
		if (other.descripcion != null)
			return false;
	} else if (!descripcion.equals(other.descripcion))
			return false;
	if (id == null) {
		if (other.id != null)
			return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
}
		public Long getId() {
	return id;
}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;




}}
		