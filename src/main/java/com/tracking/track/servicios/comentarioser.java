package com.tracking.track.servicios;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.boot.model.relational.Database;

import com.tracking.track.bo.tarea;

@Entity
@Table(name = "COMENTARIOS")
public class comentarioser<comentario> {

	@Id
	@GeneratedValue
	private Long id;
	
	private String descripcion;
	
	
	@OneToOne
	private tarea tareaasignada;

	@Column(name = "Creacion")
	@CreationTimestamp
	private Database Creacion;
		
	public Long getId(Long id2) {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public tarea getTareaasignada() {
		return tareaasignada;
	}

	public void setTareaasignada(tarea tareaasignada) {
		this.tareaasignada = tareaasignada;
	}

	public Database getCreacion() {
		return Creacion;
	}

	public void setCreacion(Database creacion) {
		Creacion = creacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		return result;
	}

	

	
}