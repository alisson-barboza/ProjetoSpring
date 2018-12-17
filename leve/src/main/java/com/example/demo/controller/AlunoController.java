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

import com.example.demo.model.Aluno;
import com.example.demo.service.AlunoService;



@RestController
@RequestMapping(path = "/aluno")
public class AlunoController {	
	
	@Autowired
	private AlunoService service; 
	
	@GetMapping(path = "/listar")
	public List<Aluno> listar(){
		return service.listar();
	}
	
	@GetMapping(path = "/buscar/{nome}")
	public Aluno buscarPorNome(@PathVariable String nome) {
		return service.buscarPorNome(nome);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/inserir")
	public ResponseEntity inserir(@RequestBody Aluno a) {
		return service.inserir(a);				
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path = "/alterar")
	public ResponseEntity alterar(@RequestBody Aluno a) {
		return service.inserir(a);
	}
	
	@DeleteMapping(path = "/remover/{nome}")
	public ResponseEntity remover(@PathVariable String nome) {
		return service.remover(nome);
	}
	
}
