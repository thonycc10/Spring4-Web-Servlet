package com.springWeb.pojo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Admin")
public class Admin {
	@Id // con esto ya te olvidas de editar por cada uno de los atributos el @Column(por si los atributos se diferencian del DATATABLE)
	@GeneratedValue // solo indicas que por medio del PK se realizara todos los cambioss.
	private int idAd;
//	@Column(name="nombre")
	private String nombre;
	private String cargo;
	private Timestamp fechaCreacion;

	public Admin() {

	}

	public Admin(int idAd, String nombre, String cargo, Timestamp fechaCreacion) {
		this.idAd = idAd;
		this.nombre = nombre;
		this.cargo = cargo;
		this.fechaCreacion = fechaCreacion;
	}

	public Admin(String nombre, String cargo, Timestamp fechaCreacion) {
		this.nombre = nombre;
		this.cargo = cargo;
		this.fechaCreacion = fechaCreacion;
	}

	public int getIdAd() {
		return idAd;
	}

	public void setIdAd(int idAd) {
		this.idAd = idAd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "Administrador [idAd=" + idAd + ", nombre=" + nombre
				+ ", cargo=" + cargo + ", fechaCreacion=" + fechaCreacion + "]";
	}

}
