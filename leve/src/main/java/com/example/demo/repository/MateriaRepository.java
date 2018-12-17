package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.Materia;



public interface MateriaRepository extends JpaRepository<Materia, Integer> {

	Materia findByNome(String nome);

	void deleteByNome(String nome);


}
