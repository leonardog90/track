package com.tracking.track.bo;


import javax.persistence.*; 


@Entity
@Table(name = "estadotareas")
public class estado {

	@Id
	@GeneratedValue
	private Long idestado;
	private String nombreestado;
	
	//get&set//
	
	public long getIdestado() {
		return idestado;
	}
	public void setIdestado(long idestado) {
		this.idestado = idestado;
	}
	public String getStatustarea() {
		return nombreestado;
	}
	public void setStatustarea(String statustarea) {
		this.nombreestado = statustarea;
	}
	
	//Over

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idestado == null) ? 0 : idestado.hashCode());
		result = prime * result + ((nombreestado == null) ? 0 : nombreestado.hashCode());
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
		estado other = (estado) obj;
		if (idestado == null) {
			if (other.idestado != null)
				return false;
		} else if (!idestado.equals(other.idestado))
			return false;
		if (nombreestado == null) {
			if (other.nombreestado != null)
				return false;
		} else if (!nombreestado.equals(other.nombreestado))
			return false;
		return true;
	}
	
	
	
}
