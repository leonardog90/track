package com.tracking.track.bo;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Tareas") 
public class tarea {

	@Id
	@GeneratedValue
	private Long idtarea;
	private String idtareas;
	private Integer horatarea;
	@ManyToOne
	private tipotarea tipotarea;
	@ManyToOne
	private tipoestado tipoestado;
	@ManyToOne
	private proyecto proyecto;
	@ManyToMany
	private List<usuario> usuario = new ArrayList<usuario>();
	@OneToMany
	private List<comentario> comentario = new ArrayList<comentario>();
	
	//G&S//

	public Long getIdtarea() {
		return idtarea;
	}

	public void setIdtarea(Long idtarea) {
		this.idtarea = idtarea;
	}

	public String getIdtareas() {
		return idtareas;
	}

	public void setIdtareas(String idtareas) {
		this.idtareas = idtareas;
	}

	public Integer getHoratarea() {
		return horatarea;
	}

	public void setHoratarea(Integer horatarea) {
		this.horatarea = horatarea;
	}

	public tipotarea getTipotarea() {
		return tipotarea;
	}

	public void setTipotarea(tipotarea tipotarea) {
		this.tipotarea = tipotarea;
	}

	public tipoestado getTipoestado() {
		return tipoestado;
	}

	public void setTipoestado(tipoestado tipoestado) {
		this.tipoestado = tipoestado;
	}

	public proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public List<usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<usuario> usuario) {
		this.usuario = usuario;
	}

	public List<comentario> getComentario() {
		return comentario;
	}

	public void setComentario(List<comentario> comentario) {
		this.comentario = comentario;
	}

	
	//Over 
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idtarea == null) ? 0 : idtarea.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		tarea other = (tarea) obj;
		if (idtarea == null) {
			if (other.idtarea != null)
				return false;
		} else if (!idtarea.equals(other.idtarea))
			return false;
		return true;
	}
	}
	