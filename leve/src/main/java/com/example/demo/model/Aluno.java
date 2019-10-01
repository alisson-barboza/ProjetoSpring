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
public class Aluno extends AbstractEntity<Integer> {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	
	/*
	Note: An nice tip to you is to let your code in only one language, cause makes it more understandable and	
	easier to read!
	*/
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


}
