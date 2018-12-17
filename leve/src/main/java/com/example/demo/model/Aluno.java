package com.example.demo.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Aluno {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	
	
	private String nome;
	private int idade;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "alunoMaterias",
		joinColumns = @JoinColumn(name = "alunoID", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name = "materiaID", referencedColumnName = "id"))
	private Set<Materia> materias = new HashSet<>();

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setMaterias(Set<Materia> materias) {
		this.materias = materias;
	}
	public Set<Materia> getMaterias(){
		return this.materias;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + idade;
		result = prime * result + ((materias == null) ? 0 : materias.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Aluno other = (Aluno) obj;
		if (id != other.id)
			return false;
		if (idade != other.idade)
			return false;
		if (materias == null) {
			if (other.materias != null)
				return false;
		} else if (!materias.equals(other.materias))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


}
