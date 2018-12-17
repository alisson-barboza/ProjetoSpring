package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.Aluno;
import com.example.demo.model.Materia;

public class MatriculaDTO {
	private Aluno aluno;
	private List<Materia> materias;
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public List<Materia> getMaterias() {
		return materias;
	}
	public void setMateria(List<Materia> materias) {
		this.materias = materias;
	}
	
	
}
