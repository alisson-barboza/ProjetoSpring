package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MateriaService;
import com.example.demo.model.Materia;

@RestController
@RequestMapping("/materia")
public class MateriaController {

	
	@Autowired
	MateriaService service;
	
	@GetMapping(path = "/listar")
	public List<Materia> listar(){
		return service.listar();
	}
	
	@GetMapping(path = "/buscar/{nome}")
	public Materia buscar(@PathVariable String nome) {
		return service.buscar(nome);		
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/inserir")
	public ResponseEntity inserir(@RequestBody Materia m) {
		return service.inserir(m);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/alterar")
	public ResponseEntity alterar(@RequestBody Materia m) {
		return service.inserir(m);
	}
	
	@DeleteMapping(path = "/remover/{nome}")
	public ResponseEntity remover(@PathVariable String nome) {
		return service.remover(nome);
	}
}
