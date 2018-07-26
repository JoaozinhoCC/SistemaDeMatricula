package com.SistemaDeMatricula.SistemaDeMatricula.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Materia")
public class Disciplina implements Serializable{
	
	private static final long serialVersionUID = 9012679095745610133L;
	
	@Id
	private Integer id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private int numeroDeCreditos;
	@Column(nullable = false)
	private int cargaHoraria;

	public int getNumeroDeCreditos() {
		return numeroDeCreditos;
	}

	public void setNumeroDeCreditos(int numeroDeCreditos) {
		this.numeroDeCreditos = numeroDeCreditos;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
